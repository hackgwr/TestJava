public class Person {
    String name;
    int age;

    public void show(){
        System.out.println("姓名；" +name +"\t年龄；" +age);
    }

    Person(String _name,int _age){
        name = _name;
        age = _age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("gong",100);
//        p1.name = "gong";
//        p1.age = 100;
        p1.show();


    }
}
