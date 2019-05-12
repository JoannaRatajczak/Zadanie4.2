public class IsRight {

    int square(int a) {
        int sqr = a * a;
        return sqr;
    }

    boolean isRightTriangle(Triangle triangle) {
        return square(triangle.c) == (square(triangle.a) + square(triangle.b)) || square(triangle.b) == square(triangle.c) + square(triangle.a) || square(triangle.a) == square(triangle.c) + square(triangle.b);

    }
}
