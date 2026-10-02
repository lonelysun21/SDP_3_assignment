abstract public class Shape {
    protected Renderer renderer;

    protected Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    public void setImplementation(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract String execute();
}
