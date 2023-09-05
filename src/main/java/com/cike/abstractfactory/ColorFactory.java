package com.cike.abstractfactory;

/**
 * @author kou
 */
public class ColorFactory implements AbstractFactory {
    @Override
    public Shape createShape() {
        return new Square();
    }

    @Override
    public Color createColor() {
        return new Blue();
    }
}
