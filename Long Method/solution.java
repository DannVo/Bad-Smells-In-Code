public class Shape {
    protected int x;
    protected int y;
    
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // Pull Up Constructor Body
    public Shape(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        if (this.width > this.height) {
            int temp = this.width;
            this.width = this.height;
            this.height = temp;
        }
    }
}

public class Rectangle extends Shape {
    private int width;
    private int height;
    
    public Rectangle(int x, int y, int width, int height) {
        super(x, y, width);
        this.width = width;
        this.height = height;
    }
}

public class Square extends Shape {
    private int side;
    
    public Square(int x, int y, int side) {
        super(x, y, side);
        this.side = side;
    }
}
