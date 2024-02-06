package by.bog.post;

public class Email {
    private String email;

    public String getEmail() {
        if (email == null) {
            return "не указан";
        }
        return email;
    }

    public void setEmail(String email) {
        if (email.length() > 5) {
            this.email = email;
        }
    }
}
