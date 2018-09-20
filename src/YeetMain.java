import java.util.ArrayList;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author florenthaxha
 */
public class YeetMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SubSetOrNot y = new SubSetOrNot();
        
        ArrayList<Integer> aList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        ArrayList<Integer> bList = new ArrayList<>(Arrays.asList(8,70,80));
        ArrayList<Integer> cList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        ArrayList<Integer> dList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        ArrayList<Integer> eList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
       
        
        System.out.println("No Matching");
        System.out.println(y.compare(aList, bList));
        
        System.out.println("A is equal to B");
        System.out.println(y.compare(aList, cList));
        
        System.out.println("B is a subset of A");
        System.out.println(y.compare(aList, dList));
        
        System.out.println("A is a subset of B");
        System.out.println(y.compare(aList, eList));
        
    }
    
}
