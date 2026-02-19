public class business_division {
    public String name;
    public Integer business_id;
    public Integer id;

    business_division(){
        this.name = "";
        this.business_id = null;
        this.id = null;
    }

    business_division(String name, Integer business_id, Integer id){
        this.name = name;
        this.business_id = business_id;
        this.id = id;
    }
}
