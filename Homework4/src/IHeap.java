import java.util.Random;
import java.util.LinkedList;

interface IHeap extends IBinTree {
    // adds given element to the heap without removing other elements
    IHeap addElt(int e);

    // removes one occurrence of the smallest element from the heap
    IHeap remMinElt();

    // Merge the current heap with another heap
    IHeap merge(IHeap withHeap);

    
}