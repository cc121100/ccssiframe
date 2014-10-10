package org.cc.ssiframe.service;

import org.cc.ssiframe.model.Address;

public interface AddressService {

	public Address getAddress(int id);
	
	public int insert(Address address);
}
