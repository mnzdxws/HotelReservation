package businesslogicserviceimpl.hotelblserviceimpl;

import businesslogic.util.OrderOnUserMsg;
import businesslogic.util.ResultMsg;
import vo.HotelInfoVO;
import vo.OrderOnUserVO;

public class HotelReserveBLServiceImpl {

	/**
	 * 预定酒店
	 *
	 */
	public ResultMsg reserveHotel(HotelInfoVO reserveHotelVO){
		return new ResultMsg(true,"预定成功");
	}
	
	/**
	 * 创建用户订单
	 * 
	 */
    public OrderOnUserMsg createUserOrder(OrderOnUserVO order){
    	return new OrderOnUserMsg(order.getInitiator(),order.getOrderID(), order.getOrderState(), order.getPrice(), order.getLatestExecutionTime(), 
				order.getRoomType(), order.getRoomNumber(), order.getPeopleNumber(), order.getHasChild());
    }
	

      
}