package Visitor;

public class GladiolusConcreteElement implements FlowerElement {

	 @Override
     public void accept(final Visitor visitor)
     {
        visitor.visit(this);
    }
}
