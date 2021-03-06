package businesslogicserviceimpl.userblserviceimpl;

import java.util.ArrayList;

import vo.UserIDVO;
import vo.UserInfoVO;
import businesslogicservice.userblservice.WebManagerWebsiteManagementBLService;
import dataserviceimpl.userdataserviceimpl.UserManagementDataServiceImpl;



/**
 * 网站管理人员对网站的操作
 * @author 曹畅
 *
 */
public class WebManagerWebsiteManagementBLServiceImpl implements WebManagerWebsiteManagementBLService {

	UserManagementDataServiceImpl check;
	
	public WebManagerWebsiteManagementBLServiceImpl(){
		check=new 	UserManagementDataServiceImpl();
	}
	
	/**
	 * 查看用户个人信息
	 * @param 用户IDVO
	 * @return 用户个人信息VO
	 */
	public UserInfoVO UserInformationInquiry(UserIDVO vo){
		return check.GetUserBaseInfo(vo);
	}
			
	
	/**
	 * 修改用户信息
	 * @param 用户IDVO
	 * @param 用户个人信息VO
	 * @return 修改结果
	 */
	public boolean UserInformationModification(UserIDVO vo1,UserInfoVO vo2){
		return check.SetUserBaseInfo(vo1,vo2);
	}
			
	/**
	 * 添加网站营销人员
	 * @param 用户IDVO
	 */
	public boolean WebsiteStuffAdd(UserIDVO vo){
		return check.addWebStuff(vo);
	}

	/**
	 * 查看网站营销人员列表
	 * @return 网站营销人员列表
	 */
	public ArrayList<UserInfoVO> WebStuffScan() {
		// TODO Auto-generated method stub
		return null;
	}
}
