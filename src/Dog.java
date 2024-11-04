public class Dog extends Animals {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("🐕");
    }
}
