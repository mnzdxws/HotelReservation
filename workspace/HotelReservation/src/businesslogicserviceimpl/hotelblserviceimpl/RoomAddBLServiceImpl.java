package businesslogicserviceimpl.hotelblserviceimpl;

import java.util.ArrayList;

import businesslogic.util.ResultMsg;
import businesslogic.util.RoomMsg;
import businesslogic.util.RoomState;
import vo.RoomInfoVO;

public class RoomAddBLServiceImpl {
	ArrayList<RoomInfoVO> roomList;
	
	public RoomAddBLServiceImpl() {
		roomList = new ArrayList<RoomInfoVO>();
	}
	
	/**
	 * ���ӿ��ÿͷ�
	 *
	 */
	public RoomMsg addRoom(RoomInfoVO roomInfoVO){
		return new RoomMsg(roomInfoVO.getState(),roomInfoVO.getType(),roomInfoVO.getNumber(),
				roomInfoVO.getPrice());
	}
	
	/**
	 * ���¿ͷ���Ϣ
	 * 
	 */
    public ResultMsg updateRoom(RoomInfoVO roomInfoVO){
    	if(roomInfoVO.getState()==RoomState.USABLE){
    		return new ResultMsg(true,"���ӳɹ�");
    	}
    	else{
    		return new ResultMsg(false,"����ʧ��");
    	}
    	
    }
	
}