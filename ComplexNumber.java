package test5;

public class ComplexNumber {
		 int shi,xu;
		 public ComplexNumber(int n,int ni){
		 shi = n;
		 xu = ni;
		 }
		 public void ComplexShow(){
		 String output = "";
		 output+=shi;
		 if(xu>=0){
		 output+="+";
		 }
		 output+=xu;
		 output+="i";
		 System.out.println(output);
		 }
		 public void ComplexShow1(){
		 String output = "";
		 output+=shi;
		 if(xu>=0){
		 output+="+";
		 }
		 output+=xu;
		 output+="i";
		 System.out.print(output);
		 }
		 public static void ComplexAdd(ComplexNumber x1,ComplexNumber x2){
		 ComplexNumber cn = new ComplexNumber(0, 0);
		 cn.shi = x1.shi + x2.shi;
		 cn.xu = x1.xu + x2.xu;
		 cn.ComplexShow();
		 }
		 public static void ComplexMinus(ComplexNumber x1,ComplexNumber x2){
		 ComplexNumber cn = new ComplexNumber(0, 0);
		 cn.shi = x1.shi - x2.shi;
		 cn.xu = x1.xu - x2.xu;
		 cn.ComplexShow();
		 }
		 public static void ComplexMultiply(ComplexNumber x1,ComplexNumber x2){
		 ComplexNumber cn = new ComplexNumber(0, 0);
		 cn.shi = x1.shi * x2.shi - x1.xu * x2.xu;
		 cn.xu = x1.xu * x2.shi + x2.xu * x1.shi;
		 cn.ComplexShow();
		 }
		 public static void ComplexDivide(ComplexNumber x1,ComplexNumber x2){
		 ComplexNumber x2_gong = new ComplexNumber(x2.shi,0-x2.xu);
		 ComplexNumber cn = new ComplexNumber(0, 0);
		 cn.shi = x1.shi * x2_gong.shi - x1.xu * x2_gong.xu;
		 cn.xu = x1.xu * x2_gong.shi + x2_gong.xu * x1.shi;
		 int fenMu = x2.shi * x2.shi + x2.xu * x2.xu;
		 
		 if(fenMu!=0){
		 System.out.print("(");
		 cn.ComplexShow1();
		 System.out.print(")");
		 System.out.println("/"+fenMu);
		 }
		 else
		 System.out.println("分母为零，无法相除");
		 
		 }
		 public static void main(String[] args) {
		 ComplexNumber cn = new ComplexNumber(-1, -1);
		 cn.ComplexShow();
		 ComplexNumber c1 = new ComplexNumber(-1, -1);
		 ComplexNumber c2 = new ComplexNumber(1, 1);
		 System.out.print("加:");
		 ComplexAdd(c1, c2);
		 System.out.print("减:");
		 ComplexMinus(c1, c2);
		 System.out.print("乘:");
		 ComplexMultiply(c1, c2);
		 System.out.print("除:");
		 ComplexDivide(c1, c2);
		 }
}

