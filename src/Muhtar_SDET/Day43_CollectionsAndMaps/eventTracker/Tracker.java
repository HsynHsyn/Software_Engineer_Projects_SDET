package Muhtar_SDET.Day43_CollectionsAndMaps.eventTracker;

import java.time.LocalDate;

public class Tracker {
    public static void main(String[] args) {
        Calendar work = new Calendar();


        work.addEvent(LocalDate.of(2024,  6,  5), "New Hire Event", "Office");

        // 10 Ocak 2023 tarihinde "All Hands Meeting" adında Zoom'da bir etkinlik ekleme
        work.addEvent(LocalDate.of(2023,  1,  10), "All Hands Meeting", "Zoom");

        // 10 Ocak 2023 tarihinde "After Work Hangout" adında ofiste bir etkinlik ekleme
        work.addEvent(LocalDate.of(2023,  1,  10),  "After Work Hangout", "Office");

        // 14 Şubat 2023 tarihinde "Valentines Day" adında evde bir etkinlik ekleme
        work.addEvent(LocalDate.of(2023,  1,  10), "Valentines Day", "Home");

        // Tüm etkinlikleri ekrana yazdırma
        System.out.println(work);

        System.out.println("----------------------------------------------");

        System.out.println(work.getEventsOn(LocalDate.of(2023, 1, 10)));
    }
}
