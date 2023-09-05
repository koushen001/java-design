package com.cike.visitor;

/**
 * @author kou
 * 访问者接口
 */
public interface Visitor {
    void visit(ElementA elementA);
    void visit(ElementB elementB);
}
