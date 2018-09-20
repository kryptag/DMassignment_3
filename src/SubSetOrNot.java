
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
public class SubSetOrNot {
    
    public int compare(ArrayList a1, ArrayList a2){
        if(a1.containsAll(a2) && a2.containsAll(a1)){
            return 0;
        }else if(a1.containsAll(a2) ){
            return -1;
        }else if(a2.containsAll(a1)){
            return 1;
        }
        return -2;
    }

}
