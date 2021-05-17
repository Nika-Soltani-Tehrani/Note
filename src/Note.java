import java.io.Serializable;


/**
 * The type Note.
 */
public class Note implements Serializable {

    private String title;
    private String content;
    private String date;


    /**
     * Instantiates a new Note.
     *
     * @param title   the title
     * @param content the content
     * @param date    the date
     */
    public Note(String title, String content, String date) {
        this.title = title;
        this.content = content;
        this.date = date;
    }


    /**
     * Get content string.
     *
     * @return the string
     */
    public String getContent(){
        return content;
    }


    @Override
    public String toString() {
        return "Note{" +
                "title='" + title + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

}