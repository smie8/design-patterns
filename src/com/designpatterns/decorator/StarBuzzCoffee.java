package com.designpatterns.decorator;

import com.designpatterns.decorator.beverages.Beverage;
import com.designpatterns.decorator.beverages.DarkRoast;
import com.designpatterns.decorator.beverages.Espresso;
import com.designpatterns.decorator.beverages.HouseBlend;
import com.designpatterns.decorator.beverages.condiments.Mocha;
import com.designpatterns.decorator.beverages.condiments.Soy;
import com.designpatterns.decorator.beverages.condiments.Whip;

public class StarBuzzCoffee {

    public static void main(String args[]) {

        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() +
                " €" + espresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() +
                " €" + darkRoast.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() +
                " €" + houseBlend.cost());
    }
}
