package lesson28;

public class CalculationOfTiles {
    public static void main(String[] args) {
//        Нам известно, что в час он кладёт примерно один квадратный метр плитки.//
//                Его час стоит 27€ без НДС.
//                Стандартная плитка 30 на 20 сантиметров.
//                Сергей Иванович обратился к нам за помощью и вам надо написать для него программу.
//                Которая будет принимать размеры стены/пола, стоимость плитки и выдавать:
//
//        Количество требуемых плиток, как целых, так и тех которые надо будет резать. Учтите,
//        что плитку можно класть как вдоль, так и поперёк и только на месте мастер узнает, как именно её надо класть.
//
//        Стоимость материала
//        Стоимость рабочего времени
//        Итоговую ориентировочную стоимость

        double aTile = 30;//cm
        double bTile = 20;//cm


        double aZone = 200;//cm
        double bZone = 4096;//cm
        System.out.println(getZoneArea(aZone, bZone));//80000 cm^2

        getQuantityTiles(aZone, bZone, aTile, bTile);


        double tilesPrise;

        getCostOfMaterial();
        getCostOfTime();
        getTotalCost();


    }

    public static double getZoneArea(double a, double b) {
        return a * b;
    }

    public static void getCostOfMaterial() {

    }

    public static int getQuantityTiles(double aZone, double bZone, double aTile, double bTile) {
        double temp = aZone / aTile * bZone / bTile;
        System.out.println(temp);
        double temp2 = aZone / bTile * bZone / aTile;
        System.out.println(temp2);
        int result = getRoundQuantity(temp, temp2);
        System.out.println(result);
        return result;
    }

    public static int getRoundQuantity(double a, double b) {
        double temp = Math.min(a, b);
        int temp2 = (int) Math.round(temp);
        return temp2 < temp ? temp2 + 1 : temp2;
    }

    public static void getCostOfTime() {

    }

    public static void getTotalCost() {

    }
}
