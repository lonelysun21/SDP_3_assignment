public class Square extends Shape{
    private int side;

    protected Square(Renderer renderer){
        super(renderer);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}
