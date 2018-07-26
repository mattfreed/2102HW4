import java.lang.Math;
import java.util.LinkedList;

interface IBinTree {
    // determines whether element is in the tree
    boolean hasElt(int e);
    // returns number of nodes in the tree; counts duplicate elements as separate items
    int size();
    // returns depth of longest branch in the tree
    int height();
    // Determine if the root of this heap is bigger than the given element
    boolean isBigger(int e);
  //Determines if is a heap
    boolean isHeap();
    //flattens the heap to a linkedList for comparison
    LinkedList<Integer> flatten();
}