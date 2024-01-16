package Module1_1;

public class Task04 {
    private String name;

    public Task04(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("The cat named " + name + " says: Meow!");
    }

    public static void main(String[] args) {
        // Create an instance of the Cat class with a name
        Task04 cat = new Task04("Whiskers");
        Task04 cat2 = new Task04("Rex");

        // Call the meow method on the cat instance
        cat.meow();
        cat.meow();
        cat2.meow();
        cat.meow();
    }
}
