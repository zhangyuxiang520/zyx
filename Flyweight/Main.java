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
 
        // ��ı��һ��, ˵���鸴����, ������ÿ�ζ���һ���µ�
    }
}
