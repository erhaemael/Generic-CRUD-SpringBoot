package com.crud.generic.controller.generic.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crud.generic.controller.generic.ControllerGeneric;
import com.crud.generic.entity.baseEntity.BaseEntity;
import com.crud.generic.service.generic.ServiceGeneric;

@SuppressWarnings({ "unchecked", "rawtypes" })
@ResponseBody
public class ControllerGenericImpl<T extends BaseEntity> implements ControllerGeneric<T> {
	
	@Autowired
	private ServiceGeneric<T> genericService;

	@Override
	@PostMapping("/post")
	public ResponseEntity<Object> save(T entity) {
		try {
			return new ResponseEntity(genericService.save(entity),HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity("Error!", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@Override
	@GetMapping("/get")
	public ResponseEntity<T> findAll() {
		try {
			return new ResponseEntity(genericService.findAll(), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity("Error!", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/hello-world")
	public ResponseEntity<String> get() {
		return ResponseEntity.ok("Hello World!");
	}
	
	@Override
	@GetMapping("/get/{id}")
	public ResponseEntity<Object> getById(@PathVariable("id") Long id)   
	{  
		try {
			return new ResponseEntity(genericService.getById(id), HttpStatus.OK); 
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity("Error!", HttpStatus.INTERNAL_SERVER_ERROR);
		} 
	} 
	
	@Override
	@DeleteMapping("/{id}")	
	public ResponseEntity<String> delete(@PathVariable("id") Long id) {
		try {
			genericService.delete(id);
			return new ResponseEntity("Succesfully Deleted!", HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity("Error!", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
