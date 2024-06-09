package less1.practice.impl;

import less1.practice.Product;
import less1.practice.HotDrink;

import less1.practice.VendingMachine;

import java.util.List;


public class HotDrinkVM extends VendingMachine {

    public HotDrinkVM() {
        super();
    }

    public HotDrinkVM(List<Product> products) {
        super(products);
    }
    
    public HotDrink getProduct(String name, int volume, int temperature) {
        
        for (Product product : products) {
            if (product.getName().equals(name) 
            && ((HotDrink)product).getVolume() == volume 
            && ((HotDrink)product).getTemperature() == temperature) {
                products.remove(product);
                return (HotDrink)product;
            }
        }

        System.out.println("No such product: " + name);
        return null;
    }
   
    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }

}
