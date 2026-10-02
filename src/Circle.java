public class Circle extends Shape{
    private String id;
    private int radius;

    protected Circle(String id, int radius, Renderer renderer) {
        super(renderer);
        this.id = id;
        this.radius = radius;
    }

    @Override
    public String execute() {
        return "";
    }
}
