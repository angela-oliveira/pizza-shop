package br.edu.ifpb.padroes.api.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class Base implements Pizza {
	private Pizza wrappee;
	Base(Pizza pizza) {
		this.wrappee =  pizza;
	}
	@Override
	public Float getPrice() {
		return wrappee.getPrice();
	}

	@Override
	public String getName() {
		return wrappee.getName();
	}

}
