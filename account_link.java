public class account_link {
    public Integer original_account_id;
    public Integer linked_account_id;

    account_link(){
        this.original_account_id = null;
        this.linked_account_id = null;
    }

    account_link(Integer original_account_id, Integer linked_account_id){
        this.original_account_id = original_account_id;
        this.linked_account_id = linked_account_id;
    }
}
