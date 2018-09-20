
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
public class Membership {
    
    public Boolean isMember(ArrayList<Integer> set, int element){
        
        for (int i = 0; i < set.size(); i++) {
            if (element == set.get(i)) {
                return true;
            }
        }
        
        return false;
    }
    
    
    
}
