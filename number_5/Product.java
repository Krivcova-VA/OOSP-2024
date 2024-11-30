package number_5;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
    private String name;
    private double price;
    private List<Observer> observers;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.observers = new ArrayList<>();
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
            observer.update(name, price);
        }
    }

    public void setPrice(double price) {
        if (this.price != price) {
            this.price = price;
            notifyObservers();
        }
    }

    public double getPrice() {
        return price;
    }


    public String getName() {
        return name;
    }
}

