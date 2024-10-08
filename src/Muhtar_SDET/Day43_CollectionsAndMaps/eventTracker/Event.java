package Muhtar_SDET.Day43_CollectionsAndMaps.eventTracker;

public class Event {
    private String name;
    private String location;

    public Event(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return
        name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return name + " @ " + location;
    }
}
