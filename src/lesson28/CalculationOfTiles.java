package lesson28;

import lesson20.Main;

import java.util.Scanner;

public class CalculationOfTiles {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
        final String ANSI_RED_BACKGROUND = "\u001B[41m";

        double aTile = 30;//cm
        double bTile = 20;//cm
        System.out.println(ANSI_BLACK_BACKGROUND + ANSI_RED + "enter the width of the zone in centimeters..." + ANSI_RESET);
        double aZone = scaner.nextDouble();//cm
        System.out.println(ANSI_BLACK_BACKGROUND + ANSI_RED + "enter the length of the zone in centimeters..." + ANSI_RESET);
        double bZone = scaner.nextDouble();//cm
        System.out.println(ANSI_BLACK_BACKGROUND + ANSI_RED + "enter the cost of one tile (Euro, *,*)..." + ANSI_RESET);
        double costOfTile = scaner.nextDouble();//Euro
        double zoneArea = getZoneArea(aZone, bZone);//80000 cm^2
        int tilesQuantity = getQuantityTiles(aZone, bZone, aTile, bTile);
        System.out.println(ANSI_RED + getCostOfMaterial(tilesQuantity, costOfTile) + " Euro for Tiles" + ANSI_RESET);
        System.out.println(ANSI_RED + getCostOfTime(zoneArea) + " Euro for work inc. Mwst." + ANSI_RESET);
        System.out.println(ANSI_RED_BACKGROUND + "Total cost: " + getTotalCost(getCostOfTime(zoneArea), getCostOfMaterial(tilesQuantity, costOfTile)) + " Euro" + ANSI_RESET);


    }

    public static double getZoneArea(double a, double b) {
        return a * b;
    }

    public static double getCostOfMaterial(int quantity, double cost) {
        //System.out.println("Cost of tiles: " + quantity * cost + " Euro ");
        return roundMoney(quantity * cost);
    }

    public static int getQuantityTiles(double aZone, double bZone, double aTile, double bTile) {
        double temp = hs(aZone, aTile) * hs(bZone, bTile);
//        System.out.println(temp);
        double temp2 = hs(aZone, bTile) * hs(bZone, aTile);
//        System.out.println(temp2);
        int result = getRoundQuantity(temp, temp2);
        System.out.println(result + " Tiles");
        return result;
    }

    public static double hs(double a, double b) {
        double result = a / b;
//        System.out.println(result);
        int temp2 = (int) result;
        double temp = temp2 == result ? result : temp2 + 1;
//        System.out.println(temp);
        return temp;
    }

    public static int getRoundQuantity(double a, double b) {
        double temp = Math.min(a, b);
        int temp2 = (int) Math.round(temp);
        return temp2 < temp ? temp2 + 1 : temp2;
    }

    public static double getCostOfTime(double area) {
        double preis = (area / 10000) * 27;
        //System.out.println("cost of work: " + preis + "Euro  +19% Mehrwertsteuer:" + preis * 0.19 + " Euro");
        return roundMoney(preis + preis * 0.19);
    }

    public static double roundMoney(double money) {
        int temp = (int) (money * 100);
        double temp2 = temp;
        return temp2 / 100;
    }

    public static double getTotalCost(double workCost, double tilesCost) {
        return roundMoney(workCost + tilesCost);
    }
}
