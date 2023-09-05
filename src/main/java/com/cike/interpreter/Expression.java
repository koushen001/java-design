package com.cike.interpreter;

/**
 * @author kou
 * AbstractExpression（抽象表达式）接口
 */
public interface Expression {
    boolean interpret(String context);
}
