package com.core.utils;

import static com.core.utils.ValidationUtils.validateCustomer;

import java.util.HashMap;

import com.app.core.Customer;

import cust_excs.CustomerHandlingException;

public class MapUtils {
	public static HashMap<String,Customer> populateData() throws CustomerHandlingException
	{
		HashMap<String,Customer> map = new HashMap<String,Customer>();
		map.put("harsri3@gmail.com", validateCustomer("harsri3@gmail.com","harsri@3",5000.00,"2019-04-30",map));
		map.put("harsri4@gmail.com", validateCustomer("harsri4@gmail.com","harsri@4",10000.00,"2019-05-30",map));
		map.put("harsri5@gmail.com", validateCustomer("harsri5@gmail.com","harsri@5",50000.00,"2019-06-30",map));
		map.put("harsri6@gmail.com", validateCustomer("harsri6@gmail.com","harsri@36",15000.00,"2019-07-30",map));
		map.put("harsri7@gmail.com", validateCustomer("harsri7@gmail.com","harsri@356",25000.00,"2019-08-30",map));
		return map;
	}

}
