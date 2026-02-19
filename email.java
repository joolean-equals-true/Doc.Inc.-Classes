import java.time.LocalDate;

/**
 * Email class for managing email-related information.
 */
public class Email {
  public String name;
  public Integer documentId;
  public Integer businessId;

  public LocalDate expirationDate;
  public Boolean isVisible;
  public Integer id;

  Email() {
    this.name = "";
    this.documentId = null;
    this.businessId = null;
    this.expirationDate = null;
    this.isVisible = false;
    this.id = null;
  }

  Email(String name, Integer documentId, Integer businessId,
      LocalDate expirationDate, Boolean isVisible, Integer id) {
    this.name = name;
    this.documentId = documentId;
    this.businessId = businessId;
    this.expirationDate = expirationDate;
    this.isVisible = isVisible;
    this.id = id;
  }
}