public class Square extends Shape{
    private String id;
    private int side;

    protected Square(String id, int side, Renderer renderer){
        super(renderer);
        this.id = id;
        this.side = side;
    }

    @Override
    public String execute() {
        return "";
    }
}
