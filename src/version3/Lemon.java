/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package version3;

/**
 *
 * @author jlombardo
 */
public class Lemon extends CondimentDecorator {
    // Component to decorate
    Beverage beverage;

    public Lemon(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // combined descrition
        return beverage.getDescription() + ", Lemon";
    }

    @Override 
    public double cost () {
        // combined cost
        return 0.1 + beverage.cost();
    }
    
    @Override
    public void reheat() {
        System.out.println("beverage is being reheated");
    }

}
