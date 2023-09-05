package com.cike.visitor;

/**
 * @author kou
 * 元素接口
 */
public interface Element {
    void accept(Visitor visitor);
}
