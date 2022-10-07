package desasign1;

public class AppleFactory extends GroceryProductFactory{

	@Override
	public Product createProduct() { 
		
		return new Apple();
	}
	
}
