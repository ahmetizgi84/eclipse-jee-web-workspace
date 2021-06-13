package coffeeDemo;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean checkRealPerson(Customer customer) {
		return true;
	}
}
