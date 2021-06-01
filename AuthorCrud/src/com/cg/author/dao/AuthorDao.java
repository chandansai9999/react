package com.cg.author.dao;
import com.cg.author.entities.Author;
public interface AuthorDao {
	 public abstract void addAuthor(Author author);
	 public abstract void updateAuthor(Author author);
	 public abstract void deleteAuthor(Author author);
	 public abstract Author findAuthorById(int id);
	 public abstract void beginTransaction();
	 public abstract void commitTransaction();
	 
}