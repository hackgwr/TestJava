import javax.swing.plaf.PanelUI;

public class TestStatic {
    int id;
    static String company = "公司";
    static void printlnCompany(){
        System.out.println(company);
//        System.out.println(id);

    }

    void loginCompany(){
        System.out.println("打印公司");


    }



    public static void main(String[] args) {
        printlnCompany();
        TestStatic.printlnCompany();
        TestStatic t1 = new TestStatic();
        t1.loginCompany();


    }
}
