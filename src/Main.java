public class Main {
    public static void main(String[] args) {

        if (args.length > 0 && args[0].equals("--demo")) {

            Circle circle1 = new Circle("C1", 2, new VectorRenderer());
            Circle originalRef = circle1;

            String oldId = circle1.getId();
            int oldRadius = circle1.getRadius();

            System.out.println("T1 | " + circle1.execute());

            Circle circle2 = new Circle("C2", 2, new RasterRenderer());
            System.out.println("T2 | " + circle2.execute());

            Square square1 = new Square("S1", 3, new VectorRenderer());
            System.out.println("T3 | " + square1.execute());

            Square square2 = new Square("S2", 3, new RasterRenderer());
            System.out.println("T4 | " + square2.execute());


            // T5
            System.out.println("Before: " + circle1.execute());

            circle1.setImplementation(new RasterRenderer());

            String newId = circle1.getId();
            int newRadius = circle1.getRadius();

            if (oldRadius == newRadius && oldId.equals(newId) && originalRef == circle1) {

                System.out.println("T5 | same object and state unchanged");
                System.out.println("After: " + circle1.execute());

            } else {
                System.out.println("T5 | Id, radius or object was changed");
            }
        }
    }
}