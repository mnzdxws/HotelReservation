package businesslogicserviceimpl.hotelblserviceimpl;

import java.util.ArrayList;

import businesslogic.util.HotelMsg;
import vo.HotelInfoVO;

public class HotelSearchBLServiceImpl {
	ArrayList<HotelInfoVO> hotelList;
	
	public HotelSearchBLServiceImpl() {
		hotelList = new ArrayList<HotelInfoVO>();
	}
	
	/**
	 * 选择酒店条件
	 *
	 */
	public HotelMsg selectCondition(HotelInfoVO hotelInfoVO){
		return new HotelMsg(hotelInfoVO.getName(),hotelInfoVO.getAddress(),
    			hotelInfoVO.getArea(),hotelInfoVO.getLevel(),hotelInfoVO.getIntroduction(),
    			hotelInfoVO.getFacility(),hotelInfoVO.isReserved());
	}
	
	/**
	 * 显示酒店列表
	 * 
	 */
    public ArrayList<HotelInfoVO> showList(HotelInfoVO hotelListInfoVO){
    	return hotelList;
    }
}
