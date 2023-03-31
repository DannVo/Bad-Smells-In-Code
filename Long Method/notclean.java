public class Rectangle extends Shape {
    private int width;
    private int height;
    
    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
        // duplicated code starts here
        if (this.width > this.height) {
            int temp = this.width;
            this.width = this.height;
            this.height = temp;
        }
        // duplicated code ends here
    }
}

public class Square extends Shape {
    private int side;
    
    public Square(int x, int y, int side) {
        super(x, y);
        this.side = side;
        // duplicated code starts here
        if (this.width > this.height) {
            int temp = this.width;
            this.width = this.height;
            this.height = temp;
        }
        // duplicated code ends here
    }
}
