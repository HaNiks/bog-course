package by.bog.post;

public class Letter {
    private int id;
    private String name;
    private String recipient;

    public Letter(int id, String name, String recipient) {
        this.id = id;
        this.name = name;
        this.recipient = recipient;
    }

    public Letter() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + recipient;
    }
}
