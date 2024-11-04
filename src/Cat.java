public class Cat extends Animals {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("\uD83D\uDC08");
    }
}
