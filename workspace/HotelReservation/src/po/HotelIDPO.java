package po;

import java.io.Serializable;

public class HotelIDPO implements Serializable{
    
	
	
	private static final long serialVersionUID = -7187002330817151504L;
	
	private String HotelID;
		
	public HotelIDPO(String HotelID){
		    this.HotelID=HotelID;
	}
		
	public String getHotelID(){
		    return HotelID;
	}
}