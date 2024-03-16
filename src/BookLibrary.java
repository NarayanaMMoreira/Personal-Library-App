import java.util.ArrayList;

public class BookLibrary {
    private final ArrayList<Books> bookList;

    public BookLibrary() {
        bookList = new ArrayList<>();
    }

    public void addBook(Books book) {
        bookList.add(book);
        System.out.println("Book successfully added to the library!");
    }

    public void removeBook(Books book) {
        if (bookList.remove(book)) {
            System.out.println("Book successfully removed from the library!");
        }
    }

    public int bookEmpty() {
        int x =1;
        if (bookList.isEmpty()){
            System.out.println("You don't have any books yet!");
            x = 0;
        }
        return (x);
    }
    public void removeBookByTitle (String title){
        boolean bookFound = false;

        for (Books book : bookList) {
            if (book.getTitle().equalsIgnoreCase(title)){
                removeBook(book);
                bookFound = true;
                break;
            }
        }
        if (!bookFound) {
            System.out.println("Book not found in the library!");
        }
    }

    public void printInformations() {
        int i = 1;
        for (Books book : bookList) {
            System.out.println(i + " - " + book.getTitle());
            i++;
        }
    }
}
