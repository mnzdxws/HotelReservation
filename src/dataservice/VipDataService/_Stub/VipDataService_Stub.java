package dataservice.PromotionDataService._Stub;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.rmi.RemoteException;
import business.util.*;

import po.VipPO;


import po.VipPO;

public class VipDataService_Stub {
	private VipPO VipPO1;
	private VipPO VipPO2;
	private ArrayList<VipPO> VipPOs;
	private String name;
	private ArrayList<int[]> VipLevel;
	
	public VipDataService_Stub(){
		int[4] list= {100,200,300,400};
		VipLevel.add(list);
		VipPO1 = new VipPO("Tom",VipLevel,4,"生日促销策略",COMMON_VIP);
		VipPO2 = new VipPO("Jerry",VipLevel,3,"生日促销策略",COMMON_VIP);
		VipPOs = new ArrayList<VipPO>();
		VipPOs.add(VipPO1);
		VipPOs.add(VipPO2);
	}


	@Override
	public VipPO findByLevel(int level) throws RemoteException {
		return VipPO1;
	}
	
	@Override
	public ArrayList<VipPO> show() throws RemoteException {
		return VipPOS;
	}
	
	
}