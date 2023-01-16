public class Book {
    private String title;
    private final Author author;
    private int publishingYear;

    public Book(String title, Author author, int publishingYear) {
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public Author getAuthor() {
        return author;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public static void  display(Book book) {
        System.out.println("Автор: " + book.getAuthor().getName() + " " + book.getAuthor().getSurname());
        System.out.println("Название книги: " + book.getTitle());
        System.out.println("Дата издания: " + book.getPublishingYear());
    }

    @Override
    public String toString() {
        return  "Название книги: "+ title + ", автор:  " + author + ", год публикации: " + publishingYear ;
    }
}

