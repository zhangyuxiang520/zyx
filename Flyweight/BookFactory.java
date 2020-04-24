package Flyweight;

	import java.util.EnumMap;
	import java.util.Map;
	 
	public class BookFactory {
	 
	    public enum BookType {
	        PYTHON, JAVASCRIPT, KOTLIN
	    }
	 
	    private final Map<BookType, Book> shelf;
	 
	    public BookFactory() {
	        shelf = new EnumMap<>(BookType.class);
	    }
	 
	    
	    public Book getBook(BookType type) {
	        Book book = shelf.get(type);
	        if (book == null) {
	            switch (type) {
	                case PYTHON:
	                    book = new PythonCookBook();
	                    shelf.put(type, book);
	                    break;
	                case JAVASCRIPT:
	                    book = new HeadFirstJavaScript();
	                    shelf.put(type, book);
	                    break;
	                case KOTLIN:
	                    book = new KotlinInAction();
	                    shelf.put(type, book);
	                    break;
	                default:
	                    break;
	            }
	        }
	        return book;
	    }
	}

