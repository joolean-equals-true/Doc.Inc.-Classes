import java.time.LocalDate;


public class email{
    public String name;
    public Integer document_id;
    public Integer business_id;
    public LocalDate expiration_date;
    public Boolean is_visible;
    public Integer id;


    email(){
        this.name = "";
        this.document_id = null;
        this.business_id = null;
        this.expiration_date = null;
        this.is_visible = false;
        this.id = null;
    }

    email(String name, Integer document_id, Integer business_id, LocalDate expiration_date, Boolean is_visible, Integer id){
        this.name = name;
        this.document_id = document_id;
        this.business_id = business_id;
        this.expiration_date = expiration_date;
        this.is_visible = is_visible;
        this.id = id;
    }
}