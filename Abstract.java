// Abstract Class In java

class Parent{
    void m1(){
        System.out.println("I am Parent");
    }
}

class Child1 extends Parent{
    void m1(){
        System.out.println("I am Child 1");
    }
}
class Child2 extends Parent{
    void m1(){
        System.out.println("I am Child 2");
    }
}
public class Abstract {
    public static void main(String[] args) {
        System.out.println("Abstract Class");
        Parent p = new Parent();
        p.m1();
        Child1 ch1 = new Child1();
        ch1.m1();
        Child2 ch2 = new Child2();
        ch2.m1(); 
    }
}
