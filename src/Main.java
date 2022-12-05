public class Main {
    public static void main(String[] args) {
        int a1, a2, b1, b2;
        a1 = 3; //Первый
        b1 = 5; //отрезок
        a2 = 4; //Второй
        b2 = 6; //отрезок

        if (b1 < a2 || b2 < a1) {
            System.out.println("Пересечения отрезков нет");

        }
        else if (b1 == a2) {
            System.out.println("Точка пересечения имеет координаты " + a2);

        }
        else if (b2 == a1) {
            System.out.println("Точка пересечения имеет координаты " + a1);
        }

        else if ((a2 > a1) && (b2 > b1)) {
            System.out.println("Координаты пересечения отрезков " + a2 + "  " + b1);

        }
        else if ((a1 > a2) && (b1 > b2)) {
            System.out.println("Координаты пересечения отрезков " + a1 + "  " + b2);

        }
    }
}