package strings03;

public class Strings1_ {
    public static void main(String[] args) {
        System.out.println("**************#1");
        System.out.println(countYZ("fez day"));// → 2
        System.out.println(countYZ("day fez"));// → 2
        System.out.println(countYZ("day fyyyz"));// → 2

        System.out.println("**************#2");
//        System.out.println(gHappy("xxggxx"));// → true
//        System.out.println(gHappy("xxgxx"));// → false
//        System.out.println(gHappy("xxggyygxx"));// → false
    }

    public static boolean findTrue(String str, int i) {
        return i == str.length() - 1;
    }

    public static int countYZ(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == 'z' || str.charAt(i) == 'y') && i == str.length() - 1 ? true : !Character.isLetter(str.charAt(i + 1))) {
                count++;
            }
        }
        return count;
    }


}
