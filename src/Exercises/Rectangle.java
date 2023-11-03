package Exercises;

class Rectangle {
    public float length;
    public float width;

    public double calculateArea() {
        double area = this.length * this.width;
        return Math.round(area * 100.0) / 100.0;
    }

    public double calculatePerimeter() {
        double perimeter = 2 * (this.length + this.width);
        return Math.round(perimeter * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.length = 10;
        rectangle.width = 5;
        System.out.println("Area of the rectangle is " + rectangle.calculateArea());
        System.out.println("Perimeter of the rectangle is " + rectangle.calculatePerimeter());
    }
}
