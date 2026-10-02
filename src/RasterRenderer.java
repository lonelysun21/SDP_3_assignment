public class RasterRenderer implements Renderer{
    @Override
    public String renderCircle(int radius) {
        return "Raster rendering Circle with radius: " + radius;
    }

    @Override
    public String renderSquare(int side) {
        return "Raster rendering Square with side: " + side;
    }
}
