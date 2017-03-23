package pl.miklaszlukasz.designpatterns.factorypattern.shape.impl;

import pl.miklaszlukasz.designpatterns.factorypattern.shape.Shape;

public class Square implements Shape {
    public void draw() {
        System.out.print(getClass().getName());
    }
}
