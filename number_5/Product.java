package number_5;

import java.util.ArrayList;
import java.util.List;

// Класс товара (субъект)
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

    // Метод для обновления цены
    public void setPrice(double price) {
        if (this.price != price) {
            this.price = price;
            notifyObservers();  // Уведомляем подписчиков о изменении цены
        }
    }

    // Получение текущей цены товара
    public double getPrice() {
        return price;
    }

    // Получение имени товара
    public String getName() {
        return name;
    }
}

