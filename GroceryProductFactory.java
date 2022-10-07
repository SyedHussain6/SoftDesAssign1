package desasign1;

public abstract class GroceryProductFactory {
	//Creating variable product p 
	Product p;
	public abstract Product createProduct();
	
	public void listProduct(){ 
		this.p= createProduct();
		p.setPrice();
		System.out.println(p.getPrice());
	}
	

	
	
}
