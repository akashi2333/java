package test;

import java.util.*;


public class ConferencePaper extends Publication implements Comparable<Publication> {
    private ArrayList<Author> authors;
    private String title;
    private int page;
    private int year;
    private String conferenceName;

    public ConferencePaper(ArrayList<Author> authors, String title,int year, int page,String conferenceName) {
        this.authors = authors;
        this.title = title;
        this.year = year;
        this.page = page;
        this.conferenceName = conferenceName;
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
        Aprint.append(conferenceName);
        Aprint.append(",");
        Aprint.append(page);

        System.out.println(Aprint);
    }

    @Override
    public ArrayList<Author> getAuthors() {
        return authors;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getPage() {
        return page;
    }

    @Override
    public int getYear() {
        return year;
    }

    public String getConferenceName() {
        return conferenceName;
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
