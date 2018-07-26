import java.util.LinkedList;

class MtBT implements IBinTree {
    MtBT(){}

    // returns false since empty tree has no elements
    public boolean hasElt(int e) {
        return false;
    }

    // returns 0 since empty tree has no elements
    public int size() {
        return 0;
    }

    // returns 0 since empty tree has no branches
    public int height() {
        return 0;
    }
    
    public boolean isBigger(int e) {
    	return true;
    }
    
  //Determines if is a heap
    public boolean isHeap() {
    	return true;
    }
    
    //flattens the heap to a LinkedList
    public LinkedList<Integer> flatten(){
    	LinkedList<Integer> list = new LinkedList<>();
    	return list;
    }
    
}