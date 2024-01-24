public class User {
    int id;
    String uname;
    String pwd;

    double idea;

    User(){

    }

    public User(int _id){
        id = _id;

    }

    public User(int _id,double _idea){
        id = _id;
        idea = _idea;

    }

    public User(int _id,String _uname,String _pwd,double _idea){
        id = _id;
        uname = _uname;
        pwd = _pwd;
        idea = _idea;

    }

    public static void main(String[] args) {
        User a = new User();
        User b = new User(100);
        User c = new User(1001,000.1);
        User d = new User(1020,"STA","stb",100);
        User e = new User(1000,1000);
    }


}
