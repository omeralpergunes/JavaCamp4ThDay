package kamp4;

public abstract class BaseCustomerManager implements CustomerService	{

	@Override
	public void Save (Customer customer) {
		System.out.print("Saved to Database"+ customer.getFirstName());
	}
}
