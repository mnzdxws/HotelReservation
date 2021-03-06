package businesslogicserviceimpl.hotelblserviceimpl;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import businesslogic.util.ResultMsg;
import businesslogic.util.RoomMsg;
import businesslogic.util.RoomState;
import businesslogic.util.RoomType;
import vo.RoomInfoVO;

public class RoomAddBLServiceImplTest {

	RoomAddBLServiceImpl impl;
	ArrayList<RoomInfoVO> roomList;
	RoomInfoVO room1;
	RoomInfoVO room2;
	RoomInfoVO room3;
	RoomInfoVO room4;
	
	RoomMsg roomMsg;
	ResultMsg reMsg1;
	ResultMsg reMsg2;
	
	
	
	@Before
	public void setUp() {
		room1=new RoomInfoVO(RoomState.USABLE,RoomType.ROOM_STANDARD,5,1599);
		room2=new RoomInfoVO(RoomState.UNUSABLE,RoomType.ROOM_STANDARD,10,1435);
		room3=new RoomInfoVO(RoomState.USABLE,RoomType.ROOM_BIGBED,0,233);
		room4=new RoomInfoVO(RoomState.USABLE,RoomType.ROOM_PRESIDENTIAL,2,159999);
				
				
		impl = new RoomAddBLServiceImpl();
		
		roomList = impl.roomList;
		roomList.add(room1);
		roomList.add(room2);
		roomList.add(room3);
		roomList.add(room4);
		
		
		roomMsg = new RoomMsg(RoomState.USABLE,RoomType.ROOM_STANDARD,5,1599);
		reMsg1=new ResultMsg(true,"���ӳɹ�");
		reMsg2=new ResultMsg(false,"����ʧ��");
	}

	@Test
	public  void  testaddRoom(){
		RoomMsg msg1 = impl.addRoom(room1);
		assertEquals(msg1.getState(), roomMsg.getState());
		assertEquals(msg1.getType(), roomMsg.getType());
		assertEquals(msg1.getNumber(), roomMsg.getNumber());
		assertEquals(msg1.getPrice(), roomMsg.getPrice());
	}
	
	@Test
	public void testupdateRoom(){
		ResultMsg msg1 = impl.updateRoom(room1); 
		assertEquals(msg1.getMessage(), reMsg1.getMessage());
		ResultMsg msg2 = impl.updateRoom(room2); 
		assertEquals(msg2.getMessage(), reMsg2.getMessage());
    }
}
