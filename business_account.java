public class business_account {
    public Integer business_division_id;
    public Boolean is_admin;
    public Integer id;

    business_account(){
        this.business_division_id = null;
        this.is_admin = false;
        this.id = null;
    }
    business_account(Integer business_division_id, Boolean is_admin, int id){
        this.business_division_id = business_division_id;
        this.is_admin = is_admin;
        this.id = id;
    }
}
