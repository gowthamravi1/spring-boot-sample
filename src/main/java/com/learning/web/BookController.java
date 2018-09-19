package com.learning.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import con.learning.repository.BookRepository;

@RestController
@RequestMapping("/api")
public class BookController {

	@Autowired
	BookRepository bookRepository;
	
    @RequestMapping(value = "/book/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
	public String findBook(@PathVariable(value = "id") Long id) {
		return bookRepository.findById(id).toString();
	}
}
