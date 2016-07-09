package com.henushang.pa.dao;

import java.util.List;
import java.util.Map;

public interface BaseDao<T> {
	
	public boolean insert(T t);
	
	public T getOne(String _id);
	
	public boolean delete(String _id);
	
	public List<T> getListByQueryMap(Map<String, Object> queryMap);
	
}
