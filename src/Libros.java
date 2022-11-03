public class Libros {
    private Integer isbn;
    private String title;
    private String autor;
    private String genre;

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
    public String getBirthday () {
        return birthday;
    }
    public void setBirthday(String birthday){
        this.birthday = birthday;
    }
}
