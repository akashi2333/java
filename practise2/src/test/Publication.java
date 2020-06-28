package test;

import java.util.*;

public class Publication implements Comparable<Publication> {
    private ArrayList<Author> authors;
    private String title;
    private int year;
    private int page;

    public Publication(ArrayList<Author> authors, String title,int year,int page) {
        this.authors = authors;
        this.title = title;
        this.year = year;
        this.page = page;
    }

    public Publication(){}

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public String getTitle() {
        return title;
    }

    public int getPage() {
        return page;
    }


    public int getYear() {
        return year;
    }

    public void print(){
        StringBuffer Aprint = new StringBuffer();

        Iterator it = authors.iterator();
        while(it.hasNext()){
            Author author = (Author)it.next();
            Aprint.append(author.getFirstname());
            Aprint.append(" ");
            Aprint.append(author.getLastname());
            Aprint.append(",");
        }
        Aprint.append(year);
        Aprint.append(",");
        Aprint.append(title);
        Aprint.append(",");
        Aprint.append(page);
        
    }

    @Override
    public int compareTo(Publication o) {
        if(o.getYear() == this.year){
            Author ofirstAuthor = (Author)o.getAuthors().get(0);
            Author firstAuthor = (Author)authors.get(0);
            return ofirstAuthor.getFirstname().compareTo(firstAuthor.getFirstname());
        }
        else{
            return this.year - o.getYear();
        }
    }
}
