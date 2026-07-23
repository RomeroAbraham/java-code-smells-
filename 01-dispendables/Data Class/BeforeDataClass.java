class Circle {
    public double radius;
}

public class AreaService {
    public double calculateArea(Circle circle) {
        return Math.PI * circle.radius * circle.radius;
    }
}
