package assignment2;

class Rectangle implements Shape {

    float width = 0f;
    float height = 0f;

    public float calculateArea() {
        return width * height;
    }

    public void display() {
        System.out.println("Rectangle");
    }
}