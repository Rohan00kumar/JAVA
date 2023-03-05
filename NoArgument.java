public class NoArgument {
    int rollno;
    String name;
    String branch;

    NoArgument() {
        rollno = 12;
        name = "Rohan";
        branch = "CSEAI";
    }
}

class MainEx {
    public static void main(String[] args) {
        NoArgument n = new NoArgument();
        System.out.println("rollno = " + n.rollno);
        System.out.println("name = " + n.name);
        System.out.println("branch = " + n.branch);
    }
}
