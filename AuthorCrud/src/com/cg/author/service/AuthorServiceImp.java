package com.cg.author.service;
import com.cg.author.dao.*;
import com.cg.author.entities.Author;

public class AuthorServiceImp implements AuthorService {
          private AuthorDao dao;
   public AuthorServiceImp(){
	   dao=new AuthorDaoImp();
   }
	@Override
	public void addAuthor(Author author) {
		dao.beginTransaction();
		dao.addAuthor(author);
		dao.commitTransaction();
		
	}

	@Override
	public void updateAuthor(Author author) {
		dao.beginTransaction();
		dao.updateAuthor(author);
		dao.commitTransaction();
		
	}

	@Override
	public void deleteAuthor(Author author) {
		dao.beginTransaction();
		dao.deleteAuthor(author);
		dao.commitTransaction();
		
	}

	@Override
	public Author findAuthorById(int id) {
		Author author=dao.findAuthorById(id);
		return author;
	}
       
}
