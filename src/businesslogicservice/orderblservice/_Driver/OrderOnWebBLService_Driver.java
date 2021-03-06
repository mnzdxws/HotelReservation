package businesslogicservice.orderblservice._Driver;

import java.util.ArrayList;

import businesslogic.util.ResultMsg;
import businesslogic.util.OrderMsg;
import businesslogicservice.orderblservice.OrderOnWebBLService;
import businesslogicservice.orderblservice._Stub.OrderOnWebBLService_Stub;
import vo.OrderOnWebVO;

public class OrderOnWebBLService_Driver {
	
	public static void main(String[] args){
		OrderOnWebBLService a = new OrderOnWebBLService_Stub();
		OrderOnWebBLService_Driver driver = new OrderOnWebBLService_Driver();
		driver.drive(a);
	}
	
	public void drive(OrderOnWebBLService OrderOnWebBLService){
		OrderOnWebVO orderVO = new OrderOnWebVO("txin",OrderState.EXECUTED,"The train I took was late.",
        		"2016-10-15 24:00",RoomType.ROOM_STANDARD,1,1,false); 
				
		ResultMsg result = OrderOnWebBLService.complaintHandle(orderVO);
		if(result.isPass() == true)
			System.out.println("申诉通过");
		else
			System.out.println("申诉不通过");
		
		OrderMsg msg1 = OrderOnWebBLService.abnormalOrderDetail(orderVO);
		if(msg1.isPass() == true)
			System.out.println("显示异常订单详情");
		else
			System.out.println("显示失败");
		
		ArrayList<OrderOnWebVO> arr = OrderOnWebBLService.complaintListScan();
		if(arr != null)
			System.out.println("显示申诉列表");
		else
			System.out,println("显示失败");
		
		ArrayList<OrderOnWebVO> arr = OrderOnWebBLService.abnormalOrderScan();
		if(arr != null)
			System.out.println("显示异常订单列表");
		else
			System.out,println("显示失败");
	}
}
