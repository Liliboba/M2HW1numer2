public class Main {
    public static Animals createObject(String className) {
        switch (className) {
            case "Dog":
                return new Dog("King");
            case "Cat":
                return new Cat("Tom");
            case "Fish":
                return new Fish("Nemo");
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        Animals dog = createObject("Dog");
        Animals cat = createObject("Cat");
        Animals fish = createObject("Fish");

        Printable[] objects = {(Printable) dog, (Printable) cat, (Printable) fish};

        for (Printable obj : objects) {
            obj.print();
        }
    }
}