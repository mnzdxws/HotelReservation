package businesslogicservice.orderblservice;

import java.util.ArrayList;
import businesslogic.util.OrderMsg;
import businesslogic.util.ResultMsg;
import vo.OrderOnHotelVO;

/**
 * 酒店工作人员查看酒店订单列表及详情，修改订单状态
 * 
 * @author txin
 *
 */
public interface OrderOnHotelBLService {
	
	/**
	 * 酒店工作人员查看酒店订单列表
	 *
	 * @param void
	 * @return 酒店订单列表
	 */
	public ArrayList<OrderOnHotelVO> hotelOrderScan();
	
	/**
	 * 酒店工作人员查看酒店订单详情
	 *
	 * @param orderVO 订单VO
	 * @return 酒店订单详情
	 */
	public OrderMsg hotelOrderDetail(OrderOnHotelVO orderVO);
	
	/**
	 * 酒店工作人员修改订单状态
	 *
	 * @param orderVO 订单VO
	 * @return 系统提示消息
	 */
	public ResultMsg hotelOrderModify(OrderOnHotelVO orderVO);
	
}
