package Saturday_Reviews.week14.Discord;

import java.time.LocalDate;

public class Admin extends DiscordUser {

    public Admin(String role, String name, String id, LocalDate accountCreationDate) {
        super(role, name, id, accountCreationDate);
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending announcement to @everyone");
    }

    @Override
    public void joinDiscord(String url) {
        System.out.println("Joining as Admin to " + url);
    }

    public void createChannel(String channelName) {
        System.out.println("Creating channel - " + channelName);
    }
}
