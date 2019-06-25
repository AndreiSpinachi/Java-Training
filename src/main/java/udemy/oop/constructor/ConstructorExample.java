package udemy.oop.constructor;

public class ConstructorExample {

    // Good Example of Constructor
    // No matter what constructor we call, the vars will always be init in 3rd constructor
    // The last constructor has the "responsability" to initialize variables == constructor chaining

    private int x;
    private int y;
    private int width;
    private int height;

    //1st constructor
    public ConstructorExample() {
        this(0, 0);
    }

    //2nd constructor
    public ConstructorExample(int width, int height) {
        this(0, 0, width, height);
    }

    //3rd constructor
    public ConstructorExample(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
