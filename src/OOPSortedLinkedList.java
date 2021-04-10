public class OOPSortedLinkedList extends OOPLinkedList {

    public static OOPSortedLinkedList insert(OOPSortedLinkedList list, int data) {
        OOPLinkedListElement current = list.head;
        OOPLinkedListElement newNode = new OOPLinkedListElement(data);
        if (current == null || current.data >= data) {
            newNode.next = list.head;
            list.head = newNode;
            return list;
        } else {
            OOPLinkedListElement next = list.head.next;
            while (next != null) {
                if (next.data>=data) {
                    newNode.next = next;
                    current.next = newNode;
                    return list;
                } else {
                    current = next;
                    next = current.next;
                }
            }
            current.next = newNode;
            newNode.next = next;
            return list;
        }
    }

    //just a wee test to make sure it works
    public static void main(String[] args) {
        OOPSortedLinkedList list = new OOPSortedLinkedList();
        insert(list,1);
        insert(list,0);
        insert(list,2);
        insert(list,0);
        insert(list, 1);
        OOPLinkedListElement current = list.head;
        while(current!=null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

}
