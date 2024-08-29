package Saturday_Reviews.week14.Discord;

import java.time.LocalDate;

public abstract class DiscordUser {

    private String role;
    private String name;
    private String id;
    private LocalDate accountCreationDate;

    public DiscordUser(String role, String name, String id, LocalDate accountCreationDate) {
        setRole(role);
        setName(name);
        setId(id);
        setAccountCreationDate(accountCreationDate);
    }

    public abstract void sendMessage();
    public abstract void joinDiscord(String url);

    @Override
    public String toString() {
        return "DiscordUser{" +
                "role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", accountCreationDate=" + accountCreationDate +
                '}';
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getAccountCreationDate() {
        return accountCreationDate;
    }
    public void setAccountCreationDate(LocalDate accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }
}
