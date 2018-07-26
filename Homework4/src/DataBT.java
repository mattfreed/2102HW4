import java.util.LinkedList;

class DataBT implements IBinTree {
    int data;
    IBinTree left;
    IBinTree right;

    DataBT(int data, IBinTree left, IBinTree right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    // an alternate constructor for when both subtrees are empty
    DataBT(int data) {
        this.data = data;
        this.left = new MtBT();
        this.right = new MtBT();
    }

    // determines whether this node or node in subtree has given element
    public boolean hasElt(int e) {
        return this.data == e || this.left.hasElt(e) || this.right.hasElt(e) ;
    }

    // adds 1 to the number of nodes in the left and right subtrees
    public int size() {
        return 1 + this.left.size() + this.right.size();
    }

    // adds 1 to the height of the taller subtree
    public int height() {
        return 1 + Math.max(this.left.height(), this.right.height());
    }
    //checks if heap
    public boolean isHeap() {
    	return left.isBigger(this.data) && right.isBigger(this.data)&&left.isHeap()&&right.isHeap();
    }
    
    //flattens the heap to a LinkedList
    public LinkedList<Integer> flatten(){
    	LinkedList<Integer> list = new LinkedList<>();
    	list.add(this.data);
    	list.addAll(left.flatten());
    	list.addAll(right.flatten());
    	return list;
    }
    @Override
    public boolean isBigger(int e) {
        return (this.data >= e);
    }
    
}