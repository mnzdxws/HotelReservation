package businesslogicservice.orderblservice;

import java.util.ArrayList;
import businesslogic.util.OrderMsg;
import businesslogic.util.ResultMsg;
import vo.OrderOnWebVO;

/**
 * 网站营销人员查看申诉列表并处理，查看一场订单列表及详情
 * 
 * @author txin
 *
 */
public interface OrderOnWebBLService {
	
	/**
	 * 网站营销人员查看申诉列表
	 *
	 * @param void
	 * @return 申诉列表
	 */
	public ArrayList<OrderOnWebVO> complaintListScan();
	
	/**
	 * 网站营销人员处理申诉
	 *
	 * @param orderVO 订单VO
	 * @return 系统提示消息
	 */
	public ResultMsg complaintHandle(OrderOnWebVO orderVO);
	
	/**
	 * 网站营销人员查看异常订单列表
	 *
	 * @param void
	 * @return 异常订单列表
	 */
	public ArrayList<OrderOnWebVO> abnormalOrderScan();
	
	/**
	 * 网站营销人员查看异常订单详情
	 *
	 * @param orderVO 订单VO
	 * @return 个人订单详情
	 */
	public OrderMsg abnormalOrderDetail(OrderOnWebVO orderVO);
	
}
