package test;

import java.util.*;

public class Library {
	 private ArrayList<Publication> publications = new ArrayList<Publication>();

	    public void add(Publication publication){
	        publications.add(publication);
	    }

	    public ArrayList findbyauthor(String authorFirstName,String authorLastName){
	        ArrayList<Publication> result = new ArrayList();
	        Iterator it = publications.iterator();
	        while(it.hasNext()){
	            Publication publication = (Publication)it.next();
	            Iterator it2 = publication.getAuthors().iterator();
	            while(it2.hasNext()){
	                Author author = (Author)it2.next();
	                if(author.getFirstname().equals(authorFirstName) && author.getLastname().equals(authorLastName)){
	                    result.add(publication);
	                }
	            }
	        }
	        return result;
	    }

	    public Publication findbytitlle(String title){
	        for(int i = 0; i < publications.size();i++){
	            if(publications.get(i).getTitle().equals(title)){
	                return publications.get(i);
	            }
	        }
	        return null;
	    }

	    public boolean ifCooperation(String author1F,String author1L,String author2F,String author2L){
	        Iterator it = publications.iterator();
	        while(it.hasNext()){
	            Publication publication = (Publication)it.next();
	            if(ifHaveAuthor(publication,author1F,author1L) && ifHaveAuthor(publication,author2F,author2L)){
	                return true;
	            }

	        }
	        return false;
	    }

	    public boolean ifHaveAuthor(Publication p,String firstname,String lastname){
	        for(int i = 0; i < p.getAuthors().size();i++){
	            Author a = (Author) p.getAuthors().get(i);
	            if(a.getFirstname().equals(firstname) && a.getLastname().equals(lastname)){
	                return true;
	            }
	        }
	        return false;
	    }

	    public ArrayList<Publication> getPublications() {
	        return publications;
	    }

	    public void sort(){
	        System.out.println("≈≈–Ú£∫");
	        Collections.sort(publications);
	    }
}


