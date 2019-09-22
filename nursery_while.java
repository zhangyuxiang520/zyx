package test2;

public class nursery_while {
	public static void main(String[] args) {
		int N=99;
		while(N>=0) {
			if(N>2) {
				System.out.println(N+" bottles of beer on the wall,"+N+" bottles of the beer.\n");
				System.out.println("Take one down.\n");
				System.out.println("Pass it around.\n");
				System.out.println((N-1)+" bottles of beer on the wall.\n");
				N--;}	
			else if(N==2) {
					System.out.println(N+" bottles of beer on the wall,"+N+" bottles of the beer.\n");
					System.out.println("Take one down.\n");
					System.out.println("Pass it around.\n");
					System.out.println((N-1)+" bottle of beer on the wall.\n");
					N--;}
			else if(N==1) {
						System.out.println(N+" bottle of beer on the wall,"+N+" bottle of the beer.\n");
						System.out.println("Take one down.\n");
						System.out.println("Pass it around.\n");
						System.out.println((N-1)+" bottle of beer on the wall.\n");
						N--;}
			else {
							System.out.println("No more bottles on the wall");
							N--;}
						}
					}
				}


