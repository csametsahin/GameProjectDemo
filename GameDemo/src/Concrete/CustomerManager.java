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
	        	System.out.println("Kullanýcý Eklendi");
	        	logger.log();
	        }
	        else {
	        	System.out.println("Kullanýcý geçersiz");
	        }
		
	}

	@Override
	public void Delete(Customer customer) {
		if(_checkService.checkIfRealPerson(customer)) {
        	System.out.println("Kullanýcý Silindi");
        	logger.log();
        }
        else {
        	System.out.println("Kullanýcý geçersiz");
        }	
		
	}

	@Override
	public void Update(Customer customer) {
		if(_checkService.checkIfRealPerson(customer)) {
        	System.out.println("Kullanýcý Güncellendi");
        	logger.log();
        }
        else {
        	System.out.println("Kullanýcý geçersiz");
        }
		
	}

}
