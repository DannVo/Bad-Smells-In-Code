public class solution {
    private int x;
    private int y;

    public solution(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int calculateSum() {
        int sum = this.x + this.y;
        return sum;
    }

    public int calculateProduct() {
        int product = this.x * this.y;
        return product;
    }

    public void printDetails() {
        System.out.println("x: " + this.x + ", y: " + this.y);
        System.out.println("Sum result: " + this.calculateSum());
        System.out.println("Product result: " + this.calculateProduct());
    }
}
