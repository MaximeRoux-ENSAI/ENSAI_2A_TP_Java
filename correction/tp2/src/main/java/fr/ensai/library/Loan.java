package fr.ensai.library;

import java.util.Date;

public class Loan {
    // Attributes
    private Item item;
    private Student borrower;
    private Date startDate;
    private Date returnDate;

<<<<<<< HEAD
    // Constructor
=======
    /**
     * Constructs a new Loan object.
     */
>>>>>>> dd8a231b0c3fe8d317f6cb28620f2bd9867f27de
    public Loan(Item item, Student borrower, Date startDate) {
        this.item = item;
        this.borrower = borrower;
        this.startDate = startDate;
        this.returnDate = null;
    }

    public Item getItem() {
        return this.item;
    }

    public Student getBorrower() {
        return this.borrower;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        if (returnDate != null) {
            return "Item '" + this.item.getTitle() + "' borrowed by " + this.borrower + " from " + this.startDate
                    + " to " + this.returnDate
                    + ".";
        } else {
            return "Item '" + this.item.getTitle() + "' borrowed by " + this.borrower + " since " + this.startDate
                    + ".";
        }
=======
        String pattern = (returnDate != null) 
            ? "Item '%s' borrowed by %s from %s to %s." 
            : "Item '%s' borrowed by %s since %s.";
    
        return String.format(pattern, this.item.getTitle(), this.borrower, this.startDate, this.returnDate);
>>>>>>> dd8a231b0c3fe8d317f6cb28620f2bd9867f27de
    }

}
