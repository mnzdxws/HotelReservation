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
	 * 在数据库中插入单一持久化对象
	 */
	public boolean insert(OrderOnWebPO po) throws RemoteException{
		if(webPOs.add(po))
			return true;
		else
			return false;
	}
	
	
	/**
	 * 在数据库中删除单一持久化对象
	 */
	public boolean delete(OrderOnWebPO po) throws RemoteException{
		if(webPOs.remove(po))
			return true;
		else
			return false;
	}
	
	
	/**
	 * 在数据库中更新单一持久化对象
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
	 * 按搜索信息进行查找返回相应的OrderOnWebPO结果
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
	 * 返回所有酒店订单PO
	 */
	public ArrayList<OrderOnWebPO> show() throws RemoteException{
		return webPOs;
	}
	
}
