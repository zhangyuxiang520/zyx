package Iterator;

public class CatGroup implements Aggregate {

	 private int last;
	    private Cat[] cats;
	 
	    public CatGroup(int maxsize) {
	        this.cats = new Cat[maxsize];
	    }
	 
	    public Cat getByIndex(int index) {
	        return cats[index];
	    }
	 
	    public void append(Cat cat) {
	        cats[last++] = cat;
	    }
	 
	    public int getLength() {
	        return last;
	    }
	 
	    @Override
	    public Iterator iterator() {
	        return new CatGroupIterator(this);
	    }
}
