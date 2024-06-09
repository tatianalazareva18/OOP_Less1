package less1.practice.impl;

import java.time.LocalDate;

import less1.practice.Product;
import java.time.LocalDate;


public class HotDrink extends Product {
    private int temperature;
    private int volume;

    public HotDrink(String name, double price, int volume) {
        super(name, price, null);
        this.temperature = 80;
        this.volume = volume;
    }

    public HotDrink(String name, double price, int volume, int temperature) {
        super(name, price, null);
        this.temperature = temperature;
        this.volume = volume;

    }

    public int getVolume() {
        return volume;
    }

    public int getTemperature() {
        return temperature;
    }


    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", volume=" + volume +
                ", temperature=" + temperature +
                "}";
    }

}
