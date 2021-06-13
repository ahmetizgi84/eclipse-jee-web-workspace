package coffeeDemo;

public class Main {
	public static void main(String[] args) {
		Customer customer = new Customer(1, "Ahmet", "izgi", "07.12.1976", "123456789011");
		
		//BaseCustomerManager baseCustomerManager = new NeroCustomerManager();
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		baseCustomerManager.save(customer);
	}
}
