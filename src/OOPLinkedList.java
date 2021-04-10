public class OOPLinkedList {

    OOPLinkedListElement head;

    static class OOPLinkedListElement {
        int data;
        OOPLinkedListElement next;

        OOPLinkedListElement(int d) {
            data = d;
            next = null;
        }
    }

    public static OOPLinkedList insert(OOPLinkedList list, int data) {
        OOPLinkedListElement new_head = new OOPLinkedListElement(data);
        new_head.next = list.head;

        list.head = new_head;
        return list;
    }

    public static OOPLinkedList remove(OOPLinkedList list){
        list.head = list.head.next;
        return list;
    }

    public static int getHead(OOPLinkedList list) {
        return list.head.data;
    }

    public static int getnth(OOPLinkedList list, int n) {
        OOPLinkedListElement current = list.head;
        for (int i=0;i<=n;i++) {
            if (current.next == null) {
                System.out.println("The list isn't that long.");
                return 0;
            } else {
                if (i==n) {
                    return current.data;
                } else {
                    current = current.next;
                }
            }
        }
        return 0;
    }

    public static int length(OOPLinkedList list) {
        OOPLinkedListElement current = list.head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

}
