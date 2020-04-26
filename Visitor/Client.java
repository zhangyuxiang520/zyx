package Visitor;

public class Client {

	public static void main(final String[] args)
    {
       final ObjectStructure os = new ObjectStructure();
       os.addElement(new GladiolusConcreteElement());
       os.addElement(new ChrysanthemumConreteElement());
       final GladiolusVisitor gVisitor = new GladiolusVisitor();
      
       os.accept(gVisitor);
   }
}
