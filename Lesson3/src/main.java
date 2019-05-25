import queue.Dequeue;



public class main {
    public static void main(String[] args) {
        String txt = "Text";
        System.out.println( new StringReverse(txt).readReverse());

        testDequeue();
    }


    private static void testDequeue() {

        Dequeue<Integer> queue = new Dequeue<>(5);
        queue.insertRight(1);
        queue.insertRight(2);
        queue.insertRight(3);
        queue.insertLeft(4);
        queue.insertLeft(5);

        while (!queue.isEmpty()) {
            System.out.println(queue.removeLeft());
        }

//
    }
}
