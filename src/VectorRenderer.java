public class VectorRenderer implements Renderer{
    @Override
    public String renderCircle(int radius) {
        return "Vector rendering Circle with radius: " + radius;
    }

    @Override
    public String renderSquare(int side) {
        return "Vector rendering Square with side: " + side;
    }
}
