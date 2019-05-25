package queue;

public class Dequeue<E>  extends QueueImpl <E> implements Queue<E>{

    @SuppressWarnings("unchecked")
    public Dequeue(int maxSize) {
        super(maxSize);
    }

    public void insertLeft(E value) {
        if (isFull()) {
            throw new RuntimeException("queue is full");
        }

        if (front-1 < 0) {
            front = data.length;
        }
        data[front-1] = value;
        front--;
        size++;
    }

    public void insertRight(E value) {
        if (isFull()) {
            throw new RuntimeException("queue is full");
        }

        if (rear == data.length - 1) {
            rear = DEFAULT_REAR;
        }

        data[++rear] = value;
        size++;
    }

    public E removeLeft() {
        if (isEmpty()) {
            throw new RuntimeException("queue is empty");
        }

        if (front == data.length) {
            front = DEFAULT_FRONT;
        }

        E value = data[front++];
        size--;

        return value;
    }

    public E removeRight() {
        if (isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        if (rear < 0) {
            rear = data.length - 1;
        }
        E value = data[rear];
        rear--;
        size--;

        return value;
    }

}
