package common;

public class Prestados {

    private Integer id;
    private String datstart;
    private String datend;

    public Integer getId(){
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getDatstart(){
        {return datstart;}
    }
    public void setDatstart(String datestart)
    {this.datstart=datstart;}
    public String getDatend(){
        return datend;
    }
    public void setDatend(String datend){
        this.datend=datend;
    }
}
