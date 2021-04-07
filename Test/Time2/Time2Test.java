package Time2;

class Time2Test {
    public static void main(String[] args) {
        Time2 myTime1 = new Time2();
        Time2 myTime2 = new Time2(2);
        Time2 myTime3 = new Time2(21, 34);
        Time2 myTime4 = new Time2(12, 55, 42);
        Time2 myTime5 = new Time2(myTime4);

        System.out.println("Constructed with:");
        displayTime("t1: all default arguements", myTime1);
        displayTime("t2: hour specified; default minute and second", myTime2);
        displayTime("t3: hour and minute specified; default second", myTime3);
        displayTime("t4: hour, minute and second specified", myTime4);
        displayTime("t5: Time2 object T4 specified", myTime5);

        try {
            Time2 myTime6 = new Time2(27, 27, 27);
        } catch (IllegalArgumentException e) {

            System.out.printf("%nException value while initializing t6 is: %s%n", e.getMessage());
        }
    }
    private static void displayTime(String header, Time2 myTime) {
        System.out.printf("%s%n %s%n %s%n", header, myTime.toUniversalString(), myTime.toString());

    }


}