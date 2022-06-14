package classroomFive.pirmaisUzdevums;

public class Main {
    public static void main(String[] args) {
     Author JkRowling = new Author("JK Rowling", "JK@gmail.com", 'F');
     Author Rainis = new Author("Jānis Rainis", "JR@gmail.com", 'M');

     Cena cenaViens = new Cena(21.99, 'e');
     Cena cenaDivi = new Cena(9.99, '$');

     Cena cenaTris = new Cena(9.99, '$');

     Book bookOne = new Book("Harry Potter", JkRowling, new Cena(9.99, '$'));
     Book bookTwo = new Book("Dzeja", Rainis, new Cena(21.99, 'e'));

//     Book bookThree = new Book("Harry Potter", JkRowling, new Cena(9.99,'$'));

        System.out.println("Grāmata");
        System.out.println(bookTwo.toString());
        bookTwo.price.discount(30);
        System.out.println(bookTwo.toString());

        System.out.println(bookOne.toString());




    }
}
