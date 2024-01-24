public class TestThis {
    int id;
    String name;
    String pwd;
    int uid;

    public TestThis(){

    }

    public TestThis(int id,String name,String pwd){
        System.out.println("正在初始化的对象；"+this);
        this.id = id;
        this.name= name;
        this.pwd = pwd;

    }

    public TestThis(int id,String name,String pwd,int uid){
        this(id,name,pwd);
        this.uid = uid;
    }

    public void login(){
        System.out.println("要登陆的ID为:"+this.id+"\t要登陆的名称是："+this.name+"\t要登陆的密码是："+this.pwd+"\t要登陆的UID是："+this.uid);

    }

    public static void main(String[] args) {
        TestThis p1 = new TestThis(123,"gong","1234");
        p1.login();

        TestThis p2 = new TestThis(123,"gong","1234",1234455);
        p2.login();

    }
}
