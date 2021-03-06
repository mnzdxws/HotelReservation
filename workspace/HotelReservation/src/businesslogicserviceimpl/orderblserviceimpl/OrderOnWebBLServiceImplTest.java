package businesslogicserviceimpl.orderblserviceimpl;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import businesslogic.util.OrderOnWebMsg;
import businesslogic.util.OrderState;
import businesslogic.util.ResultMsg;
import businesslogic.util.User;
import vo.OrderOnWebVO;

public class OrderOnWebBLServiceImplTest {

	OrderOnWebBLServiceImpl webBLServiceImpl;
	ArrayList<OrderOnWebVO> webList;
	OrderOnWebVO web1;
	ResultMsg r1;
	OrderOnWebMsg msg1;
	
	@Before
	public void setUp(){
		webBLServiceImpl = new OrderOnWebBLServiceImpl();
		webList = OrderOnWebBLServiceImpl.webList;
		web1 = new OrderOnWebVO(new User("txin",100,"18805156300","151250132@smail.nju.edu.cn"),"42654645437",
				OrderState.ABNORMAL,105,"火车晚点");
		webList.add(web1);
		r1 = new ResultMsg(true, "处理成功！");
		msg1 = new OrderOnWebMsg(web1.getInitiator(),web1.getOrderID(),web1.getOrderState(),
				web1.getPrice(),web1.getReason());;
	}
	
	@Test
	public void testComplaintListScan(){
		ArrayList<OrderOnWebVO> webs = webBLServiceImpl.complaintListScan();
		assertEquals(webs, webList);
	}
	
	@Test
	public void testComplaintHandle(){
		ResultMsg msg1 = webBLServiceImpl.complaintHandle(web1);
		assertEquals(msg1.getMessage(), r1.getMessage());
		assertEquals(msg1.isPass(), r1.isPass());
	}
	
	@Test
	public void testAbnormalOrderScan(){
		ArrayList<OrderOnWebVO> webs = webBLServiceImpl.abnormalOrderScan();
		assertEquals(webs, webList);
	}
	
	@Test
	public void testAbnormalOrderDetail(){
		OrderOnWebMsg m1 = webBLServiceImpl.abnormalOrderDetail(web1);
		assertEquals(m1.getInitiator(), msg1.getInitiator());
		assertEquals(m1.getOrderState(), msg1.getOrderState());
		assertEquals(m1.getPrice(), msg1.getPrice());
		assertEquals(m1.getReason(), msg1.getReason());
	}

}
