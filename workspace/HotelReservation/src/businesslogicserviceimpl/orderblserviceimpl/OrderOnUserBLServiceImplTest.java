package businesslogicserviceimpl.orderblserviceimpl;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import businesslogic.util.OrderOnUserMsg;
import businesslogic.util.OrderState;
import businesslogic.util.ResultMsg;
import businesslogic.util.RoomType;
import businesslogic.util.User;
import vo.OrderOnUserVO;

import static org.junit.Assert.*;

public class OrderOnUserBLServiceImplTest {

	private OrderOnUserBLServiceImpl userBLServiceImpl;
	OrderOnUserVO order1;
	OrderOnUserVO order2;
	OrderOnUserVO order3;
	OrderOnUserVO order4;
	ResultMsg r11;
	ResultMsg r22;
	ResultMsg r33;
	ResultMsg r44;
	
	@Before
	public void setUp() {
		order1 = new OrderOnUserVO(new User("txin",100,"18805156300","151250132@smail.nju.edu.cn"),"42654645437",
				OrderState.UNEXECUTED,105, "2016-10-15 24:00",RoomType.ROOM_STANDARD,1,1,false);
		order2 = new OrderOnUserVO(new User("txin",100,"18805156300","151250132@smail.nju.edu.cn"),"42654645437",
				OrderState.ABNORMAL,105, "2016-10-16 24:00",RoomType.ROOM_STANDARD,1,1,false);
		order3 = new OrderOnUserVO(new User("txin",100,"18805156300","151250132@smail.nju.edu.cn"),"42654645437",
				OrderState.CANCELLED,105, "2016-10-17 24:00",RoomType.ROOM_STANDARD,1,1,false);
		order4 = new OrderOnUserVO(new User("txin",100,"18805156300","151250132@smail.nju.edu.cn"),"42654645437",
				OrderState.EXECUTED,105, "2016-10-15 24:00",RoomType.ROOM_STANDARD,1,1,false);
		userBLServiceImpl = new OrderOnUserBLServiceImpl();
		userBLServiceImpl.createOrder(order1);
		userBLServiceImpl.createOrder(order2);
		userBLServiceImpl.createOrder(order3);
		userBLServiceImpl.createOrder(order4);
		r11 = new ResultMsg(true, "撤销成功!");
		r22 = new ResultMsg(false, "异常订单，不可撤销！");
		r33 = new ResultMsg(false, "请勿重复操作！");
		r44 = new ResultMsg(false, "该订单已经执行，不可撤销！");
	}
	
	@Test
	public void testPersonalOrderScan(){
		ArrayList<OrderOnUserVO> userList = userBLServiceImpl.personalOrderScan();
		assertEquals(order1,userList.get(0));
		assertEquals(order2,userList.get(1));
		assertEquals(order3,userList.get(2));
		assertEquals(order4,userList.get(3));
	}
	
	@Test
	public void testPersonalOrderCancel(){
		ResultMsg r1 = userBLServiceImpl.personalOrderCancel(order1);
		ResultMsg r2 = userBLServiceImpl.personalOrderCancel(order2);
		ResultMsg r3 = userBLServiceImpl.personalOrderCancel(order3);
		ResultMsg r4 = userBLServiceImpl.personalOrderCancel(order4);
		assertSame(r11.getMessage(), r1.getMessage());
		assertSame(r22.getMessage(), r2.getMessage());
		assertSame(r33.getMessage(), r3.getMessage());
		assertSame(r44.getMessage(), r4.getMessage());
		assertSame(r11.isPass(), r1.isPass());
		assertSame(r22.isPass(), r2.isPass());
		assertSame(r33.isPass(), r3.isPass());
		assertSame(r44.isPass(), r4.isPass());
	}
	
	@Test
	public void testPersonalOrderDetail(){
		OrderOnUserMsg msg1 = userBLServiceImpl.personalOrderDetail(order1);
		assertEquals(order1.getInitiator(), msg1.getInitiator());
		assertEquals(order1.getOrderState(), msg1.getOrderState());
		assertEquals(order1.getPrice(), msg1.getPrice());
		assertEquals(order1.getLatestExecutionTime(), msg1.getLatestExecutionTime());
		assertEquals(order1.getRoomType(), msg1.getRoomType());
		assertEquals(order1.getRoomNumber(), msg1.getRoomNumber());
		assertEquals(order1.getPeopleNumber(), msg1.getPeopleNumber());
		assertEquals(order1.getHasChild(), msg1.getHasChild());
	}
	
}
