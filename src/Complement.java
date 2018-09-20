
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
public class Complement {


    public String doesComplement(ArrayList<Integer> aList){
        
        String reStr = "∞ - " + aList.toString();
        
        return reStr;
    }
    
    public String doesComplementBoundaries(ArrayList<Integer> aList, int minBound, int maxBound){
        int lowestInt = 0;
        int highestInt = 0;
        for (int i = 0; i < aList.size(); i++) {
            int var = aList.get(i);
            if (minBound >= var) {
                return "List is not a subset";
            }else if(maxBound <= var){
                return "List is not a subset";
            }
            if (var <= lowestInt) {
                lowestInt = var;
            }else if(var >= highestInt){
                highestInt = var;
            }
        }
        
        String reStr = "Complement is {" + lowestInt + ", ... ," + highestInt +"}  exluding" + aList.toString();
        
        return reStr;
    }
    
}
