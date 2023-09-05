package com.cike.visitor;

/**
 * @author kou
 * 具体元素类B
 */
public class ElementB implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
