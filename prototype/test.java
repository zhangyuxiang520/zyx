package prototype;

public class test {


    public static void main(String[] args) {

        Resume a = new Resume("小李子");

        a.setPersonInfo("2.16", "男", "XX大学");

        a.setWorkExperience("2012.09.05", "XX科技有限公司");

       

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


