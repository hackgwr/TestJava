import java.util.Objects;

public class TestObject {
    public static void main(String[] args) {
        Employee e1 = new Employee(1001,"gong");
        Employee e2 = new Employee(1001,"wen");
//        e1.name = "gong";
//        e1.id = 1001;
        System.out.println(e1.toString());
        System.out.println(e1.id==e2.id);
        System.out.println(e1.name==e2.name);
        System.out.println(e1.equals(e2));
        System.out.println(e1==e2);
    }
}

class Employee extends Object{
    int id;
    String name;

    public Employee(int id,String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "雇员编号"  +id+",姓名"+name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    
}