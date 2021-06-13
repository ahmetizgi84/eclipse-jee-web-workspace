package coffeeDemo;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private ICustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService _customerCheckService) {
		super();
		this._customerCheckService = _customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		
		if(_customerCheckService.checkRealPerson(customer)) {
			System.out.println(customer.getFirstName() + " " + customer.getLastName() +  " starbucks veritabanına kaydedildi");
		}else {
			throw new Error("Kullanıcı doğrulaması başarısız.");			
		}
	}

}
