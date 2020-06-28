package test;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
	
	    Library library = new Library();

	    ArrayList<Author> author0 = new ArrayList(Arrays.asList(new Author("Anson","gg"), new Author("Eric","ff")));
	    Article article0 = new Article(author0,"Does visual feedback during walking result in similar improvements in trunk control for young and older healthy adults?"
	    ,2015,110,"anson2013does","Journal of neuroengineering and rehabilitation");
	    library.add(article0);

	    ArrayList<Author> author1 = new ArrayList(Arrays.asList(new Author("Azmandian","gg"), new Author("Mahdi","ff")));
	    Article article1 = new Article(author1,"Exploiting perceptual limitations and illusions to support walking through virtual environments in confined physical spaces"
	    ,2017,132,"bruder2013exploiting","Displays");
	    library.add(article1);

	    ArrayList<Author> author2= new ArrayList(Arrays.asList(new Author("Bruder","gg"), new Author("Gerd","ff")));
	    Article article2 = new Article(author2,"Cognitive resource demands of redirected walking"
	    ,2012,184,"bruder2015cognitive","IEEE transactions on visualization and computer graphics");
	    library.add(article2);

	    ArrayList<Author> author3= new ArrayList(Arrays.asList(new Author("Azmandian","gg"), new Author("Grechkin","ff")));
	    ConferencePaper conferencePaper1 = new ConferencePaper(author3,"Physical space requirements for redirected walking: how size and shape affect performance"
	    ,2017,124,"IEEE transactions on visualization and computer graphics");
	    library.add(conferencePaper1);

	    library.sort();

	    for(int i = 0; i < library.getPublications().size();i++){
	    	Publication pp = (Publication)library.getPublications().get(i);
	        pp.print();
	    }

	    //根据标题查找
	    System.out.println("按照标题查找：");
	    Publication p =library.findbytitlle("Does visual feedback during walking result in similar improvements in trunk control for young and older healthy adults?");
	    p.print();

	    //根据作者查找
	    System.out.println("按照作者查找：");
	    ArrayList l = library.findbyauthor("Azmandian","gg");
	    System.out.println(l.size());
	    for(int i = 0; i < l.size();i++){
	        Publication pp = (Publication)l.get(i);
	        pp.print();
	    }

	    //是否合作
	    System.out.println("两个作者是否合作：");
	    System.out.println(library.ifCooperation("Azmandian","gg","Grechkin","ff"));      
	    System.out.println(library.ifCooperation("Azmandian","gg","Green","ff"));
	} 

}
