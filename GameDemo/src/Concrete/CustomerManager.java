package Concrete;

import Abstract.CustomerService;
import Abstract.ICheckService;
import Entity.Customer;
import Loglama.Logger;

public class CustomerManager implements CustomerService {
	
	ICheckService _checkService;
	Logger logger;
	
	

	public CustomerManager(ICheckService _checkService, Logger logger) {
		this._checkService = _checkService;
		this.logger = logger;
	}

	@Override
	public void Add(Customer customer) {
	        if(_checkService.checkIfRealPerson(customer)) {
	        	System.out.println("Kullan�c� Eklendi");
	        	logger.log();
	        }
	        else {
	        	System.out.println("Kullan�c� ge�ersiz");
	        }
		
	}

	@Override
	public void Delete(Customer customer) {
		if(_checkService.checkIfRealPerson(customer)) {
        	System.out.println("Kullan�c� Silindi");
        	logger.log();
        }
        else {
        	System.out.println("Kullan�c� ge�ersiz");
        }	
		
	}

	@Override
	public void Update(Customer customer) {
		if(_checkService.checkIfRealPerson(customer)) {
        	System.out.println("Kullan�c� G�ncellendi");
        	logger.log();
        }
        else {
        	System.out.println("Kullan�c� ge�ersiz");
        }
		
	}

}
