package com.henushang.pa.dao;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import com.henushang.pa.dao.impl.BirthdayInfoDaoImpl;
import com.henushang.pa.domain.birth_alert.BirthdayInfo;
import com.henushang.pa.util.DateUtil;
import com.henushang.pa.util.UUIDUtil;

public class BirthdayInfoDaoTest {
	
	BirthdayInfoDao dao = new BirthdayInfoDaoImpl();
	
	@Test
	public void testInsertOne() {
		BirthdayInfo info = getBirthdayInfo();
		boolean result = dao.insert(info);
		Assert.assertTrue(result);
	}
	
	@Ignore
	@Test
	public void testFindOne() {
		BirthdayInfo info = getBirthdayInfo();
		dao.insert(info);
		BirthdayInfo queryResult = dao.getOne(info.get_id());
		Assert.assertNotNull(queryResult);
	}
	
	@Ignore
	@Test
	public void testDelete() {
		BirthdayInfo info = getBirthdayInfo();
		dao.insert(info);
		boolean result = dao.delete(info.get_id());
		Assert.assertTrue(result);
	}
	
	private BirthdayInfo getBirthdayInfo() {
		String id= UUIDUtil.getId();
		BirthdayInfo info = new BirthdayInfo();
		info.set_id(id);
		info.setName("商建国");
		info.setBirthday(DateUtil.after(1));
		info.setCreateTime(Calendar.getInstance().getTime());
		info.setUpdateTime(Calendar.getInstance().getTime());
		info.setToEmail("henushang@qq.com");
		info.setUserId("1");
		return info;
	}
	
	@Ignore
	@Test
	public void initData() {
	    BirthdayInfo info = getBirthdayInfo();
	    Assert.assertTrue(dao.insert(info));
	}
}
