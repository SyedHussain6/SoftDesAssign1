package desasign1;

public class test {

	public static void main(String[] args) {
		
		GroceryProductFactory afactory= new AppleFactory();
		
		//method 
		afactory.createProduct();
		afactory.listProduct(); 
		
		
		GroceryProductFactory bfactory= new BananaFactory();
		
		//method 
		bfactory.createProduct(); 
		bfactory.listProduct();

	}

}
