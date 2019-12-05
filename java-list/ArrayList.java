public class ArrayList {
    // initial length of the list
    private static int initialLength = 5;
    // initial current index
    private static int index = 0;

    private static Object[] arrayList, arrayListCopy;

    // create a list with the default length of five;
    public ArrayList() {
        arrayList = new Object[initialLength];
    }

    // If the list is 70% full or more, return true, otherwise return false.
    private boolean isListAlmostFull() {
        double indexDouble = index;
        double length = arrayList.length;
        double percentFull = indexDouble / length;
        if (percentFull >= 0.70) {
            return true;
        } else {
            return false;
        }
    }

    // Double the lenght of the list
    private void expandArrayList(int currentLength) {
        // copy the contents of the current list into a temporary list
        arrayListCopy = arrayList.clone();
        // double the current length
        arrayList = new Object[currentLength * 2];
        for (int i = 0; i < arrayListCopy.length; i++) {
            arrayList[i] = arrayListCopy[i];
        }
    }

    // add integers to the list
    void add(int numToAdd) {
        arrayList[index] = numToAdd;
        // increment the index
        index++;
        if (isListAlmostFull()) {
            expandArrayList(arrayList.length);
            System.out.println("doubling the length");
        }
    }

    // Print the whole list
    void printList() {
        System.out.println("Printing the list: ");
        for (int i = 0; i < index; i++) {
            System.out.println(arrayList[i]);
        }
    }

    // Get the value at the specified index
    int get(int i) {
        System.out.println("Value at " + i + ": " + arrayList[i]);
        return (int) arrayList[i];
    }

    // Get the size of the list
    void size() {
        System.out.println(index);
    }

    // Replace the value at a specified index with the new value
    void set(int i, int value) {
        arrayList[i] = value;
    }

    boolean includes(int value) {
        for (int i = 0; i < index; i++) {
            int valueToCheck = (int) arrayList[i];
            if (valueToCheck == value) {
                System.out.println(value + " found at index " + i);
                return true;
            }
        }
        return false;
    }

}
