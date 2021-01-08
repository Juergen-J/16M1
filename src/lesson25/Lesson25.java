package lesson25;

public class Lesson25 {
    public static void main(String[] args) {
        int a = 5;
        int[] arr = new int[10];
        int[][] monthCalendar = new int[4][7];

        for (int i = 0; i < monthCalendar.length; i++) {
            for (int j = 0; j < monthCalendar[i].length; j++) {
                monthCalendar[i][j] = i * 7 + j + 1; //nom. Str. * kdn+ nom.k +1
                System.out.print(monthCalendar[i][j]);
            }
            System.out.println();
        }
    }
}
