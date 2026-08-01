import net.groundgurus.day3.sealedexample.Circle;
import net.groundgurus.day3.sealedexample.Rectangle;
import net.groundgurus.day3.sealedexample.Shape;
import net.groundgurus.day3.sealedexample.Square;

void main() {
    var circle = new Circle(5.0);
    var rectangle = new Rectangle(10, 20);
    var square = new Square(4);
    IO.println(processShape(circle));
}

String processShape(Shape shape) {
    return switch (shape) {
        case Circle circle -> circle.getRadius() + "";
        case Rectangle rectangle -> rectangle.getWidth() + "," + rectangle.getHeight();
        case Square square -> square.getSides() + "";
    };
}

//String processShape(Shape shape) {
//    if (shape instanceof Circle circle) {
//        return circle.getRadius() + "";
//    } else if (shape instanceof Rectangle rectangle) {
//        return rectangle.getWidth() + ", "  + rectangle.getHeight();
//    } else if (shape instanceof Square square) {
//        return square.getSides() + "";
//    }
//    return "";
//}