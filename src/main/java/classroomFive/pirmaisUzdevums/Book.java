package classroomFive.pirmaisUzdevums;


//        Klase:
//        Book
//        name : String
//        author : Author
//        price: double

public class Book {
    public String name;
    public Author author;
    public Cena price;

    public Book(String name, Author author, Cena price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", price=" + price +
                '}';
    }
}