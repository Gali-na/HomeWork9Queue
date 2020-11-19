import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QueuePeople queuePeople = new QueuePeople();
        queuePeople.getQueuePeople().add("Шелдон");
        queuePeople.getQueuePeople().add("Леонард");
        queuePeople.getQueuePeople().add("Воловиц");
        queuePeople.getQueuePeople().add("Кутрапалли");
        queuePeople.getQueuePeople().add("Пенни");
        int countSktakans = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of sktakans");
        countSktakans = scanner.nextInt();
        QueueStatus.status(queuePeople,countSktakans);
    }
}
