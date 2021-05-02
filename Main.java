package kamp4;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager customerManager = new StarbucksCustomerManager (new MernisServiceAdapter());
		Customer customer = new Customer(1,"Ömer Alper","Güneþ","44");
		customerManager.Save(customer);
	}

}
