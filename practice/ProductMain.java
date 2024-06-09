package less1.practice;

import less1.practice.impl.BottleOfWater;
import less1.practice.impl.EPackage;
import less1.practice.impl.HotDrink;
import less1.practice.impl.HotDrinkVM;
import less1.practice.impl.WaterVendingMachine;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductMain {

    public static void main(String[] args) {
        /* 
        Product bottle1 = new BottleOfWater("Родники", 55, LocalDate.of(2024, 5, 1));

        Product bottle2 = new BottleOfWater("Родники Газированная", 55, LocalDate.of(2024, 5, 1),
                true, EPackage.GLASS.getMaterial(), 0.5F);

        VendingMachine vm = new WaterVendingMachine();

        System.out.println(vm.getProducts());

        vm.addProducts(List.of(bottle1, bottle1, bottle1, bottle2, bottle2, bottle2));

        System.out.println(vm.getProducts());

        vm.getProduct("Родники");

        System.out.println(vm.getProducts());

        */


        HotDrinkVM vm1 = new HotDrinkVM();
        System.out.println(vm1.getProducts());

        Product coffe = new HotDrink("Кофе", 100, 100, 100); 
        Product coffe200 = new HotDrink("Кофе", 100, 200, 100); 

        Product greenTee = new HotDrink("зеленый чай", 90, 200, 80);


        vm1.addProducts(List.of(coffe, coffe200, greenTee));
        System.out.println(vm1.getProducts());
        HotDrink hotDrink = vm1.getProduct("Кофе", 200, 100);
        System.out.println(vm1.getProducts());

    }
}
