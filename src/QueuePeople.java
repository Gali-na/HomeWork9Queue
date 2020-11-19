import java.util.ArrayDeque;

public class QueuePeople {
 private ArrayDeque<String> queuePeople;

    public QueuePeople(ArrayDeque<String> queuePeople) {
        this.queuePeople = queuePeople;
    }

    public QueuePeople() {
        queuePeople = new ArrayDeque<>();
    }

    public ArrayDeque<String> getQueuePeople() {
        return queuePeople;
    }

    public void setQueuePeople(ArrayDeque<String> queuePeople) {
        this.queuePeople = queuePeople;
    }
}
