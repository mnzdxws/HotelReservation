package po;

import java.io.Serializable;
import businesslogic.util.OrderState;
import businesslogic.util.RoomType;

/**
 * ���ж���VO�ĸ���
 * 
 * @author txin
 *
 */
public abstract class OrderVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5768739830941620932L;
	
	/**
	 * ����������
	 */
	public String initiator;
	
	/**
	 * ����״̬
	 */
	public OrderState orderState;

	/**
	 * ��������
	 */
	public RoomType roomType;
	
	/**
	 * ��������
	 */
	public int roomNumber;
	
	/**
	 * ��ס����
	 */
	public int peopleNumber;
	
	/**
	 * �Ƿ�Я����ͯ
	 */
	public boolean hasChild;

	public boolean hasChild() {
        return hasChild;
    }

    public String getInitiator() {
        return initiator;
    }
	
	public OrderState getOrderState() {
		return orderState;
	}

	public String getRoomType() {
		return roomType;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	
	public int getPeopleNumber() {
		return peopleNumber;
	}
	
	public boolean hasChild() {
        return hasChild;
    }

    public String setInitiator(String initiator) {
        this.initiator = initiator;
    }
	
	public OrderState setOrderState(OrderState orderState) {
		this.orderState = orderState;
	}
	
	public String setCheckInTime(String checkInTime) {
		this.checkInTime = checkInTime;
	}
	
	public String setCheckOutTime(String checkOutTime) {
		this.checkOutTime = checkOutTime;
	}
	
	public String setLatestExecutionTime(String latestExecutionTime) {
		this.latestExecutionTime = latestExecutionTime;
	}
	
	public RoomType setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}
	
	public int setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public int setPeopleNumber(int peopleNumber) {
		this.peopleNumber = peopleNumber;
	}
}