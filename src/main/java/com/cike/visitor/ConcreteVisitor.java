package com.cike.visitor;

/**
 * @author kou
 * 具体访问者类
 */
public class ConcreteVisitor implements Visitor{
    @Override
    public void visit(ElementA elementA) {
        System.out.println("访问了元素A");
    }

    @Override
    public void visit(ElementB elementB) {
        System.out.println("访问了元素B");
    }
}
