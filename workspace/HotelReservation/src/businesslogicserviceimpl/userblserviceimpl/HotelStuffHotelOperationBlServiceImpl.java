package businesslogicserviceimpl.userblserviceimpl;

import java.util.ArrayList;

import businesslogic.util.ResultMsg;
import businesslogicservice.userblservice.HotelStuffHotelOperationBlService;
import businesslogicserviceimpl.hotelblserviceimpl.HotelInfoMaintainBLServiceImpl;
import businesslogicserviceimpl.hotelblserviceimpl.RoomAddBLServiceImpl;
import businesslogicserviceimpl.orderblserviceimpl.OrderOnHotelBLServiceImpl;
import vo.HotelIDVO;
import vo.HotelInfoVO;
import vo.OrderOnHotelVO;
import vo.PromotionHotelVO;
import vo.RoomInfoVO;
import vo.UserIDVO;



/**
 * �Ƶ깤����Ա�ԾƵ���еĲ���
 * @author �ܳ�
 *
 */
public class HotelStuffHotelOperationBlServiceImpl implements HotelStuffHotelOperationBlService {

	HotelInfoVO hotel;
	HotelInfoMaintainBLServiceImpl mod;
	OrderOnHotelBLServiceImpl order;
	RoomAddBLServiceImpl room;
	
	public HotelStuffHotelOperationBlServiceImpl(){
		mod=new HotelInfoMaintainBLServiceImpl();
		order=new OrderOnHotelBLServiceImpl();
		room=new RoomAddBLServiceImpl();
	}
	
	
	/**
	 * �鿴�Ƶ���Ϣ	
	 * @param �Ƶ�IDVO
	 * @return �Ƶ���ϢVO
	 */
	public HotelInfoVO HotelInformationInquiry(HotelIDVO vo){
		return null;
	}
			
	/**
	 * �޸ľƵ���Ϣ	
	 * @param �Ƶ�VO
	 * @param �û�IDVO
	 * @return �޸Ľ��
	 */
	public ResultMsg HotelInformationModification(HotelInfoVO vo1,UserIDVO vo2){
		return mod.submitInfo(vo1);
	}
			
	
	/**
	 * �����Ƶ��������	
	 * @param �Ƶ�IDVO
	 * @param �Ƶ��������VO
	 * @return �޸Ľ��
	 */
	public boolean HotelStrategeManage(HotelIDVO vo1,PromotionHotelVO vo){
		return false;
	}
			
	/**
	 * ���¶���״̬	
	 * @param �û�IDVO
	 * @param ����VO
	 */
	public ResultMsg OrderStateUpdate(UserIDVO vo1,OrderOnHotelVO vo2){
		return order.hotelOrderModify(vo2);
	}
			
	/**
	 * ����Ƶ궩��	
	 * @param �Ƶ�IDVO
	 * @return ����VO�б�
	 */
	public ArrayList<OrderOnHotelVO> OrderScan(HotelIDVO vo){
		return order.hotelOrderScan();
	}

	/**
	 * �鿴�Ƶ��������
	 * @param �Ƶ�IDVO
	 * @return �Ƶ���������б�
	 */
	public ArrayList<PromotionHotelVO> HotelPromotionInquire(HotelIDVO vo) {
		return null;
	}

	/**
	 * ���·�����Ϣ
	 * @param ������ϢVO
	 */
	public ResultMsg UpdateRoomState(RoomInfoVO vo) {
		return room.updateRoom(vo);
		
	}
}