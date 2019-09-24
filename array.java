package test2;

public class array {
	public static void main(String[] args) 
	{
		int a,b,c;
		String[] article = {"a","the","one"};
		String[] noun = {"boy","dog","bird"};
		String[] verb = {"pjumed","ran","flew"}; 
		 a=(int)(Math.random()*3);
		 b=(int)(Math.random()*3);
		 c=(int)(Math.random()*3);
		System.out.println(article[a]+" "+noun[b]+" "+verb[c]);
		}
}
