public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList testList = new ArrayList();
        testList.add(4);
        testList.add(3);
        testList.add(2);
        testList.add(1);
        testList.add(0);
        testList.add(9);
        testList.add(8);
        testList.add(7);
        testList.get(1);
        testList.size();
        testList.set(0, 12);
        testList.get(0);
        System.out.println(testList.includes(4));
        System.out.println(testList.includes(12));
        testList.printList();
    }
}