package kyu6.meeting;

import java.util.ArrayList;
import java.util.List;

public class Meeting {

    public static String meeting(String s) {
        // your code

        List<Guest> guests = splitToGetGuests(s);

        orderGuests(guests);

        return getGuestsAsOutput(guests);
    }


    public static List<Guest> splitToGetGuests(String s) {
        List<Guest> guests = new ArrayList<>();

        String[] firstAndLastNames = s.split(";");

        for (String firstAndLastName : firstAndLastNames) {
            String firstName = firstAndLastName.substring(0, firstAndLastName.indexOf(":"));
            String lastName = firstAndLastName.substring(firstAndLastName.indexOf(":") + 1, firstAndLastName.length());
            Guest guest = new Guest(firstName, lastName);
            guests.add(guest);
        }
        return guests;
    }

    public static void orderGuests(List<Guest> guests) {
        guests.sort((o1, o2) -> {
            if (o1.getLastName().compareToIgnoreCase(o2.getLastName()) == 0) {
                return o1.getFirstName().compareToIgnoreCase(o2.getFirstName());
            } else {
                return o1.getLastName().compareToIgnoreCase(o2.getLastName());
            }
        });
    }


    private static String getGuestsAsOutput(List<Guest> guests) {
        StringBuilder sb = new StringBuilder();

        for (Guest guest : guests) {
            sb.append("(" + guest.getLastName().toUpperCase() + ", " + guest.getFirstName().toUpperCase() + ")");
        }

        return sb.toString();
    }


}

class Guest {


    private String firstName;
    private String lastName;

    public Guest(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}




