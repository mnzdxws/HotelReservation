package po;

import java.io.Serializable;
import business.util.*;

/**
 * ��ʾ�Ƶ�Ӫ�����Ե�PO
 * @author Kevin
 *
 */

public class PromotionHotelPO implements Serializable {
	private static final long serialVersionUID = 5894748451667870139L;
	
	public PromotionHotelPO(PromotionHotelType type,String customType,String timeBegin,String timeOver,String ratio) {
		// TODO Auto-generated constructor stub
		super();
		this.type = type;
		this.customType = customType;
		this.timeBegin = timeBegin;
		this.timeOver = timeOver;
		this.ratio = ratio;
	}
	
	/**
	 * ������������
	 */
	PromotionHotelType type = null;
	
	/**
	 * ��������������Ⱥ����
	 */
	String customType = null;
	
	/**
	 * �������Կ�ʼʱ��
	 */
	String timeBegin = null;
	
	/**
	 * �������Խ���ʱ��
	 */
	String timeOver = null;
	
	/**
	 * �������Դ��۱���
	 */
	String ratio = null;
	
	public PromotionHotelType getType() {
		return type;
	}
	
	public String getCustomType() {
		return customType;
	}
	
	public String getTimeBegin() {
		return timeBegin;
	}
	
	public String getTimeOver() {
		return timeOver;
	}
	
	public String getRatio() {
		return ratio;
	}
	
}