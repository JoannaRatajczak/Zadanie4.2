public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        IsRight chceck = new IsRight();

        System.out.println("Is it a right triangle? " + chceck.isRightTriangle(triangle));

        Triangle triangle2 = new Triangle(12, 5, 13);
        System.out.println("Is it a right triangle? " + chceck.isRightTriangle(triangle2));

        Triangle triangle3 = new Triangle(5, 5, 13);
        System.out.println("Is it a right triangle? " + chceck.isRightTriangle(triangle3));


    }

}
