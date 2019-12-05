public class ArrayList {
    // initial length of the list
    private int initialLength = 5;
    // initial current index
    private int index = 0;
    // 

    private Object[] arrayList;

    // create a list with the default length of five;
    public ArrayList(){
        arrayList = new Object[initialLength];
    }

    public void add(Int numToAdd){
        arrayList[index] = numToAdd;
    }

    public void expandArrayList(int currentLength){
        arrayListCopy = arrayList.clone();
        arrayList = new Object[currentLength * 2];
        // how full is our list?
        double percentFull = index / maxLength;
        // if it's 70% or more, double the size of the list
        if(percentFull >= 0.70 ){

        }
    }
}