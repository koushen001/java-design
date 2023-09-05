package com.cike.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kou
 * 具体主题类
 */
public class ConcreteSubject implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private String state;
    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
}
