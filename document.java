public class document {
    
    public String document_name;
    public String account_number;
    public String ssn;
    public String document_content;
    public Integer size;
    public Integer receiver_id;
    public Integer id;



    
    document(){
        this.document_name = "";
        this.document_content = "";
        this.account_number = "";
        this.ssn = "";
        this.document_content = "";
        this.size =0;
        this.receiver_id = null;
        this.id = null;
    }

      document(String document_name, String account_number, String ssn,
                String document_content, Integer size, Integer receiver_id, Integer id)
    {
        this.document_content = document_name;
        this.account_number = account_number;
        this.ssn =ssn;
        this.document_content = document_content;
        this.size =size;
        this.receiver_id = receiver_id;
        this.id = id;
    }

    



}
