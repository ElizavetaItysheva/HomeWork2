public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа~");
        int start1 = 6;
        int end1 =6;
        int start2 = 6;
        int end2 = 6;
        if (start1 > start2 && end1 > end2) {
            int start3 = start1;
            int end3 = end2;
            System.out.println(start3 + ", " + end3 + " - координаты пересечения.");
        } else if (start1 < start2 && end1 < end2 && end1 == start2) {
            System.out.println(end1 + " - координата пересечения.");
        } else if (start1 > start2 && end1 < end2) {
            int start3 = end1;
            int end3 = start1;
            System.out.println(start3 + ", " + end3 + " - координаты пересечения.");
        } else if (start1 < start2 && end1 > end2) {
            int start3 = start2;
            int end3 = end2;
            System.out.println(start3 + ", " + end3 + " - координаты пересечения.");
        } else if (start1 > start2 && end1 > end2 && end1 == start2) {
            {
                System.out.println(end1 + " - координата пересечения");
            }
        } else if (start1 < start2 && end1 < end2) {
            int start3 = start2;
            int end3 = end1;
            System.out.println(start3 + ", " + end3 +  " - координаты пересечения.");
        }else if (start1 == start2 && end1 == end2){
            int start3 = start1;
            int end3 = end1;
            System.out.println(start3 + ", " + end3 + " - координаты пересечения.");
        } else {
            System.out.println("Нет пересечения.");
        }
    }
}