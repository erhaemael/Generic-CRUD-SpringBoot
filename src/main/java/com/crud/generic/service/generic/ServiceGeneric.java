package com.crud.generic.service.generic;

import java.util.List;

import com.crud.generic.entity.baseEntity.BaseEntity;

public interface ServiceGeneric<T extends BaseEntity>  {
	
	List<T> findAll() throws Exception;
	T getById(Long id) throws Exception;
	T save(T entity) throws Exception;
	void delete(Long id) throws Exception;
	
}
