package lesson18;

public class HomeWork18 {
    public static void main(String[] args) {
//        System.out.println(minCat("Hello", "Hi"));// → "loHi"  -------#1
//        System.out.println(minCat("Hello", "java"));// → "ellojava"
//        System.out.println(minCat("java", "Hello"));// → "javaello"

//        System.out.println(deFront("Hello"));// → "llo"   ------------#2
//        System.out.println(deFront("java"));// → "va"
//        System.out.println(deFront("away"));// → "aay"

//        System.out.println(withoutX2("xHi"));// → "Hi" ----------#3
//        System.out.println(withoutX2("Hxi"));// → "Hi"
//        System.out.println(withoutX2("Hi"));// → "Hi"


        System.out.println(getCostHouse() + "$"); //********
    }

    public static String minCat(String str, String str2) {
        String result = "";
        if (str.length() == str2.length()) {
            result = str + str2;
        } else if (str.length() > str2.length()) {
            result = str.substring(str.length() - str2.length()) + str2;
        } else {
            result = str + str2.substring(str2.length() - str.length());
        }
        return result;
    }

    public static String deFront(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' && i == 0) {
                result += str.charAt(i);
            } else if (str.charAt(i) == 'b' && i == 1) {
                result += str.charAt(i);
            } else if (i > 1) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static String withoutX2(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x' && i < 2) {

            } else {
                result += str.charAt(i);
            }
        }
        return result;

    }


    public static double getCostHouse() {
        //getAreaHouse();//138m
        //getQuantityLogs();//115 Logs
        return totalCost(getAreaHouse(), getQuantityLogs());
    }

    public static double totalCost(int areaHouse, int QuantityLogs) {
        return getCraneCost(14) /*1400 $*/ +
                getWorkersCost(14)/*36960 $*/ +
                getCostLogs(QuantityLogs)/*6900$*/ +
                getLacquerCost(areaHouse) * 1.21;/*920 Euro*/
    }

    public static double getCraneCost(int days) {
        return days * 100;
    }

    public static double getWorkersCost(int days) {
        double foremanCost = 35; //in hour
        double workerCost = 25;
        double costInHour = 35 + 25 * 3;//cost for 3 workers and 1 foreman in 1 hour
        int hourInDay = 24;
        return days * costInHour * hourInDay;
    }

    public static double getLacquerCost(int area) {
        double quantityLaquer = 0.3333333 * area;
        if ((quantityLaquer * 20) % 20 == 0) {
            return quantityLaquer * 20;
        } else {
            return quantityLaquer * 20 + (20 - quantityLaquer * 20 % 20);
        }

    }

    public static double getCostLogs(int quantityLogs) {
        double sizeLog = 0.24;//m^3
        double costLog = sizeLog * 250;//preis pro log
        return costLog * quantityLogs;
    }

    public static int getAreaHouse() {
        int width = 11;//m
        int length = 12;
        int height = 3;
        return width * height * 2 + length * height * 2;
    }

    public static int getQuantityLogs() {
        double quantityRows = 3 / 0.2;//15 rows
        int perimetr = 11 * 2 + 12 * 2;//46 perimeter of row
        double totalLengthRows = quantityRows * perimetr;//m
        if (totalLengthRows % 6 == 0) {
            return (int) (totalLengthRows / 6);
        }
        return (int) (quantityRows / 6 + 1);
    }
}
