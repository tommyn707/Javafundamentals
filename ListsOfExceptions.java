
import java.util.*;

public class ListsOfExceptions{
    public void workTest(){
        ArrayList<Object> workList = new ArrayList<Object>();
        workList.add("1");
        workList.add("2");
        workList.add(5);
        workList.add("3");
        workList.add(9);
    
        try {
            for(int i = 0; i < workList.size(); i++){
                Integer castedValue = (Integer) workList.get(i);
            } 
        } catch(ClassCastException e) {
            System.out.println("Hi");
        }
    
   }
}