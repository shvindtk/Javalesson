public class Stack {

        private int min;
        private int[] stackArray;
        private int head;

        public Stack(int m) {
            this.min = m;
            stackArray = new int[min];
            head = -1;
        }

        public void addElement(int element) {
            stackArray[head++] = element;
        }

        public int deleteElement() {
            return stackArray[head--];
        }




}
