
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean Equals(Object a) {
        if (!(a instanceof Book)) {
            return false;
        }
        Book castBook = (Book) a;
        if (this.getName().compareTo(castBook.getName()) == 0 && this.getPublicationYear() == castBook.getPublicationYear()) {
            return true;
        }

        return false;
    }

}
