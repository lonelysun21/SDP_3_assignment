public class Main {
    public static void main(String[] args) {

        if (args.length > 0 && args[0].equals("--demo")) {

            int passedTests = 0;

            Circle circle1 = new Circle("C1", 2, new VectorRenderer());
            Circle originalRef = circle1;

            String oldId = circle1.getId();
            int oldRadius = circle1.getRadius();

            System.out.println("T1 | " + circle1.execute());

            boolean t1 = circle1.execute().equals("Vector rendering Circle with radius: 2");
            System.out.println("T1 " + (t1 ? "PASS" : "FAIL"));
            if (t1) {
                passedTests++;
            }


            Circle circle2 = new Circle("C2", 2, new RasterRenderer());
            System.out.println("T2 | " + circle2.execute());

            boolean t2 = circle2.execute().equals("Raster rendering Circle with radius: 2");
            System.out.println("T2 " + (t2 ? "PASS" : "FAIL"));
            if (t2) {
                passedTests++;
            }


            Square square1 = new Square("S1", 3, new VectorRenderer());
            System.out.println("T3 | " + square1.execute());

            boolean t3 = square1.execute().equals("Vector rendering Square with side: 3");
            System.out.println("T3 " + (t3 ? "PASS" : "FAIL"));
            if (t3) {
                passedTests++;
            }


            Square square2 = new Square("S2", 3, new RasterRenderer());
            System.out.println("T4 | " + square2.execute());

            boolean t4 = square2.execute().equals("Raster rendering Square with side: 3");
            System.out.println("T4 " + (t4 ? "PASS" : "FAIL"));
            if (t4) {
                passedTests++;
            }


            // T5
            System.out.println("Before: " + circle1.execute());

            circle1.setImplementation(new RasterRenderer());

            String newId = circle1.getId();
            int newRadius = circle1.getRadius();

            boolean t5 = oldRadius == newRadius
                    && oldId.equals(newId)
                    && originalRef == circle1;

            if (oldRadius == newRadius && oldId.equals(newId) && originalRef == circle1) {

                System.out.println("T5 | same object and state unchanged");
                System.out.println("After: " + circle1.execute());

            } else {
                System.out.println("T5 | Id, radius or object was changed");
            }

            System.out.println("T5 " + (t5 ? "PASS" : "FAIL"));
            if (t5) {
                passedTests++;
            }


            // T6
            Circle circle3 = new Circle("C3", 2, new AsciiRenderer());
            System.out.println("T6 | " + circle3.execute());

            boolean t6 = circle3.execute().equals("Ascii rendering Circle with radius: 2");
            System.out.println("T6 " + (t6 ? "PASS" : "FAIL"));
            if (t6) {
                passedTests++;
            }


            // T7
            Square square3 = new Square("S3", 3, new AsciiRenderer());
            System.out.println("T7 | " + square3.execute());

            boolean t7 = square3.execute().equals("Ascii rendering Square with side: 3");
            System.out.println("T7 " + (t7 ? "PASS" : "FAIL"));
            if (t7) {
                passedTests++;
            }


            System.out.println("SUMMARY: " + passedTests + "/7 PASS");
        }
    }
}