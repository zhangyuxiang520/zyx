package Visitor;

public class ChrysanthemumConreteElement implements FlowerElement {

	@Override
    public void accept(final Visitor visitor)
    {
       visitor.visit(this);
   }
}
