package pl.miklaszlukasz.designpatterns.factorypattern.shape;

import pl.miklaszlukasz.designpatterns.factorypattern.shape.impl.Circle;
import pl.miklaszlukasz.designpatterns.factorypattern.shape.impl.Square;

public class ShapeFactory {
    public static final String SQUARE = "square";
    public static final String CIRCLE = "circle";

    public Shape getShape(String shape) {
        if (shape.equals(SQUARE))
            return new Square();
        else if (shape.equals(CIRCLE))
            return new Circle();
        else throw new IllegalArgumentException("Illegal argument, this should be 'circle' or 'square'.");
    }
}
