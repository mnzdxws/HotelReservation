package businesslogicservice.orderblservice;

import java.util.ArrayList;
import businesslogic.util.OrderMsg;
import businesslogic.util.ResultMsg;
import vo.OrderOnUserVO;

/**
 * 客户查询个人订单信息及详情，执行订单的撤销
 * 
 * @author txin
 *
 */
public interface OrderOnUserBLService {
	
	/**
	 * 客户查看个人订单信息
	 *
	 * @param void
	 * @return 个人订单列表
	 */
	public ArrayList<OrderOnUserVO> personalOrderScan();
	
	/**
	 * 客户撤销个人订单
	 *
	 * @param orderVO 订单VO
	 * @return 系统提示消息
	 */
	public ResultMsg personalOrderCancel(OrderOnUserVO orderVO);
	
	/**
	 * 客户查看个人订单详情
	 *
	 * @param void
	 * @return 个人订单详情
	 */
	public OrderMsg personalOrderDetail(OrderOnUserVO orderVO);
	
}
