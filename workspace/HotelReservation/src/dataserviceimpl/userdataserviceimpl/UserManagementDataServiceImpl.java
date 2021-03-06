package dataserviceimpl.userdataserviceimpl;

import java.util.ArrayList;

import dataservice.userdataservice.UserManagementDataService;
import vo.HotelIDVO;
import vo.LoginInputVO;
import vo.StuffInfoVO;
import vo.UserIDVO;
import vo.UserInfoVO;

public class UserManagementDataServiceImpl implements UserManagementDataService {

	int number;
	int point;
	ArrayList<String> ID;
	ArrayList<String> password;
	ArrayList<UserInfoVO> info;
	String id;
	ArrayList<String> stuffhotel;
	ArrayList<String> webstuff;
	
	public UserManagementDataServiceImpl(){
		point=0;
		ID=new ArrayList<>();
		password=new ArrayList<>();
		info=new ArrayList<>();
		number=0;
		stuffhotel=new ArrayList<>();
		webstuff=new ArrayList<>();
	}
	
	@Override
	public String GetLoginInfo(LoginInputVO vo) {
		id=vo.getUserid();
		point=ID.indexOf(id);
		return password.get(point);
	}

	@Override
	public String AddUser(LoginInputVO vo) {
		point=password.size();
		String pass=vo.getUserpassword();
		password.add(pass);
		id="";
		for(int i=0;i<9-number/10;i++){
			id=id+"0";
		}
		return id+number;
	}

	@Override
	public UserInfoVO GetUserBaseInfo(UserIDVO vo) {
		id=vo.getUserID();
		point=ID.indexOf(id);
		return info.get(point);
	}

	@Override
	public boolean SetUserBaseInfo(UserIDVO vo1, UserInfoVO vo2) {
		id=vo1.getUserID();
		point=ID.indexOf(id);
		info.set(point, vo2);
		return true;
	}

	public boolean addHotelStuff(HotelIDVO vo1,UserIDVO vo3){
		point=stuffhotel.indexOf(vo3.getUserID());
		if(point!=-1){
			return false;
		}
		else{
			StuffInfoVO vo2=(StuffInfoVO)info.get(point);
			vo2.setHotel(vo1);
			info.set(point, vo2);
			return true;
			}
	}
	
	public boolean addWebStuff(UserIDVO vo){
		point=webstuff.indexOf(vo.getUserID());
		if(point!=-1){
			return false;
		}
		else{
			webstuff.add(vo.getUserID());
			return true;
			}
	}
}
