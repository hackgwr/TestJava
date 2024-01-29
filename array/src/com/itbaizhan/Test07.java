package com.itbaizhan;
public class Test07 {
    public static void main(String[] args) {
        Emp e1 = new Emp( 1001,"gong",18,"教师","2019-02-14");
        Emp e2 = new Emp( 1002,"wen",19,"助教","2019-10-10");
        Emp e3 = new Emp( 1003,"rui",20,"班主任","2019-05-05");

//        Emp[] employees = new Emp[]{e1,e2,e3};//同下
        Emp[] employees = {e1,e2,e3};
        for (Emp temp:employees){
            System.out.println(temp);//处理这里之前要进行对toString方法进行重写,否则输出为地址
//            System.out.println(
//                    temp.getId()+temp.getName()+temp.getAge()+temp.getJob()+temp.getHiredate()
//                    );//拼接


        }
    }
}

class Emp{
    private int id;
    private String name;
    private int age;
    private String job;
    private String hiredate;

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", hiredate='" + hiredate + '\'' +
                '}';
    }//格式随意修改

    public Emp(int id, String name, int age, String job, String hiredate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.job = job;
        this.hiredate = hiredate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }
}
