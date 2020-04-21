package build;

public class ConcreteBuilder implements Builder {

	 private Product product;
	    
	    public ConcreteBuilder(){
	        product=new Product();
	    }
	    
	    @Override
	    public void buildBasic() {
	        product.setBasic("��û���");
	    }

	    @Override
	    public void buildWalls() {
	        product.setWall("��ǽ");
	    }

	    @Override
	    public void roofed() {
	        product.setRoofed("�ⶥ��");
	    }

	    @Override
	    public Product buildProduct() {
	        return product;
	    }

}
