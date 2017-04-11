package pl.miklaszlukasz.designpatterns.factorypattern.shape;

import pl.miklaszlukasz.designpatterns.factorypattern.shape.impl.Circle;
import pl.miklaszlukasz.designpatterns.factorypattern.shape.impl.Square;

public class ShapeFactory {

    public Shape getShape(ShapeType shape) {
        if (shape.equals(ShapeType.SQUARE))
            return new Square();
        else if (shape.equals(ShapeType.CIRCLE))
            return new Circle();
        else throw new IllegalArgumentException("Illegal argument, this should be 'circle' or 'square'.");
    }
}
