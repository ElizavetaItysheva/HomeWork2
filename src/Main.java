public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа~");
        int a1 = 5;
        int b1 = 5;
        int a2 = 5;
        int b2 = 5;
        if ((a1 < a2 && b1 < a2)||(a2 < a1 && b2 < a1)) {
            System.out.println(" Отрезки не пересекаются.");
        } else if (a1 < a2 && a1 < b2) {
            int a3 = a2;
            int b3 = b1;
            System.out.println(a3 + ", " + b3 + " - координаты пересечения.");
        } else if (a2 < a1 && a2 < b1) {
            int a3 = a1;
            int b3 = b2;
            System.out.println(a3 + ", " + b3 + " - координаты пересечения.");
        } else  if (a1 == a2 && b1 < b2){
            int a3 = a1;
            int b3 = b1;
            System.out.println(a3 + ", " + b3 + " - координаты пересечения.");
        } else if (a1 == a2 && b2 < b1){
            int a3 = a1;
            int b3 = b2;
            System.out.println(a3 + ", " + b3 + " - координаты пересечения.");
        } else if (b1 == b2 && a1 < a2) {
            int a3 = a1;
            int b3 = b1;
            System.out.println(a3 + ", " + b3 + " - координаты пересечения.");
        } else if (b1 == b2 && a2 < a1) {
            int a3 = a2;
            int b3 = b1;
            System.out.println(a3 + ", " + b3 + " - координаты пересечения.");
        } else if (a1 < a2 && b2 < b1) {
            int a3 = a2;
            int b3 = b2;
            System.out.println(a3 + ", " + b3 + " - координаты пересечения.");
        } else if (a2 < a1 && b1 < b2) {
            int a3 = a1;
            int b3 = b1;
            System.out.println(a3 + ", " + b3 + " - координаты пересечения.");
        } else if (a1 == a2 && b1 == b2) {
            System.out.println(a1 + ", " + b1 + " - координаты пересечения. (отрезки совпали)");
        } else {
            System.out.println("Не понимаю...");
        }
    }
}