package version3;

import java.text.NumberFormat;

/**
 * This version represents the third attempt by Starbuzz Coffee to
 * handle beverage sales with varying beverages and condiments. This version
 * implements the Decorator Pattern and proves to be a huge improvement in
 * maintainability. No rigidity here ... you can add new condiment classes
 * or change existing ones without breaking code. You can add new beverages
 * and not break code. (Note: prices are hard-coded in right now, but they
 * don't have to be ... they can come from a properties file or database.
 *
 * P.S. How would you implement a CashRegister class with this version,
 * without adding rigidity?
 *
 * @author Head First Design Patterns
 */
public class Startup {

    /**
     * @param args the command line arguments - not used
     */
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        // Liskov Substition !!
        Beverage beverage = new HouseBlend();
        CondimentDecorator decoratedBeverage = new Mocha(beverage);
        decoratedBeverage = new Whip(decoratedBeverage);
        
        // Espresso has not been decorated here.
        decoratedBeverage.reheat();
        System.out.println(beverage.getDescription()
                + " " + nf.format(beverage.cost()));

//        Beverage beverage2 = new HouseBlend();
//        
//        // Now let's decorate HouseBlend like this...
//        beverage = new Lemon(beverage);
//        beverage = new Mocha(beverage); // double Mocha
//        beverage = new Whip(beverage);
//        
//        // Resulting coffee has combined cost and description.
//        System.out.println(beverage.getDescription()
//                + " " + nf.format(beverage.cost()));
    }

}
