package com.cg.mobshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.mobshop.dao.IDaoMobile;
import com.cg.mobshop.dto.Mobiles;

@Service("servObj")
@Transactional
public class ServiceMobileImpl implements IServiceMobile
{
	@Autowired
	IDaoMobile daoObj;
	
	@Override
	public List<Mobiles> getAllMobiles() {
		
		return daoObj.getAllMobiles();
	}

	@Override
	public Mobiles getMobileDetails(int mobid) {
		
		return daoObj.getMobileDetails(mobid);
	}

	@Override
	public List<Mobiles> delete(int mobid) {
		// TODO Auto-generated method stub
		return daoObj.delete(mobid);
	}

	@Override
	public int updateMobile(Mobiles mob) {
		// TODO Auto-generated method stub
		return daoObj.updateMobile(mob);
	}
	
}
