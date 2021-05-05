package ServiceSimulation;

import Abstract.ICheckService;
import Entity.Customer;

public class EDevletServiceSimulation implements ICheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// Simulasyon
		if(customer.getUsername().equals("samet")) {
			return true;
		}
		else {
			return false;
		}
		
	}

	
	

}
