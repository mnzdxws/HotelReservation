package vo;

import java.util.ArrayList;

import businesslogic.util.OrderState;
import businesslogic.util.RoomType;

/**
 * 客户订单VO
 * 
 * @author txin
 *
 */
public class OrderOnUserVO extends OrderVO{
	
	/**
	 * 订单发起人
	 */
	public String initiator;
	
	/**
	 * 订单状态
	 */
	public OrderState orderState;
	
	/**
	 * 入住时间
	 */
	public String checkInTime;
	
	/**
	 * 退房时间
	 */
	public String checkOutTime;
	
	/**
	 * 最晚执行时间
	 */
	public String latestExecutionTime;
	
	/**
	 * 房间类型
	 */
	public RoomType roomType;
	
	/**
	 * 房间数量
	 */
	public int roomNumber;
	
	/**
	 * 入住人数
	 */
	public int peopleNumber;
	
	/**
	 * 是否携带儿童
	 */
	public boolean hasChild;
	
	/**
	 * 手机号码
	 */
	public String phoneNumber;
	
	/**
	 * 邮箱地址
	 */
	public String emailAddress;
	
	public OrderOnUserVO(String initiator,OrderState orderState,String checkInTime,String checkOutTime,
		String latestExecutionTime,RoomType roomType,int roomNumber,int peopleNumber,boolean hasChild,String phoneNumber,String emailAddress) {
		super();
		this.initiator = initiator;
		this.orderState = orderState;
		this.checkInTime = checkInTime;
		this.checkOutTime = checkOutTime;
		this.latestExecutionTime = latestExecutionTime;
		this.roomType = roomType;
		this.roomNumber = roomNumber;
		this.peopleNumber = peopleNumber;
		this.hasChild = hasChild;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}
	
	@Override
	public String toString(){
		return initiator;
	}
	
    public boolean hasChild() {
        return hasChild;
    }

    public String getInitiator() {
        return initiator;
    }
	
	public OrderState getOrderState() {
		return orderState;
	}
	
	public String getCheckInTime() {
		return checkInTime;
	}
	
	public String getCheckOutTime() {
		return checkOutTime;
	}
	
	public String getLatestExecutionTime() {
		return latestExecutionTime;
	}
	
	public RoomType getRoomType() {
		return roomType;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	
	public int getPeopleNumber() {
		return peopleNumber;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}


}
