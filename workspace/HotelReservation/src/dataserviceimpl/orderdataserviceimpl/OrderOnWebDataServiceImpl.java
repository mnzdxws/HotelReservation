package dataserviceimpl.orderdataserviceimpl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import businesslogic.util.User;
import po.OrderOnWebPO;

public class OrderOnWebDataServiceImpl {

	ArrayList<OrderOnWebPO> webPOs;
	
	public OrderOnWebDataServiceImpl(){
		webPOs = new ArrayList<>();
	}
	
	
	/**
	 * �����ݿ��в��뵥һ�־û�����
	 */
	public boolean insert(OrderOnWebPO po) throws RemoteException{
		if(webPOs.add(po))
			return true;
		else
			return false;
	}
	
	
	/**
	 * �����ݿ���ɾ����һ�־û�����
	 */
	public boolean delete(OrderOnWebPO po) throws RemoteException{
		if(webPOs.remove(po))
			return true;
		else
			return false;
	}
	
	
	/**
	 * �����ݿ��и��µ�һ�־û�����
	 */
	public boolean update(OrderOnWebPO po) throws RemoteException{
		for (OrderOnWebPO op : webPOs) {
			if(op.getInitiator() == po.getInitiator()){
				op = po;
				return true;
			}
		}
		return false;
	}
	
	
	/**
	 * ��������Ϣ���в��ҷ�����Ӧ��OrderOnWebPO���
	 */
	public ArrayList<OrderOnWebPO> find(User initiator) throws RemoteException{
		ArrayList<OrderOnWebPO> arrayList = new ArrayList<OrderOnWebPO>();
		for (OrderOnWebPO op : webPOs) {
			if(op.getInitiator().getName().equals(initiator.getName())){
				arrayList.add(op);
			}
		}
		return arrayList;
	}
	
	
	/**
	 * �������оƵ궩��PO
	 */
	public ArrayList<OrderOnWebPO> show() throws RemoteException{
		return webPOs;
	}
	
}