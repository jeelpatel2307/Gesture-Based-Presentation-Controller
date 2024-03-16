import java.util.Scanner;

// Gesture-based presentation controller
public class GesturePresentationController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gesture Presentation Controller");

        while (true) {
            System.out.println("Enter gesture (next/previous/stop): ");
            String gesture = scanner.nextLine();

            if (gesture.equalsIgnoreCase("next")) {
                nextSlide();
            } else if (gesture.equalsIgnoreCase("previous")) {
                previousSlide();
            } else if (gesture.equalsIgnoreCase("stop")) {
                stopPresentation();
                break;
            } else {
                System.out.println("Invalid gesture. Try again.");
            }
        }

        scanner.close();
    }

    // Simulate next slide action
    private static void nextSlide() {
        System.out.println("Next slide");
    }

    // Simulate previous slide action
    private static void previousSlide() {
        System.out.println("Previous slide");
    }

    // Stop presentation
    private static void stopPresentation() {
        System.out.println("Presentation stopped");
    }
}
