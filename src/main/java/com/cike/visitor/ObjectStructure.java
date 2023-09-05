package com.cike.visitor;

/**
 * @author kou
 * 对象结构类
 */
public class ObjectStructure {
    private Element[] elements;

    public ObjectStructure() {
        elements = new Element[]{new ElementA(), new ElementB()};
    }
    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
