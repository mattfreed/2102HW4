import java.util.Collections;
import java.util.LinkedList;
public class HeapTester {

	/*
    addEltTester() takes a heap, an integer, and a binary tree (in that order), and returns true if the
    binary tree is a valid result of adding the given integer to the first Heap.
    */
    boolean addEltTester(IHeap hOrig, int elt, IBinTree hAdded) {

    	LinkedList<Integer> heapList = new LinkedList<>();
    	LinkedList<Integer> bstList = new LinkedList<>();
    	if (hAdded.isHeap()) {
    		heapList = hOrig.flatten();
    		heapList.add(elt);
    		bstList = hAdded.flatten();
    		Collections.sort(heapList);
    		Collections.sort(bstList);
    		for(int i = 0; i < heapList.size(); i++) {
    			if (heapList.get(i)!= bstList.get(i)) {
    				return false;
    			}
    		}
    		return true;
    	}
    	return false;
    }
    
    
    /*
    remMinEltTester() takes a heap and a binary tree (in that order), and returns true if the
    binary tree is a valid result of removing the min integer in the first Heap.
    */
    boolean remMinEltTester(IHeap hOrig, IBinTree hRemoved) {

    //...code to compare hOrig and hRemoved as appropriate...
    	LinkedList<Integer> heapList = new LinkedList<>();
    	LinkedList<Integer> bstList = new LinkedList<>();
    	if (hRemoved.isHeap()) {
    		heapList = hOrig.flatten();
    		bstList = hRemoved.flatten();
    		Collections.sort(heapList);
    		Collections.sort(bstList);
    		for(int i = 0; i < heapList.size(); i++) {
    			if (heapList.get(i)!= bstList.get(i)) {
    				return false;
    			}
    		}
    		return true;
    	}
    	return false;
    }
  }


