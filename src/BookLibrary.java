import java.util.ArrayList;

public class BookLibrary {
    private ArrayList<Books> bookList;

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
        } else {
            System.out.println("Book not found in the library!");
        }
    }


    public void removeBookByTitle (String title){
        for (Books book : bookList) {
            if (book.getTitle().equalsIgnoreCase(title)){
                removeBook(book);
                break;
            }
        }
    }

    public void printInformations(){
        int i = 1;
        for (Books book : bookList){
            System.out.println(i + " - " + book.getTitle());
            i++;
        }
    }
}
