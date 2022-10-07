package desasign1;

public class BananaFactory extends GroceryProductFactory{

	@Override
	public Product createProduct() { 
		
		return new Banana();
	}
	
}
