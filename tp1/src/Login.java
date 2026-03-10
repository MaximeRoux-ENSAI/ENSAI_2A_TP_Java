import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        HashMap<String, String> userDatabase = loadUserDatabase("../data/user_hashpwd.csv");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Entrer un username : ");
            String username = scanner.nextLine();

            if (!userDatabase.containsKey(username)) {
                System.out.println("Erreur : utilisateur introuvable");
                continue;
            }

            int nbEssai = 3;

            while (nbEssai > 0) {
                System.out.println("Entrer votre mot de passe :");
                String mdp = scanner.nextLine();
                String hashMdp = hashPassword(mdp);

                if (hashMdp.equals(userDatabase.get(username))) {
                    System.out.println("Connexion réussie !");
                    scanner.close();
                    return;
                }
                nbEssai--;
                if (nbEssai > 0) {
                    System.out.println("Mot de passe incorrect. Il vous reste " + nbEssai + " essais.");
                } else {
                    System.out.println("Mot de passe incorrect, réessayer du début");
                }

            }
        }
        }

    }

    /**
     * Loads a user database from a CSV file.
     * The CSV file is expected to have two columns: username and hashed password.
     * 
     * @param filename The path to the CSV file containing user data.
     * @return A HashMap where keys are usernames and values are hashed passwords.
     * 
     * @throws IOException If an error occurs while reading the file.
     */
    public static HashMap<String, String> loadUserDatabase(String filename) {
        HashMap<String, String> userDatabase = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            br.readLine(); // Skip header
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    userDatabase.put(parts[0].trim(), parts[1].trim());
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading file: " + e.getMessage());
        }
        return userDatabase;
    }

    public static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(password.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashedBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1)
                    hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error hashing password", e);
        }
    }
}
