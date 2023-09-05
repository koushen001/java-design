package com.cike.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kou
 * 组合类
 */
public class Composite implements Component{
    private List<Component> children = new ArrayList<>();
    public void add(Component component) {
        children.add(component);
    }
    public void remove(Component component) {
        children.remove(component);
    }
    @Override
    public void operation() {
        System.out.println("Composite operation:");
        for (Component child : children) {
            child.operation();
        }
    }
}
