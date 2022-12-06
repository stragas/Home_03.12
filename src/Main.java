public class Main {
    public static void main(String[] args) {
        int a1, a2, b1, b2;

        a1 = 3; //Первый
        b1 = 7; //отрезок
        a2 = 0; //Второй
        b2 = 9; //отрезок

        if (b1 < a2 || b2 < a1) {  //Проверка на отсутствие пересечения
            System.out.println("Пересечения отрезков нет");
        }
        else if ((b1 == a2) || (b2 == a1)) {
            System.out.println(" Координата пересечения отрезков: " + Math.max(a1,a2));
        }
        else  {
            System.out.println("Первая координата пересечения отрезков: " + Math.max(a1,a2));
            System.out.println("Вторая координата пересечения отрезков: " + Math.min(b1,b2));
        }


    }
}