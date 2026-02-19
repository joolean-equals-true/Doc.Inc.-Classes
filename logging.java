import java.time.LocalDate;
import java.util.Date;

public class logging {
    public LocalDate time_sent;
    public LocalDate time_received;
    public Boolean has_opened;
    public Integer recipient_id;
    public Integer email_id;
    public Integer id;

    logging(){
        this.time_sent = null;
        this.time_received = null;
        this.has_opened = false;
        this.recipient_id = null;
        this.email_id = null;
        this.id = null;
    }

    logging(LocalDate time_sent, LocalDate time_received, Boolean has_opened, Integer recipient_id,
        Integer email_id, Integer id)
        {
            this.time_sent = time_sent;
            this.time_received = time_received;
            this.has_opened = has_opened;
            this.recipient_id = recipient_id;
            this.email_id = email_id;
            this.id = id;
        }
}
