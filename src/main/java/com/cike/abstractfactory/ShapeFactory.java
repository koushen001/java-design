package com.cike.abstractfactory;

/**
 * @author kou
 */
public class ShapeFactory implements AbstractFactory{
    @Override
    public Shape createShape() {
        return new Circle();
    }

    @Override
    public Color createColor() {
        return new Red();
    }
}
