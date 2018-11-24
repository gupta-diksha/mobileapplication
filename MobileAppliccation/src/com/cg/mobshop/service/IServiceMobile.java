package com.cg.mobshop.service;

import java.util.List;

import com.cg.mobshop.dto.Mobiles;

public interface IServiceMobile 
{
	
	public List<Mobiles> getAllMobiles();
	public Mobiles getMobileDetails(int mobid);
	public List<Mobiles> delete(int mobid);
	public int updateMobile(Mobiles mob);
}
