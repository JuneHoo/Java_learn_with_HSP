package DataStructure;


import java.util.Scanner;

public class ArrayQueueDemo {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(3);
        char key = ' ';
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("s(show):");
            System.out.println("e(exit):");
            System.out.println("a(add):");
            System.out.println("g(get):");
            System.out.println("h(head):");
            key = scanner.next().charAt(0); // 接收一个字符
            switch (key) {
                case 's':
                    arrayQueue.showQueue();
                    break;
                case 'a':
                    System.out.println("Enter a number:");
                    int value = scanner.nextInt();
                    arrayQueue.addQueue(value);
                    break;
                case 'g':
                    // get the data
                    try {
                        int result = arrayQueue.getQueue();
                        System.out.printf("The data we get is %d\n", result);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    // look the font data
                    try {
                        int result = arrayQueue.headQueue();
                        System.out.printf("The front data we get is %d\n", result);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                    scanner.close();
                    loop = false;
                    break;
                default:
                    break;
            }
        }
    }

}

// 使用数组模拟队列
class ArrayQueue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        front = -1; // 指向队列头部
        rear = -1; // 指向队列尾部
    }

    public boolean isFull() {
        return rear == maxSize - 1;
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public void addQueue(int n) {
        // 先判断是否队列满了
        if (isFull()) {
            System.out.println("队列已满 不能加入数据");
            return;
        }
        rear++;
        arr[rear] = n;
    }

    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        front++;
        return arr[front];
    }

    public void showQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty, no data there");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]=%d\n", i, arr[i]);
        }

    }
    // Show the front data
    public int headQueue() {
        if (isEmpty()) {
//            System.out.println("Queue is empty, no data there");
            throw new RuntimeException("Queue is empty, no data there");
        }
        return arr[front + 1];
    }
}
