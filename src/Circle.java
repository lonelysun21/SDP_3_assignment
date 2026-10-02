public class Circle extends Shape{
    private int radius;

    protected Circle(Renderer renderer) {
        super(renderer);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
