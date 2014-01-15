public class MaiorValor {

	public double encontra(CarrinhoDeCompras carrinho) {

		if (carrinho.getItems().size() == 0)
			return 0;
		double maior = carrinho.getItems().get(0).getValorTotal();
		for (Item item : carrinho.getItems()) {
			if (maior < item.getValorTotal()) {
				maior = item.getValorTotal();
			}

		}

		return maior;
	}

}
