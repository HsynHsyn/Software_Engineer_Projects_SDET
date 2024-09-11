package Muhtar_SDET.Day43_CollectionsAndMaps.eventTracker;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Calendar {

    private Map<LocalDate, List<Event>> events;

    public Calendar() {
        events = new TreeMap<>();
    }

    public void addEvent(LocalDate date, String name, String location) {
        if (!events.containsKey(date)) { // The date is new, no events on this date yet
            events.put(date, new ArrayList<>());
        }
        events.get(date).add(new Event(name, location)); // always adds the Event into the
    }

    public List<Event> getEventsOn(LocalDate date){
        return events.get(date);
    }

    @Override
    public String toString() {
        String output = "Calendar:\n";
        for (LocalDate date : events.keySet()) {
            output += date + ": " + events.get(date) + "\n";
        }
        return output;
    }
}
