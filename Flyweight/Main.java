package Flyweight;

public class Main {

	public static void main(String[] args) {
        BookFactory bookFactory = new BookFactory();
 
        bookFactory.getBook(BookFactory.BookType.JAVASCRIPT).read();
        bookFactory.getBook(BookFactory.BookType.JAVASCRIPT).read();
 
        bookFactory.getBook(BookFactory.BookType.PYTHON).read();
        bookFactory.getBook(BookFactory.BookType.PYTHON).read();
 
        bookFactory.getBook(BookFactory.BookType.KOTLIN).read();
        bookFactory.getBook(BookFactory.BookType.KOTLIN).read();
        bookFactory.getBook(BookFactory.BookType.KOTLIN).read();
 
        // 书的编号一样, 说明书复用了, 而不是每次都买一个新的
    }
}
