package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer customer1 = new IndividualCustomer();
		customer1.customerNumber = "123456";
		customer1.firstName = "Ahmet";
		
		IndividualCustomer customer2 = new IndividualCustomer();
		customer2.customerNumber = "987654";
		customer2.firstName = "Mehmet";
		
		IndividualCustomer customer3 = new IndividualCustomer();
		customer3.customerNumber = "99887766";
		customer3.firstName = "Ali";
		
		Customer[] customers = {customer1, customer2, customer3};
		
		CustomerManager customerManager = new CustomerManager();
		//customerManager.add(customer1);
		customerManager.addMultiple(customers);

	}

}
