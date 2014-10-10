package org.cc.ssiframe.service.impl;

import org.cc.ssiframe.dao.AddressDAO;
import org.cc.ssiframe.model.Address;
import org.cc.ssiframe.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService{
	
	@Autowired
	private AddressDAO addressDAO;

	public Address getAddress(int id) {
		// TODO Auto-generated method stub
		return addressDAO.getById(id);
	}

	public int insert(Address address) {
		return addressDAO.insert(address);
	}

}
