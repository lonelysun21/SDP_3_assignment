public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle("C1", 2, new VectorRenderer());
        String oldId = circle1.getId();
        int oldRadius = circle1.getRadius();
        System.out.println(circle1.execute()); // old render
        circle1.setImplementation(new RasterRenderer()); //change and show new render
        String newId = circle1.getId();
        int newRadius = circle1.getRadius();
        if (oldRadius == newRadius && oldId == newId) {
            System.out.println(circle1.execute());
        } else {
            System.out.println("Id and radius was changed");
        }
        Circle circle2 = new Circle("C2", 2, new RasterRenderer());
        System.out.println(circle2.execute());
        Square square1 = new Square("S1", 3, new VectorRenderer());
        System.out.println(square1.execute());
        Square square2 = new Square("S2", 3, new RasterRenderer());
        System.out.println(square2.execute());
    }
}