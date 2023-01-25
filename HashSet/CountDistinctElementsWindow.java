package HashSet;
import java.util.*;

public class CountDistinctElementsWindow {
    public void  countDistinctElement(int a[] , int k ){

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i: a){
            map.put(a[i], map.getOrDefault(a[i] , 0)+1);
        }
        System.out.println(map.size());

        for(int i = k ; i<a.length ; i++){
            if(map.get(a[i-k] == 1) != null) map.remove(a[i-k]);

            else{
                map.put(a[i-k] , map.get(a[i-k] - 1));
            }

            map.put(a[i], map.getOrDefault(a[i] , 0)+1);
        }
        }
    }

