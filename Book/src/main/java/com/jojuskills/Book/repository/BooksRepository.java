package com.jojuskills.Book.repository;

import org.springframework.data.repository.CrudRepository;
import com.jojuskills.Book.entity.Books;  

//repository that extends CrudRepository  
public interface BooksRepository extends CrudRepository<Books, Integer>  
{  
}  