package prototype;

public class test {


    public static void main(String[] args) {

        Resume a = new Resume("С����");

        a.setPersonInfo("2.16", "��", "XX��ѧ");

        a.setWorkExperience("2012.09.05", "XX�Ƽ����޹�˾");

       

        Resume b = (Resume) a.clone();

        

        System.out.println("----------------A--------------");

        a.display();

        System.out.println("----------------B--------------");

        b.display();

   

        System.out.print("A==B?");

        System.out.println( a == b);

      
        System.out.print("A.getClass()==B.getClass()?");

        System.out.println(a.getClass() == b.getClass());

    }
}


