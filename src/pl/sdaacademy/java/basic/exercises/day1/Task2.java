package pl.sdaacademy.java.basic.exercises.day1;

//Napisz program, który pobierze od użytkownika średnicę okręgu
// (typu float), a następnie obliczy obwód oraz pole tego okręgu

public class Task2 {

    public static void main(String[] args) {
        float radius = getDiameterFromUser() / 2;
        float circumference = calculateCircumferenceOfACircle(radius);
        float area = calculateAreaOfACircle(radius);
        System.out.println("Circumference Of A Circle: " + circumference);
        System.out.println("Area Of A Circle: " + area);
    }

    public static float getDiameterFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter diameter: ");
        return scanner.nextFloat();
    }

    public static float calculateCircumferenceOfACircle(float radius) {
        return 2 * (float) Math.PI * radius;
    }

    public static float calculateAreaOfACircle(float radius) {
        float sqrtDiameter = (float) Math.sqrt(radius);
        return (float) Math.PI * sqrtDiameter;
    }
}
