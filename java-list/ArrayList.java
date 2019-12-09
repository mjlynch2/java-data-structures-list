public class ArrayList<T> {
    // initial length of the list
    private static int initialLength = 5;
    // initial current index
    private int currSize = 0;

    private int[] arrayList;

    // create a list with the default length of five;
    public ArrayList() {
        arrayList = new int[initialLength];
    }

    private boolean isListFull() {
        double indexDouble = currSize;
        double length = arrayList.length;
        double percentFull = indexDouble / length;
        if (percentFull == 1) {
            return true;
        } else {
            return false;
        }
    }

    // Double the lenght of the list
    private void expandArrayList() {
        // copy the contents of the current list into a temporary list
        int[] arrayListCopy = new int[currSize * 2];
        // double the current length

        for (int i = 0; i < this.arrayList.length; i++) {
            arrayListCopy[i] = this.arrayList[i];
        }
        this.arrayList = arrayListCopy;
    }

    // add integers to the list
    void add(int numToAdd) {
        arrayList[currSize] = numToAdd;
        // increment the index
        currSize++;
        if (isListFull()) {
            expandArrayList();
            System.out.println("doubling the length");
        }
    }

    // Print the whole list
    void printList() {
        System.out.println("Printing the list: ");
        for (int i = 0; i < currSize; i++) {
            System.out.println(arrayList[i]);
        }
    }

    // Get the value at the specified index
    int get(int i) {
        System.out.println("Value at " + i + ": " + arrayList[i]);
        return arrayList[i];
    }

    // Get the size of the list
    void size() {
        System.out.println(currSize);
    }

    // Replace the value at a specified index with the new value
    void set(int i, int value) {
        arrayList[i] = value;
    }

    boolean includes(int value) {
        for (int i = 0; i < currSize; i++) {
            int valueToCheck = arrayList[i];
            if (valueToCheck == value) {
                System.out.println(value + " found at index " + i);
                return true;
            }
        }
        return false;
    }

}
