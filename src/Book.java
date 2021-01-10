public class Book {
    String title;
    Status status = Status.AVAILABLE;

    public Book(String title) {
        this.title = title;

    }

    public String getTitle() {
        return title;
    }

    public Status getStatus() {
        return status;
    }

    public void setTitle() {
        this.title = title;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}