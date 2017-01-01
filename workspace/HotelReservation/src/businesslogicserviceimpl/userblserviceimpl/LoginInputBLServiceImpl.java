package businesslogicserviceimpl.userblserviceimpl;

import businesslogicservice.userblservice.LoginInputBLService;
import dataserviceimpl.userdataserviceimpl.UserManagementDataServiceImpl;
import vo.LoginInputVO;


/**
 * �û���¼
 * @author �ܳ�
 *
 */
public class LoginInputBLServiceImpl implements LoginInputBLService {

	UserManagementDataServiceImpl data=new UserManagementDataServiceImpl();
	
	
	/**
	 * ��¼
	 * @param ��¼������ϢVO
	 * @return ��¼���
	 */
    public boolean  LogIn(LoginInputVO vo){
    	String pass=vo.getUserpassword();
    	String real=data.GetLoginInfo(vo);
    	return real.equals(pass);
    	
    }
	
	
    /**
	 * �ǳ�	
	 * @param ��¼������ϢVO
	 * @return �ǳ����
	 */
	public boolean LogOut(boolean ok){
		if(ok){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	/**
	 * ע��	
	 * @param ��¼������ϢVO
	 * @return ע����
	 */
	public String Register(LoginInputVO vo){
		return data.AddUser(vo);
	}
}