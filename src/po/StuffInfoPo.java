package po;

import java.io.Serializable;

public class StuffInfoPo implements Serializable{

    
	private static final long serialVersionUID = -7187002330817151504L;
	
	 private String userid;
		
	private String username;
		
	private String contact;
		
	private HotelIDVo hotelvo;
		
		
	public StuffInfoPo(String userid,String username,String contact,HotelIDVo vo){
		    this.userid=userid;
			this.username=username;
			this.ucontact=contact;
			this.hotelvo=vo;
	}
		
	public String getUserid(){
		    return userid;
	}
		
	public String getUsername(){
		    return username;
	}
		
	public String getContact(){
		    return contact;
	}
		
	public HotelIDVo getHotel(){
			return hotelvo;
	}
}