package businesslogicserviceimpl.userblserviceimpl;


import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

import vo.HotelIDVO;
import vo.LoginInputVO;
import vo.UserIDVO;

public class WebManagerHotelOperationBlServiceImplTest {

	WebManagerHotelOperationBlServiceImpl impl;
	UserIDVO vo1;
	HotelIDVO vo2;
	
	@Before
	public void setUp() {
		impl=new WebManagerHotelOperationBlServiceImpl();
		vo1=new UserIDVO("123456789");
		vo2=new HotelIDVO("123456");
	}

	@Test
	public void testHotelAdd() {
		
	}
	
	@Test
	public void testStuffAdd(){
		assertEquals(impl.StuffAdd(vo2, vo1),true);
	}
	
	@Test
	public void testscan(){
	    assertEquals(impl.HotelScan(),null);
	}


}
