package com.henushang.pa.domain.birth_alert;

import java.util.Date;

import com.henushang.pa.util.JSONUtil;

public class BirthdayInfo {
	private String _id;
	private String name;
	private String gender; // 0男 1女
	private String birthday; // yyyy-MM-dd
	private String monthDay;
	private int isSolar; // 1:阳历生日  0:阴历生日
	private Date createTime;
	private Date updateTime;
	private String userId; // 创建用户的id
	private String toEmail;
	
	public BirthdayInfo() {
        this.createTime = new Date();
        this.updateTime = new Date();
    }

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
		this.setMonthDay(birthday.substring(5));
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	@Override
	public String toString() {
		return JSONUtil.toJson(this);
	}

	public int getIsSolar() {
		return isSolar;
	}

	public void setIsSolar(int isSolar) {
		this.isSolar = isSolar;
	}

    public String getMonthDay() {
        return monthDay;
    }

    public void setMonthDay(String monthDay) {
        this.monthDay = monthDay;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getToEmail() {
        return toEmail;
    }

    public void setToEmail(String toEmail) {
        this.toEmail = toEmail;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
	
}
