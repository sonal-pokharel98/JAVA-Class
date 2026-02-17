public class Main11 {

    public static void main(String[] args) {

        Library lib = new Library();

        Book b1 = new Book("Java", "James Gosling", "101");
        Book b2 = new Book("Python", "Guido van Rossum", "102");
        Book b3 = new Book("C++", "Bjarne Stroustrup", "103");

        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);

        System.out.println("All Books in Library:");
        lib.displayAllBooks();

        System.out.println("Searching for Python:");
        Book result = lib.searchByTitle("Python");

        if (result != null) {
            System.out.println("Book Found:");
            result.display();
        } else {
            System.out.println("Book not found.");
        }
    }
}
