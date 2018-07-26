//Matt Freed and Dillon Arnold

import org.junit.Test;
import java.util.LinkedList;
import static org.junit.Assert.*;

import static org.junit.Assert.assertTrue;

public class Examples {

    public Examples(){}
    IHeap heap1 = new DataHeap(2, new DataHeap(5), new DataHeap(10));
    IHeap heap2 = new DataHeap(5);
    IHeap heap3 = new DataHeap(1, heap1, new DataHeap(20));
    IHeap heap4 = new DataHeap(2, heap2, new DataHeap(20));
    IHeap heap5 = heap4.addElt(10);
    IHeap emptyHeap = new DataHeap(1, new MtHeap(), new MtHeap());
    
    
    IBinTree treeCompare = heap1.addElt(6);
    IBinTree treeCompare2 = heap2.addElt(6);
    IBinTree treeCompare5 = new MtHeap().addElt(7);
    
    
    IBinTree treeCompare3 = heap3.remMinElt();
    IBinTree treeCompare4 = emptyHeap.remMinElt();
    
 
    HeapTester HT = new HeapTester();
    HeapTester HT2 = new HeapTester();
   
    
    LinkedList<Integer> list1 = new LinkedList<>();
    

    @Test //test add return true Bt is an answer
    public void test1(){
        assertTrue(HT.addEltTester(heap1,6,treeCompare));
    }
    @Test //test add return false Bt is not an answer
    public void test2(){
        assertFalse(HT.addEltTester(heap2,7,treeCompare2));
    }
    @Test //test add to empty heap, BT is Answer
    public void test3(){
        assertTrue(HT.addEltTester(new MtHeap(),7,treeCompare5));
    }
    @Test //test remove min, BT is Answer
    public void test4(){
        assertTrue(HT2.remMinEltTester(heap5,treeCompare3));
    }
    @Test //test remove min, BT is not Answer
    public void test5(){
        assertFalse(HT2.remMinEltTester(heap3,treeCompare3));
    }
    @Test //test return empty heap, BT is answer
    public void test6(){
        assertTrue(HT2.remMinEltTester(new MtHeap(),treeCompare4));
    }
    
    @Test //test isHeap True
    public void test7(){
        assertTrue(treeCompare.isHeap());
    }
    @Test //test isHeap MtBT, always true
    public void test8(){
        assertTrue(new MtBT().isHeap());
    }
    @Test //test isHeap MtHeap, always true
    public void test9(){
        assertTrue(new MtHeap().isHeap());
    }
    
	@Test //test flatten, regular heap
    public void test10(){
		list1.add(2);
		list1.add(5);
		list1.add(10);
        assertEquals(list1,heap1.flatten());
    }
	@Test //test flatten, MtBT
    public void test11(){
		
        assertEquals(new LinkedList<>(),new MtBT().flatten());
    }
	@Test //test flatten, MtHeap
    public void test12(){
		
        assertEquals(new LinkedList<>(),new MtHeap().flatten());
    }
	 
	 
}
