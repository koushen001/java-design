package com.cike.visitor;

/**
 * @author kou
 * 具体元素类A
 */
public class ElementA implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
