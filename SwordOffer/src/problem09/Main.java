package problem09;

/**
 * @author lurunze
 */
public class Main {
    public static void main(String[] args) {
//        CQueue cQueue = new CQueue();
//        cQueue.appendTail(3);
//        System.out.println(cQueue.deleteHead());
//        System.out.println(cQueue.deleteHead());
//
//        CQueue cQueue2 = new CQueue();
//        System.out.println(cQueue.deleteHead());
//        cQueue.appendTail(5);
//        cQueue.appendTail(2);
//        System.out.println(cQueue.deleteHead());
//        System.out.println(cQueue.deleteHead());

        CQueue2 cQueue = new CQueue2();
        cQueue.appendTail(3);
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());

        CQueue2 cQueue2 = new CQueue2();
        System.out.println(cQueue.deleteHead());
        cQueue.appendTail(5);
        cQueue.appendTail(2);
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
    }
}
