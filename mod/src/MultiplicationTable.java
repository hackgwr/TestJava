//简单的小程序，九九乘法表嵌套
public class MultiplicationTable {
    public static void main(String[] args) {
        Test01();
    }

    public static void Test01(){
        for(int i = 1;i <= 9;i++){
            for (int j = 1;j <= i;j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
