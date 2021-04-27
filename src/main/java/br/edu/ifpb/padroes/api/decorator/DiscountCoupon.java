package br.edu.ifpb.padroes.api.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class DiscountCoupon  extends Base {

	public DiscountCoupon(Pizza pizza) {
		super(pizza);
	}
	@Override
	public Float getPrice() {
		return super.getPrice() * 0.25f;
	}

	@Override
	public String getName() {
		return super.getName();
	}

}
