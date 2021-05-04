package $18_overriding_static;


public class App {
    public static void main(String[] args) {
        Child.run();
        Parent.run();
        
        Parent p =new Parent();
        System.out.println(p.s);
        
        Child c =new Child();
        System.out.println(c.s);
        
        Parent pc = new Child();
        System.out.println(pc.s);
    }
}
