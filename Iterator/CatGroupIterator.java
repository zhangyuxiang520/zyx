package Iterator;

public class CatGroupIterator implements Iterator {

	private int index;
    private CatGroup catGroup;
 
    public CatGroupIterator(CatGroup catGroup) {
        this.catGroup = catGroup;
        this.index = 0;
    }
 
    @Override
    public boolean hasNext() {
        return index < catGroup.getLength();
    }
 
    @Override
    public Object next() {
        return catGroup.getByIndex(index++);
    }
}
