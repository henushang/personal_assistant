package com.henushang.pa.service.base;

public interface BaseService<T> {
	public boolean add(T t);

	public boolean delete(String id);

	public T getOne(String id);
}
