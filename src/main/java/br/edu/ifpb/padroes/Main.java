package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.api.damenos.DamenosPizza;
import br.edu.ifpb.padroes.api.decorator.DiscountCoupon;
import br.edu.ifpb.padroes.api.decorator.ExtraCheese;
import br.edu.ifpb.padroes.api.decorator.StuffedCrust;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotPizza;
import br.edu.ifpb.padroes.domain.Pizza;
import br.edu.ifpb.padroes.domain.PizzaShopPizza;
import br.edu.ifpb.padroes.service.PizzaShopService;

public class Main {

    public static void main(String[] args) {

        PizzaShopService pizzaShopService = new PizzaShopService();

        System.out.println("Pizzas - menu");

        // TODO - implementar adapter para juntar as pizzas da PizzaHot e Damenos em um único conjunto
        for (Pizza pizza : pizzaShopService.getPizzas()) {
            System.out.println(String.format("%s - %.2f", pizza.getName(), pizza.getPrice()));
        }

        Pizza pizza = new PizzaShopPizza("pepperoni", 55.0f);
        Pizza discountCoupon = new DiscountCoupon(pizza);
        Pizza extraCheese = new ExtraCheese(discountCoupon);
        Pizza stuffedCrust = new StuffedCrust(extraCheese);

        // TODO - implementar padrão decorator para só precisar passar o objeto pizza
        pizzaShopService.orderPizza(stuffedCrust);

    }

}
