package common;

public class Libros {
    private Integer isbn;
    private String title;
    private String autor;
    private String genre;
    private String publication;

    public Integer getIsbn(){
        return isbn;
    }
    public void  setIsbn(Integer isbn){
        this.isbn = isbn;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getGenre () {
        return genre;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public String getPublication () {
        return genre;
    }
    public void setPublication(String publication){
        this.publication = publication;
    }
}
