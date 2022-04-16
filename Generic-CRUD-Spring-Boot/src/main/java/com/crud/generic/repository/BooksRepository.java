package com.crud.generic.repository;

import org.springframework.stereotype.Repository;

import com.crud.generic.entity.Books;
import com.crud.generic.repository.generic.GenericRepository;

@Repository
public interface BooksRepository extends GenericRepository<Books>{

}
