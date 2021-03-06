package businesslogicservice.userblservice;

import java.util.ArrayList;

import vo.UserIDVO;
import vo.UserInfoVO;



/**
 * 网站管理人员对网站的操作
 * @author 曹畅
 *
 */
public interface WebManagerWebsiteManagementBLService{
        
	
		
		
	/**
	 * 查看用户个人信息
	 * @param 用户IDVO
	 * @return 用户个人信息VO
	 */
	public UserInfoVO UserInformationInquiry(UserIDVO vo);
		
	/**
	 * 修改用户信息
	 * @param 用户IDVO
	 * @param 用户个人信息VO
	 * @return 修改结果
	 */
	public boolean UserInformationModification(UserIDVO vo1,UserInfoVO vo2);
	
	/**
	 * 查看网站营销人员列表
	 * @return 网站营销人员列表
	 */
	public ArrayList<UserInfoVO> WebStuffScan();
	
	
	/**
	 * 添加网站营销人员
	 * @param 用户IDVO
	 */
	public boolean WebsiteStuffAdd(UserIDVO vo);
		
}