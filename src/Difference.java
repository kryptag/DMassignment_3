
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
public class Difference {
    
    public ArrayList<Integer> getDifference(ArrayList<Integer> aList, ArrayList<Integer> bList){
        
        ArrayList<Integer> difference = new ArrayList<>();
        
        for (int i = 0; i < aList.size(); i++) {
            int var = aList.get(i);
            if (!bList.contains(var)) {
                difference.add(var);
            }
        }
        
        return difference;
    }
    
}
