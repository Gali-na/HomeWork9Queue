public class QueueStatus {
    public static void status(QueuePeople queuePeople, int countSktakans) {
        for(int i=0;i<countSktakans;i++) {
          String person=queuePeople.getQueuePeople().pop();
            queuePeople.getQueuePeople().add(person);
            queuePeople.getQueuePeople().add(person);
        }
        System.out.println(queuePeople.getQueuePeople());
    }
}
