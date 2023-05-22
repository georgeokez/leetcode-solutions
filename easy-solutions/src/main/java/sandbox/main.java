package sandbox;

public class main {
    public static void main(String [] args) {
        Object animal1 = new Dog();
        Object animal2 = new Cat();

        ((Dog) animal1).moving();
        ((Cat)animal2).eating();
    }
}
