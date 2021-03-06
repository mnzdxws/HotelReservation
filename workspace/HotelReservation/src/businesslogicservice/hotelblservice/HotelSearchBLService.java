package businesslogicservice.hotelblservice;

import java.util.ArrayList;

import businesslogic.util.HotelMsg;
import vo.HotelInfoVO;

public interface HotelSearchBLService {
	
	/**
	 * 选择酒店条件
	 *
	 */
	public HotelMsg selectCondition(HotelInfoVO hotelConditionVO);
	
	/**
	 * 显示酒店列表
	 * 
	 */
    public ArrayList<HotelInfoVO> showList(HotelInfoVO hotelListInfoVO);
   

      
}