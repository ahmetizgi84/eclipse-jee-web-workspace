package coffeeDemo;

public abstract class BaseCustomerManager implements ICustomerService {
	
	@Override
	public void save(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() +  " veritabanına kaydedildi");
	}
}
