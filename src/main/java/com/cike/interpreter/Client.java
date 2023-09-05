package com.cike.interpreter;

/**
 * @author kou
 * 解释器模式（Interpreter Pattern）是一种行为型设计模式，用于解释语言或表达式。它定义了一种语言文法，并通过解释器来解释该语法中的表达式，将其转化为具体的操作。
 * 解释器模式的核心思想是将语言的文法表示成一个抽象语法树（Abstract Syntax Tree，AST），然后使用解释器来遍历和解释这棵树，执行相应的操作。解释器模式适用于需要处理复杂语言或规则的场景，例如编译器、解析器、正则表达式引擎等。
 * 以下是解释器模式的关键角色：
 * AbstractExpression（抽象表达式）：定义了一个抽象的解释操作接口，所有具体表达式都必须实现这个接口。
 * TerminalExpression（终结符表达式）：实现了抽象表达式接口的终结符表达式，它是语法规则中的基本单元，不再包含其他表达式。
 * NonTerminalExpression（非终结符表达式）：实现了抽象表达式接口的非终结符表达式，它通常由多个子表达式组成，用来表示复杂的语法规则。
 * Context（上下文）：包含解释器需要的全局信息或状态，它可以被解释器引用以实现具体的解释操作。
 */
public class Client {
    public static void main(String[] args) {
        Expression expression1 = new TerminalExpression("hello");
        Expression expression2 = new TerminalExpression("world");
        Expression andExpression = new AndExpression(expression1, expression2);

        String context1 = "hello world";

        Context context = new Context(context1);
        boolean result = andExpression.interpret(context.getContext());

        System.out.println("Context: " + context.getContext());
        System.out.println("Expression: " + andExpression);
        System.out.println("Result: " + result);
    }
}
