package coffeeDemo;

public class NeroCustomerManager extends BaseCustomerManager  {

	@Override
	public void save(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() +  " nero veritabanına kaydedildi");
	}


}
