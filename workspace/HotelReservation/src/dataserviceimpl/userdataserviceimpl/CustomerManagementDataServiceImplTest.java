package dataserviceimpl.userdataserviceimpl;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.rmi.RemoteException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


import vo.UserIDVO;

public class CustomerManagementDataServiceImplTest {

	CustomerManagementDataServiceImpl impl;
	UserIDVO id;
	
	@Before
	public void setUp(){
		impl=new CustomerManagementDataServiceImpl();
		id=new UserIDVO("123456789");
	}
	
	@Test
	public void testAddMember() throws RemoteException{
		assertEquals(impl.AddMembers(id),true);
	}
	
	@Test
	public void testGetCustomerOrders() throws RemoteException{
		assertEquals(impl.GetCustomerOrders(id),null);
	}
	
	
	@Test
	public void testaddCustomerOrders() throws RemoteException{
		assertEquals(impl.addCustomerOrders(id,"123456"),true);
	}

	@Test
	public void testGetCustomerHotel() throws RemoteException{
		 ArrayList<String> n=new ArrayList<>();
		 n.add("123456");
		assertEquals(impl.GetCustomerHotel(id),n);
	}
}
