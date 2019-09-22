package test2;

public class nursery_for{
	public static void main(String[] args) {
int i;
for(i=99;i>=0;i--){
	if(i>2) {
System.out.println(i+" bottles of beer on the wall,"+i+" bottles of the beer.\n");
System.out.println("Take one down.\n");
System.out.println("Pass it around.\n");
System.out.println((i-1)+" bottles of beer on the wall.\n");}
else if(i==2) {
	System.out.println(i+ "bottles of beer on the wall,"+i+" bottles of the beer.\n");
	System.out.println("Take one down.\n");
	System.out.println("Pass it around.\n");
	System.out.println((i-1)+ " bottle of beer on the wall.\n");}
else if(i==1) {
	System.out.println(i+" bottle of beer on the wall,"+i+" bottle of the beer.\n");
	System.out.println("Take one down.\n");
	System.out.println("Pass it around.\n");
	System.out.println((i-1)+" bottle of beer on the wall.\n");}
else {
	System.out.println("No more bottles on the wall");
} 
		}
	}
}