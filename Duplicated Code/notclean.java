public class notclean {
    private int x;
    private int y;

    public notclean(int x, int y) {
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

    private void printResult(String operation, int result) {
        System.out.println(operation + " result: " + result);
    }

    public void printDetails() {
        System.out.println("x: " + this.x + ", y: " + this.y);
        this.printResult("Sum", this.calculateSum());
        this.printResult("Product", this.calculateProduct());
    }
}
