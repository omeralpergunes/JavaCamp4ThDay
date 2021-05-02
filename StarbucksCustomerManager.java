package kamp4;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	public Entity entity;
	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Saved to database: "+customer.getFirstName());
			
		}else {
			System.out.println("Not a valid person!");
		}
		
	}


	
	


}