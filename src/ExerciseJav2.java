public class ExerciseJav2 {
    public static void main(String[] args) {


//        System.out.println("need to " + getPaintingCost(17) + " Euro"); ----------#10


    }

    public static double getPaintingCost(int sprayPaintPrice) {
        double result = 0.0;
        double totalArea =
                getAreaCircle(0.58) +
                        getAreaCube(40) +
                        getAreaPyramide(20, 30) +
                        getAreaKiste(80, 30, 20);
        System.out.println(converterMeter(totalArea));//203.3
        double quantityColor = converterMeter(totalArea) * 560;
        double quantityPaint = Math.ceil(quantityColor / 400);
        System.out.println(quantityPaint);
        result = quantityPaint * sprayPaintPrice;
        //на один квадратный метр надо 560мл
//краской 400мл стоит 17€?
        return result;
    }
    public static double getAreaCircle(double diametr) {
        double radius = diametr / 2;
        final double PI = Math.PI;
        return PI * radius * radius;
    }
    public static double getAreaCube(int a) {
        return 6 * a * a;
    }
    public static double getAreaPyramide(int a, int b) {
        return a * a + 2 * a * Math.sqrt(b * b - a * a / 4);
    }
    public static double getAreaKiste(int a, int b, int c) {
        return 2 * a * b + 2 * b * c + 2 * a * c;
    }
    public static double converterMeter(double cm) {
        return cm / 10000;
    }


}
