import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PokerGameTest {

    Table table;

    String test1;
    String test2;
    String test3;
    String test4;
    String test5;
    String test6;
    String test7;
    String test8;
    String test9;
    String test10;
    String test11;
    String test12;
    String test13;
    String test14;

    String test1Result;
    String test2Result;
    String test3Result;
    String test4Result;
    String test5Result;
    String test6Result;
    String test7Result;
    String test8Result;
    String test9Result;
    String test10Result;
    String test11Result;
    String test12Result;
    String test13Result;
    String test14Result;

    @Before
    public void setup(){

        table = new Table();

        test1 = "14o 13o 12o 11o 10o";
        test2 = "14o 13c 12o 11o 9o";
        test3 = "14o 10c 12o 11o 13o";
        test4 = "10c 13c 11c 12c 14c";
        test5 = "10c 13c 11c 12c";
        test6 = "8c 7c 6c 5c 4c";
        test7 = "12c 12o 12e 12p 7o";
        test8 = "10c 10o 10e 9p 9o";
        test9 = "4e 12e 8e 2e 9e";
        test10 = "9p 8o 7e 6o 5c";
        test11 = "7p 7o 7e 13p 3o";
        test12 = "4p 4e 3p 3o 11p";
        test13 = "14c 14o 8p 4e 7c";
        test14 = "4p 3o 4e 3p 11p";

        test1Result = "14o 13o 12o 11o 10o RoyalFlush";
        test2Result = "14o 13c 12o 11o 9o ";
        test3Result = "14o 10c 12o 11o 13o Straight";
        test4Result = "10c 13c 11c 12c 14c RoyalFlush";
        test5Result = "10c 13c 11c 12c ";
        test6Result = "8c 7c 6c 5c 4c StraightFlush";
        test7Result = "12c 12o 12e 12p 7o FourKind";
        test8Result = "10c 10o 10e 9p 9o FullHouse";
        test9Result = "4e 12e 8e 2e 9e Flush";
        test10Result = "9p 8o 7e 6o 5c Straight";
        test11Result = "7p 7o 7e 13p 3o ThreeKind";
        test12Result = "4p 4e 3p 3o 11p TwoPair";
        test13Result = "14c 14o 8p 4e 7c Pair";
        test14Result = "4p 3o 4e 3p 11p TwoPair";
    }

    @Test
    public void test1(){

        assertEquals(test1Result, table.gameResult(test1));
    }

    @Test
    public void test2(){

        assertEquals(test2Result, table.gameResult(test2));
    }

    @Test
    public void test3(){

        assertEquals(test3Result, table.gameResult(test3));
    }

    @Test
    public void test4(){

        assertEquals(test4Result, table.gameResult(test4));
    }

    @Test
    public void test5(){

        assertEquals(test5Result, table.gameResult(test5));
    }

    @Test
    public void test6(){

        assertEquals(test6Result, table.gameResult(test6));
    }

    @Test
    public void test7(){

        assertEquals(test7Result, table.gameResult(test7));
    }

    @Test
    public void test8(){

        assertEquals(test8Result, table.gameResult(test8));
    }

    @Test
    public void test9(){

        assertEquals(test9Result, table.gameResult(test9));
    }

    @Test
    public void test10(){

        assertEquals(test10Result, table.gameResult(test10));
    }

    @Test
    public void test11(){

        assertEquals(test11Result, table.gameResult(test11));
    }

    @Test
    public void test12(){

        assertEquals(test12Result, table.gameResult(test12));
    }

    @Test
    public void test13(){

        assertEquals(test13Result, table.gameResult(test13));
    } 

    @Test
    public void test14(){

        assertEquals(test14Result, table.gameResult(test14));
    }
}