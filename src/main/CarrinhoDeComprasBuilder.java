
public class CarrinhoDeComprasBuilder {

	
	
	public CarrinhoDeCompras carrinho;

	public CarrinhoDeComprasBuilder() {
		this.carrinho = new CarrinhoDeCompras();
	}
	
	public CarrinhoDeComprasBuilder comItens(Item itens){
		
		for (Item item : carrinho.getItems()) {
			carrinho.adiciona(new Item("Geladeira", 1, 900.0));
			carrinho.adiciona(new Item("Carro", 1, 9000.0));
			
		}
		
		return this;
		
	}
	public CarrinhoDeCompras cria() {
		return carrinho;
		}
	
	
}
