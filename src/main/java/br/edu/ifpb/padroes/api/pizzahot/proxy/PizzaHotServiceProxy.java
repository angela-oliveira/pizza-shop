package br.edu.ifpb.padroes.api.pizzahot.proxy;

import br.edu.ifpb.padroes.api.pizzahot.PizzaHotPizza;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotServiceImpl;

import java.util.ArrayList;
import java.util.List;

// TODO - implementar proxy de cache para evitar leitura do json a cada chamada do método
public class PizzaHotServiceProxy implements PizzaHotService {
	PizzaHotService pizzaHotService;
	List<PizzaHotPizza> cache = new ArrayList<>();
	public PizzaHotServiceProxy() {
		this.pizzaHotService = new PizzaHotServiceImpl();
	}
    @Override
    public List<PizzaHotPizza> getPizzas() {
    	if (cache.isEmpty()) {
    		cache = pizzaHotService.getPizzas();
    		
    	} else {
    		System.out.println("lista recuperada");
    	}
        // TODO - implementar proxy
        return cache;
    }
}
