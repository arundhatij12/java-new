package com.company;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger(String breadRollType, String meat, String name, double price) {
        super("white", "Bacon", "Deluxe", 19.10);
        super.addHamburgerAddition1("Chips",2.50);
        super.addHamburgerAddition1("Drink",1.50);
    }

}
