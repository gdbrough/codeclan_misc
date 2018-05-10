package models;

import behaviours.ISell;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


public class Shop {
    private String name;
    private List<ISell> stock;

    public Shop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ISell> getStock() {
        return stock;
    }

    public void setStock(List<ISell> stock) {
        this.stock = stock;
    }

    public int stockCount() {
        return this.stock.size();
    }

    public void addToStock(ISell item) {
        this.stock.add(item);
    }

    public void removeFromStock(ISell item) {
        this.stock.remove(item);
    }

    public int totalPotentialProfit() {
        int total = 0;
        for (ISell item : stock) {
            total += item.calculateMarkup();
        }
        return total;
    }
}
