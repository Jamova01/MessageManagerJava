import com.mysql.cj.protocol.Message;

public class Messages {
    int message_id;
    String message_text;
    String author_name;
    String created_at;

    public Messages() {
    }

    public Messages(String message_text, String author_name, String created_at) {
        this.message_text = message_text;
        this.author_name = author_name;
        this.created_at = created_at;
    }

    public int getMessage_id() {
        return message_id;
    }

    public void setMessage_id(int message_id) {
        this.message_id = message_id;
    }

    public String getMessage_text() {
        return message_text;
    }

    public void setMessage_text(String message_text) {
        this.message_text = message_text;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
