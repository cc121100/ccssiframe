package org.cc.ssiframe.dao;

import org.cc.ssiframe.model.Address;

public interface AddressDAO {

	public int insert(Address address);
	
	public Address getById(int id);
}
