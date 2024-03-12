import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookLibrary library = new BookLibrary();
        int validation;
        System.out.println("Welcome to your personal library!");
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("\nWhat do you want to do? (choose number)");
            System.out.println("1-Add book\n2-Remove book\n3-List all your books\n4-Close app");
            validation = scanner.nextInt();
            scanner.nextLine();
            switch (validation) {
                case 1:
                    System.out.println("Enter the following data: ");
                    System.out.println("Tittle: ");
                    String tittle = scanner.nextLine();
                    System.out.println("Author: ");
                    String author = scanner.nextLine();
                    System.out.println("Genre: ");
                    String genre = scanner.nextLine();
                    System.out.println("Year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();

                    Books book = new Books(tittle, author, year, genre);
                    library.addBook(book);
                    break;

                case 2:
                    System.out.println("Enter the book title you want to remove: ");
                    String titleToRemove = scanner.nextLine();
                    library.removeBookByTitle(titleToRemove);
                    break;

                case 3:
                    library.printInformations();
                    break;

                case 4:
                    break;
            }
        } while (validation != 4);
    }
}