package com.henushang.pa.service;

import java.util.List;

import com.henushang.pa.domain.birth_alert.BirthdayInfo;
import com.henushang.pa.service.base.BaseService;

public interface BirthdayInfoService extends BaseService<BirthdayInfo> {
	
	/**
	 * 获取day天以后的生日列表，如果day为正数，则为day天以后；如果day为负数，则为day天以前
	 * @param day
	 * @return List<BirthdayInfo>
	 */
	public List<BirthdayInfo> getList(String userId, int day);
	
	public void sendMail(List<BirthdayInfo> list);
}
