package com.henushang.pa.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.henushang.pa.dao.BirthdayInfoDao;
import com.henushang.pa.dao.db.MongoUtil;
import com.henushang.pa.domain.birth_alert.BirthdayInfo;

@Repository("birthdayInfoDao")
public class BirthdayInfoDaoImpl implements BirthdayInfoDao {

    private static String collName = "birthday_info";

    public boolean insert(BirthdayInfo t) {
        return MongoUtil.insertOne(collName, t);
    }

    public BirthdayInfo getOne(String _id) {
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("_id", _id);
        BirthdayInfo info = MongoUtil.findOne(collName, queryMap, BirthdayInfo.class);
        return info;
    }

    public boolean delete(String _id) {
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("_id", _id);
        return MongoUtil.delete(collName, queryMap);
    }

    public boolean delete(String collName, Map<String, Object> query) {
        return MongoUtil.delete(collName, query);
    }

    public List<BirthdayInfo> getListByQueryMap(Map<String, Object> queryMap) {
        return MongoUtil.findList(collName, queryMap, BirthdayInfo.class);
    }

}
