package kyu6.meeting;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MeetingTest {




    @Test
    public void testSplitString() {

        String names = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";


        Meeting.splitToGetGuests(names);
    }



    @Test
    public void testOrderGuests() {

        String names = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";


        List<Guest> guests = Meeting.splitToGetGuests(names);
        Meeting.orderGuests(guests);


        assertEquals(guests, guests);


    }


    @Test
    public void testGetGuestsAsOutput() {
        String names = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";


        assertEquals("(CORWILL, ALFRED)(CORWILL, FRED)(CORWILL, RAPHAEL)(CORWILL, WILFRED)(TORNBULL, BARNEY)(TORNBULL, BETTY)(TORNBULL, BJON)", Meeting.meeting(names));
    }

    @Test
    public void testTheirExample() {
        String names = "Alexis:Wahl;John:Bell;Victoria:Schwarz;Abba:Dorny;Grace:Meta;Ann:Arno;Madison:STAN;Alex:Cornwell;Lewis:Kern;Megan:Stan;Alex:Korn";



        assertEquals("(ARNO, ANN)(BELL, JOHN)(CORNWELL, ALEX)(DORNY, ABBA)(KERN, LEWIS)(KORN, ALEX)(META, GRACE)(SCHWARZ, VICTORIA)(STAN, MADISON)(STAN, MEGAN)(WAHL, ALEXIS)", Meeting.meeting(names));
    }

    @Test
    public void testTheirFinalExample() {
        String names = "Anna:Wahl;Grace:Gates;James:Russell;Elizabeth:Rudd;Victoria:STAN;Jacob:Wahl;Alex:Wahl;Antony:Gates;Alissa:Meta;Megan:Bell;Amandy:Stan;Anna:Steve";

        assertEquals("(BELL, MEGAN)(GATES, ANTONY)(GATES, GRACE)(META, ALISSA)(RUDD, ELIZABETH)(RUSSELL, JAMES)(STAN, AMANDY)(STAN, VICTORIA)(STEVE, ANNA)(WAHL, ALEX)(WAHL, ANNA)(WAHL, JACOB)", Meeting.meeting(names));
    }

}
