public class ArrayList {
    // initial length of the list
    private int initialLength = 5;
    // initial current index
    private int index = 0;
    
    private Object[] arrayList, arrayListCopy;

    // create a list with the default length of five;
    public ArrayList(){
        arrayList = new Object[initialLength];
    }

    public void add(int numToAdd){
        arrayList[index] = numToAdd;
        // increment the index
        index++;
        // how full is our list?
        double percentFull = index / arrayList.length;
        // if list capacity 70% or more, double the size of the list
        if (percentFull >= 0.70) {
            expandArrayList(arrayList.length);
        }
    }

    public void expandArrayList(int currentLength){
        // copy the contents of the current list into a temporary list
        arrayListCopy = arrayList.clone();
        // double the current length
        arrayList = new Object[currentLength * 2];
        System.arraycopy(arrayListCopy, 0, arrayList, 0, currentLength);
    }

    // Print the whole list
    public void printList(){
        System.out.println("Printing the list: ");
        for(int i = 0; i < index; i++) {
            System.out.println(arrayList[i]);
        }
    }

    // Get the value at the specified index
    public void get(int i) {
        System.out.println("Value at" + i + ":" + arrayList[i]);
    }
}

