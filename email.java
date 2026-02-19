import java.time.LocalDate;

/**
 * Email class for managing email-related information.
 */
public class Email {
    public String name;
    public Integer document_id;
    public Integer business_id;

    public LocalDate expiration_date;
    public Boolean is_visible;
    public Integer id;


    Email(){
        this.name = "";
        this.document_id = null;
        this.business_id = null;
        this.expiration_date = null;
        this.is_visible = false;
        this.id = null;
    }

      Email(String name, Integer documentId, Integer businessId,
          LocalDate expirationDate, Boolean isVisible, Integer id) {
        this.name = name;
        this.document_id = documentId;
        this.business_id = businessId;
        this.expiration_date = expirationDate;
        this.is_visible = isVisible;
        this.id = id;
      }
}