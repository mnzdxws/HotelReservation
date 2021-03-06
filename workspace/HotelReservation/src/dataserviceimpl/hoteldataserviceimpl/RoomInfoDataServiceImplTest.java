package dataserviceimpl.hoteldataserviceimpl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.rmi.RemoteException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import businesslogic.util.RoomState;
import businesslogic.util.RoomType;
import businesslogic.util.User;
import po.RoomInfoPO;

public class RoomInfoDataServiceImplTest {

	RoomInfoDataServiceImpl impl;
	ArrayList<RoomInfoPO> list;
	RoomInfoPO room1;
	RoomInfoPO room2;
	RoomInfoPO room3;
	RoomInfoPO room4;
	
	@Before
	public void setUp(){
		impl = new RoomInfoDataServiceImpl();
		room1=new RoomInfoPO(RoomState.USABLE,RoomType.ROOM_STANDARD,5,1599);
		room2=new RoomInfoPO(RoomState.UNUSABLE,RoomType.ROOM_STANDARD,10,1435);
		room3=new RoomInfoPO(RoomState.USABLE,RoomType.ROOM_BIGBED,0,233);
		room4=new RoomInfoPO(RoomState.USABLE,RoomType.ROOM_PRESIDENTIAL,2,159999);
		list = new ArrayList<>();
	}
	
	@Test
	public void testInsert() throws RemoteException{
		boolean b = impl.insert(room1);
		assertTrue(b);
	}
	
	@Test
	public void testDelete() throws RemoteException{
		impl.insert(room1);
		boolean b = impl.delete(room1);
		assertTrue(b);
	}
	
	@Test
	public void testUpdate() throws RemoteException{
		impl.insert(room1);
		boolean b = impl.update(room1);
		assertTrue(b);
	}
	
	@Test
	public void testFind() throws RemoteException{
		impl.insert(room1);
		impl.insert(room2);
		ArrayList<RoomInfoPO> arrayList = impl.find(new RoomInfoPO(RoomState.USABLE,RoomType.ROOM_PRESIDENTIAL,2,159999));
		list.add(room1);
		list.add(room2);
		assertEquals(list.get(0), arrayList.get(0));
		assertEquals(list.get(1), arrayList.get(1));
	}

	@Test
	public void testShow() throws RemoteException{
		impl.insert(room1);
		impl.insert(room2);
		impl.insert(room3);
		impl.insert(room4);
		list.add(room1);
		list.add(room2);
		list.add(room3);
		list.add(room4);
		ArrayList<RoomInfoPO> arrayList = impl.show();
		assertEquals(list, arrayList);
	}
}
