public class MyCircularQueue {
    class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    int size, ele;
    ListNode head, curr;
    public MyCircularQueue(int k) {
        size = k;
        ele = 0;
        curr = head = new ListNode(0);
    }

    public boolean enQueue(int value) {
        if (ele > size) return false;
        curr.next = new ListNode(value);
        curr = curr.next;
        ele++;
        return true;
    }

    public boolean deQueue() {
        if (ele == 0) return false;
        head=head.next;
        ele--;
        return true;
    }

    public int Front() {
        return head.val;
    }

    public int Rear() {
        return curr.val;
    }

    public boolean isEmpty() {
        return ele == 0;
    }

    public boolean isFull() {
        return ele == size;
    }
}
