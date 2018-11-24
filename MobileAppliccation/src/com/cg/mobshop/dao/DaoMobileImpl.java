package com.cg.mobshop.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
import com.cg.mobshop.dto.Mobiles;

@Repository("daoObj")
public class DaoMobileImpl implements IDaoMobile 
{
	@PersistenceContext
	EntityManager entitymanager;

	@Override
	public List<Mobiles> getAllMobiles()
	{
		String str="select mobile from Mobiles mobile";
		TypedQuery<Mobiles> queryOne=(TypedQuery<Mobiles>) entitymanager.createQuery(str,Mobiles.class);
		List<Mobiles> myList=queryOne.getResultList();
		return myList;
	}

	@Override
	public Mobiles getMobileDetails(int mobid)
	{
		Mobiles mobile = entitymanager.find(Mobiles.class, mobid);
		return mobile;
	}

	@Override
	public List<Mobiles> delete(int mobid) 
	{
		Mobiles mobile = getMobileDetails(mobid);
		entitymanager.remove(mobile);
		return getAllMobiles();
		
	}

	@Override
	public int updateMobile(Mobiles mob) {
		
		entitymanager.merge(mob);
		return mob.getMobileId();
	}
	
}
