package com.pennant.EmployeeCrud.ServiceFactory;

import com.pennant.EmployeeCrud.Service.EmployeeCrudServiceImpl;
import com.pennant.EmployeeCrud.Service.IEmployeeCrudService;

public class EmployeeCrudServiceFactory {

	private static IEmployeeCrudService service = null;

	private EmployeeCrudServiceFactory() {

	}

	public static IEmployeeCrudService getService() {
		if (service == null) {
			service = new EmployeeCrudServiceImpl();
		}
		return service;
	}

}
