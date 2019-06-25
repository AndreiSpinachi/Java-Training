package udemy.oop.constructor.super_keyword;

public class Shape {

    private int x;
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    class Rectangle extends Shape {
        private int width;
        private int heigth;

        // 1st constructor
        public Rectangle(int x, int y) {
            this(x, y, 0, 0);
        }

        // 2nd constructor
        public Rectangle(int x, int y, int width, int heigth) {
            super(x, y);
            this.width = width;
            this.heigth = heigth;
        }
    }
}
