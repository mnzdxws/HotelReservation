package businesslogicserviceimpl.hotelblserviceimpl;



import java.util.ArrayList;

import businesslogic.util.EvaluationMsg;
import businesslogic.util.ResultMsg;
import vo.HotelEvaluateVO;

public class HotelEvaluateBLServiceImpl {
	ArrayList<HotelEvaluateVO> evaluationList;
	
	public HotelEvaluateBLServiceImpl() {
		evaluationList = new ArrayList<HotelEvaluateVO>();
	}
	
	/**
	 * 输入评价
	 *
	 */
	public EvaluationMsg inputEvaluate(HotelEvaluateVO evaluateInfoVO){
		return new EvaluationMsg(evaluateInfoVO.getScore(),evaluateInfoVO.getComment(),
				evaluateInfoVO.isReserved());
	}
	
	
   /**
     * 检查是否在已执行订单中
     * 
     */
   public ResultMsg checkOrder(HotelEvaluateVO evaluateInfoVO){
	   if(evaluateInfoVO.isReserved()){
		   return new ResultMsg(true,"完成评价");
	   }
	   else{
		   return new ResultMsg(false,"评价出错");
	   }
   }
   
   
  
	
}