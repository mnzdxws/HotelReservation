package businesslogicservice.orderblservice;

import java.util.ArrayList;
import businesslogic.util.OrderMsg;
import businesslogic.util.ResultMsg;
import vo.OrderOnWebVO;

/**
 * ��վӪ����Ա�鿴�����б����������鿴һ�������б�������
 * 
 * @author txin
 *
 */
public interface OrderOnWebBLService {
	
	/**
	 * ��վӪ����Ա�鿴�����б�
	 *
	 * @param void
	 * @return �����б�
	 */
	public ArrayList<OrderOnWebVO> complaintListScan();
	
	/**
	 * ��վӪ����Ա��������
	 *
	 * @param orderVO ����VO
	 * @return ϵͳ��ʾ��Ϣ
	 */
	public ResultMsg complaintHandle(OrderOnWebVO orderVO);
	
	/**
	 * ��վӪ����Ա�鿴�쳣�����б�
	 *
	 * @param void
	 * @return �쳣�����б�
	 */
	public ArrayList<OrderOnWebVO> abnormalOrderScan();
	
	/**
	 * ��վӪ����Ա�鿴�쳣��������
	 *
	 * @param orderVO ����VO
	 * @return ���˶�������
	 */
	public OrderMsg abnormalOrderDetail(OrderOnWebVO orderVO);
	
}