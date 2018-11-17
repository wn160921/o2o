package o2o.dao;


import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import o2o.BaseTest;
import o2o.entity.Area;

public class AreaDaoTest extends BaseTest{
	@Autowired
	private AreaDao areaDao;
	
	@Test
	public void tesstQueryArea() {
		List<Area> areaList = areaDao.queryArea();
		assertEquals(4,areaList.size());
	}
}
