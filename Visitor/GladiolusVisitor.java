package Visitor;

public class GladiolusVisitor implements Visitor {

	@Override
    public void visit(final GladiolusConcreteElement gladiolus)
    {
       System.out.println(this.getClass().getSimpleName() + " access " + gladiolus.getClass().getSimpleName());
   }
   @Override
    public void visit(final ChrysanthemumConreteElement chrysanthemum)
    {
       System.out.println(this.getClass().getSimpleName() + " access " + chrysanthemum.getClass().getSimpleName());
   }
}
