package zadaniadomowe.doctor;

import java.time.LocalDateTime;

public class Minutes {

    static int[] odds = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31,
            33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59};

    public static void main(String[] args) {

        LocalDateTime time = LocalDateTime.now();
        int this_minute = time.getMinute();

        if (isOdd(this_minute)) {
            System.out.println("This is an odd minute.");
        } else {
            System.out.println("This is an even minute.");
        }

        if (this_minute % 2 != 0) {
            System.out.println("This is an odd minute.");
        } else {
            System.out.println("This is an even minute.");
        }

    }

    public static boolean isOdd(int this_minute) {
        for (int i = 0; i < odds.length; i++) {
            if (this_minute == odds[i]) {
                return true;
            }
        }
        return false;
    }

}
