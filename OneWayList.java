
public class OneWayList<A> implements ArrayList<A> {
    private Element head;

    private class Element{
        Element next;
        A value;
        Element(A value) {
            this.value = value;
        }
    }
    public void delete(A value) {
        Element el = new Element(value);
        if (head == null) {
            System.out.println("Array is empty");
        } else {
            el=head;
            head.next=el;
            head=null;
        }

        }
}
