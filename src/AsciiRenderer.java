public class AsciiRenderer implements Renderer{
    @Override
    public String renderCircle(int radius) {
        return "Ascii rendering Circle with radius: " + radius;
    }

    @Override
    public String renderSquare(int side) {
        return "Ascii rendering Square with side: " + side;
    }
}
