public class business {
    public String name;
    public String domain;
    public Integer id;


    business(){
        this.name = "";
        this.domain = "";
        this.id = null;
    }

    business(String name, String domain, Integer id){
        this.name = name;
        this.domain = domain;
        this.id = id;
    }
}
