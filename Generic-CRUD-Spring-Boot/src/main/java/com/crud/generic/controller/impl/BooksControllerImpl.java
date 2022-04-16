package com.crud.generic.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.generic.controller.BooksController;
import com.crud.generic.controller.generic.impl.ControllerGenericImpl;
import com.crud.generic.entity.Books;

@RestController
@RequestMapping(path = "/books")
public class BooksControllerImpl extends ControllerGenericImpl<Books> implements BooksController{
	
}
