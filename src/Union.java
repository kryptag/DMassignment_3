
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author florenthaxha
 */
public class Union {
    
    public ArrayList<Integer> unionSet(ArrayList<Integer> aList, ArrayList<Integer> bList){
        ArrayList<Integer> unionedSet = new ArrayList<>();
        
        unionedSet.addAll(aList);
        unionedSet.addAll(bList);
        
        return unionedSet;
    }
    
    
}
