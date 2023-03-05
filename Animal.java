public class Animal {
    void sound() {
        System.out.println("Hmm...");
    }
}

class dog extends Animal {
    void sound() {
        System.out.println("bark");
    }
}

class cat extends Animal {
    void sound() {
        System.out.println("mew");
    }

}

class Main{
    public static void main(String[] args) {
        Animal m = new Animal();
        Animal d = new dog();
        Animal c = new cat();

        m.sound();
        d.sound();
        c.sound();
    }
}