package uge1_interfaces;

public class LinkedStak implements Stak {

    class Element{
        private String s;
        private Element next;

        public Element(String s, Element next){
            this.s = s;
            this.next = next;
        }
        public Element(String s){
            this.s = s;
            this.next = null;
        }
    }

    private Element first;
    private Element actual;

    @Override
    public void push(String e) {


        if(first == null){
            first = new Element(e);
        } else{
            Element temp = first;
            first = new Element(e, temp);
        }
    }

    @Override
    public String pop() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public String[] show() {
        int countLength = 0;

        String s = "";

        if(first != null){
            s += first.s;
            countLength++;
        } else{
            System.out.println("The string is empty");
            throw new UnsupportedOperationException("The \"stak\" is empty");
        }

        actual = first;

        while(actual.next != null){
            actual = actual.next;
            s += actual.s;
            countLength++;
        }

        System.out.println(s); // can be deleted. Only for exercising purposes.
        return getArray(countLength);

    }

    private String[] getArray(int countLength){
        String[] array = new String[countLength];
        array[0] = first.s;
        actual = first;
        for(int i=1; i<array.length; i++){
            actual = actual.next;
            array[i] = actual.s;
        }
        return array;
    }
}
