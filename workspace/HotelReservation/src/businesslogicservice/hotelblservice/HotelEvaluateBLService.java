package businesslogicservice.hotelblservice;

import businesslogic.util.EvaluationMsg;
import businesslogic.util.ResultMsg;
import vo.HotelEvaluateVO;

public interface HotelEvaluateBLService {
	
	/**
	 * 输入评价
	 *
	 */
	public EvaluationMsg inputEvaluate(HotelEvaluateVO evaluateInfoVO);
	
	
   /**
     * 检查是否在已执行订单中
     * 
     */
   public ResultMsg checkOrder(HotelEvaluateVO orderListVO);
   
   
 
      
}