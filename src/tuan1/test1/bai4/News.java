package tuan1.test1.bai4;

public class News implements INews {
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;
    public int[] rateList ;

    public News(String title, String publishDate, String author, String content) {
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void display() {
        System.out.println(title);
        System.out.println(publishDate);
        System.out.println(author);
        System.out.println(content);
        System.out.println(averageRate);
    }

    public void setRateList(){
        this.rateList = new int[3];
    }

    public void calculate(){
        this.averageRate = (this.rateList[0]+this.rateList[1]+this.rateList[2])/3;
    }
}
