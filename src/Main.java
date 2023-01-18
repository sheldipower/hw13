public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Jane", "Austine");
        Author author2 = new Author("Karen", "Pryor");
        Book book1 = new Book("Feeling and sensitiviti", author1, 2016);
        Book book2 = new Book("Don't growl at the dog", author2, 2022);
        System.out.println("book1 = " + book1);
        System.out.println("book2 = " + book2);

    }
}