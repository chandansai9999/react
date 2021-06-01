package com.cg.author.entities;
import com.cg.author.service.*;
import java.util.Scanner;

import com.cg.author.service.AuthorService;
import com.cg.author.service.AuthorServiceImp;

public class AuthorEntity {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);// TODO Auto-generated method stub
        AuthorService authorService= new AuthorServiceImp();
        Author author;
        boolean flag=true;
        while(flag){
        	System.out.println("1.Add author");
        	System.out.println("2.Update Author");
        	System.out.println("3.Display Author");
        	System.out.println("4.Delete Author");
        	System.out.println("5.End");
        	int choice=sc.nextInt();
        	switch(choice) {
        	case 1:
        		author=new Author();
        		author.setAuthorId(sc.nextInt());
        		author.setFirstName(sc.next());
        		author.setMiddleName(sc.next());
        		author.setLastName(sc.next());
        		author.setPhoneNo(sc.nextLong());
        		authorService.addAuthor(author);
        		System.out.println("Added succesfully");
        		break;
        	case 2:
        		author=authorService.findAuthorById(sc.nextInt());
        		author.setFirstName(sc.next());
        		author.setMiddleName(sc.next());
        		author.setLastName(sc.next());
        		author.setPhoneNo(sc.nextLong());
        		authorService.updateAuthor(author);
        		System.out.println("Updated succesfully");
        		break;
        	case 3:
        		author=authorService.findAuthorById(sc.nextInt());
        		System.out.println("Author id:"+author.getAuthorId()+" Author name:"+author.getFirstName()+" "+author.getMiddleName()+" "+author.getLastName()+" Phone no:"+author.getPhoneNo());
        		break;
        	case 4:
        		author=authorService.findAuthorById(sc.nextInt());
        		authorService.deleteAuthor(author);
        		System.out.println("Deleted succesfully");
        		break;
        	case 5:
        		System.out.println("Thanks for using");
        		System.exit(0);
        		flag=false;
        	}
        	
        }
	}

}
