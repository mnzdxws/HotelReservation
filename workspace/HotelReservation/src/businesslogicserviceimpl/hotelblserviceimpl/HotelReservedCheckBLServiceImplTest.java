package businesslogicserviceimpl.hotelblserviceimpl;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import vo.HotelInfoVO;

public class HotelReservedCheckBLServiceImplTest {

	HotelReservedCheckBLServiceImpl impl;
	ArrayList<HotelInfoVO> hotelList;
	HotelInfoVO hotel1;
	HotelInfoVO hotel2;
	HotelInfoVO hotel3;	
	
	@Before
	public void setUp() {
		hotel1=new HotelInfoVO("StarHotel","StarRoad","StarArea",5,"It's a wonderful hotel","cafe, garden and so on",
				true);
		hotel2=new HotelInfoVO("SunHotel","SunRoad","SunArea",4,"It's a nice hotel","cafe",
				false);
		hotel3=new HotelInfoVO("MoonHotel","MoonRoad","MoonArea",-1,"It's a terrible hotel","nothing",
				true);
				
				
		impl = new HotelReservedCheckBLServiceImpl();
		
		hotelList = impl.hotelList;
		hotelList.add(hotel1);
		hotelList.add(hotel2);
		hotelList.add(hotel3);
		
			
	}
	@Test
	public void testcheckReserved(){
		ArrayList<HotelInfoVO> list=impl.checkReserved(hotel1);
		assertEquals(list, hotelList);
	}
}
