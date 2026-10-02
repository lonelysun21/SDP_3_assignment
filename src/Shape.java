public abstract class Shape {
    private String id;
    protected Renderer renderer;

    public void setImplementation(Renderer renderer) {
        this.renderer = renderer;
    }

    protected Shape(String id, Renderer renderer) {
        this.id = id;
        this.renderer = renderer;
    }

    public String getId() {
        return id;
    }

    public abstract String execute();
}
