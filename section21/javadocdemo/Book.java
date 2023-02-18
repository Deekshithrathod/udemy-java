package section21.javadocdemo;
/**
 * @author deekshith
 * @version 1.0.1
 * @since 2022
 */


/**
 * Class for Library Books
 * */
public class Book {
    /**
     * @value assigned 25 as default value
     * */
    static int val = 25;

    /**
     * Constructor
     * @param s name of the book
     * */
    public Book(String s) {
    }


    /**
     * Issue a book to student
     * @param roll roll number of the student
     * @throws Exception in case the program could not issue the book to student
     * */
    public void issue(int roll) throws Exception {
    }

    /**
     * Checks if the book is available
     * @param str name of the book
     * @return if the book is available returns true else false
     * */
    public boolean isAvailable(String str) {
        return true;
    }

    /**
     * Returns the name of the book
     * @param id id of the book
     * @return returns the name of the book
     * */
    public String getName(int id) {
        return "";
    }
}
