package pl.miklaszlukasz.designpatterns.factorypattern.shape;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;
import pl.miklaszlukasz.designpatterns.factorypattern.shape.impl.Circle;
import pl.miklaszlukasz.designpatterns.factorypattern.shape.impl.Square;

@RunWith(MockitoJUnitRunner.class)
public class ShapeFactoryTest {

    @InjectMocks
    private ShapeFactory shapeFactory;

    @Test
    public void shouldReturnSquare() {
        Shape square = shapeFactory.getShape(ShapeFactory.SQUARE);
        Assert.assertThat(square, IsInstanceOf.instanceOf(Square.class));
    }

    @Test
    public void shouldReturnCircle() {
        Shape circle = shapeFactory.getShape(ShapeFactory.CIRCLE);
        Assert.assertThat(circle, IsInstanceOf.instanceOf(Circle.class));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentException() {
        shapeFactory.getShape("test");
    }
}
