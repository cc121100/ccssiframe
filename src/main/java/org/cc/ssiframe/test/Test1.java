package org.cc.ssiframe.test;

import org.cc.ssiframe.model.Address;
import org.cc.ssiframe.service.AddressService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	
	private AddressService addressService;
	
	@Before
    public void before(){                                                                   
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:spring/applicationContext.xml"
                ,"classpath:spring/application-MyBatis.xml"});
        addressService = (AddressService) context.getBean("addressServiceImpl");
    }
     
    @Test
    public void addAddress(){
    	Address address = new Address(9, "street1", "city1", "state1", "zippp", "china");
    	System.out.println(addressService.insert(address));
    }
    
    @Test
    public void getAddress(){
    	Address address = addressService.getAddress(1);
    	System.out.println(address.getStreet());
    }
}
