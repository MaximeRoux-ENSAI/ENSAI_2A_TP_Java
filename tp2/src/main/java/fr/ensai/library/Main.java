package fr.ensai.library;

public class Main {

        public static void main(String[] args) {

                String bookspath = "books.csv";
                Magazine mag1 = new Magazine("L'informatique la redécouverte de Java", 2026, 42, "D1F89GFS5F15ZDF25",
                                "ENSAI_Mag10");
                Magazine mag2 = new Magazine("Trouver son stage en 3 étapes", 2026, 1, "D1F8F1D2563DF45S5F15ZDF25",
                                "ENSAI_Mag11");

                Library library = new Library("ENSAI Library");
                library.loadBooksFromCSV(bookspath);

                library.addItem(mag1);
                library.addItem(mag2);
                
                library.displayItem();

                Author tolkien = new Author("J.R.R. Tolkien", 81, "UK");

                Book fellowshipOfTheRing = new Book(
                                "978-0-618-26025-6",
                                "The Fellowship of the Ring",
                                tolkien,
                                1954,
                                423);

                System.out.println(fellowshipOfTheRing);
        }
}