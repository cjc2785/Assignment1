package assignment2;

class Triangle implements Shape {

    float width = 0f;
    float height = 0f;

    public float calculateArea() {
        return (width * height) / 2;
    }

    public void display() {
        System.out.println("Triangle");
    }
}