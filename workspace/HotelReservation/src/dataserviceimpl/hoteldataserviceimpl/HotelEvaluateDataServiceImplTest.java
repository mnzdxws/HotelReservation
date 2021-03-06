package dataserviceimpl.hoteldataserviceimpl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.rmi.RemoteException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import po.HotelEvaluatePO;

public class HotelEvaluateDataServiceImplTest {
	

	HotelEvaluateDataServiceImpl impl;
	ArrayList<HotelEvaluatePO> list;
	HotelEvaluatePO evaluation1;
	HotelEvaluatePO evaluation2;
	
	@Before
	public void setUp(){
		impl = new HotelEvaluateDataServiceImpl();
		evaluation1=new HotelEvaluatePO("gyf","StarHotel",10,"execellent",true);
		evaluation2=new HotelEvaluatePO("gyf","SunHotel",8,"very good",false);
		list = new ArrayList<>();
	}
	
	@Test
	public void testInsert() throws RemoteException{
		boolean b = impl.insert(evaluation1);
		assertTrue(b);
	}
	
	@Test
	public void testDelete() throws RemoteException{
		impl.insert(evaluation1);
		boolean b = impl.delete(evaluation1);
		assertTrue(b);
	}
	
	
	@Test
	public void testFind() throws RemoteException{
		impl.insert(evaluation1);
		impl.insert(evaluation2);
		ArrayList<HotelEvaluatePO> arrayList = impl.find("StarHotel");
		list.add(evaluation1);
		list.add(evaluation2);
		assertEquals(list.get(0), arrayList.get(0));
		assertEquals(list.get(1), arrayList.get(1));
	}

	@Test
	public void testShow() throws RemoteException{
		impl.insert(evaluation1);
		impl.insert(evaluation2);
		
		list.add(evaluation1);
		list.add(evaluation2);
		
		ArrayList<HotelEvaluatePO> arrayList = impl.show();
		assertEquals(list, arrayList);
	}

}
