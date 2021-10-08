
package kata2_rgs;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class kata2_rgs {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        
        Integer[] data ={1,2,3,4,5,5,6,7,8,9,9,10,2,11,2};
        
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();        
        
       
        
        
        for (Integer key : histogr.keySet()) {
            System.out.println(key + "==>" + histogr.get(key));
        }
        
        
        
        
        
        
        
        //primer metodo
        /*for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            System.out.println("La clave "+entry.getKey()+" corresponde al valor " + entry.getValue());
        }
        
        //segundo metodo
        for (Integer integer : hashMap.keySet()) {
            System.out.println("La clave es: "+integer);
            
        }
        
        for (Integer value : hashMap.values()) {
            System.out.println("El valor es: " + value);
        }
        
        //tercer metodo uno. version antigua de java o eliminar mientras se recorre, sino 
        Iterator<Map.Entry<Integer,Integer>> iterator =  hashMap.entrySet().iterator();
        
        while (iterator.hasNext()){
            Map.Entry<Integer,Integer> next = iterator.next();
            System.out.println("La clave "+next.getKey()+" corresponde al valor " + next.getValue());
        }
        
        //tercer metodo dos.
        Iterator iterator2 =  hashMap.entrySet().iterator();
        while (iterator2.hasNext()){
            Map.Entry entry = (HashMap.Entry) iterator.next();
            Integer key = (Integer) entry.getKey();
            Integer value = (Integer) entry.getValue();
            System.out.println("La clave "+key+" corresponde al valor " + value);
        }
        
        
        //cuarto metodo.
        
        for (Integer key : hashMap.keySet()) {
            System.out.println("La clave:  "+key+" corresponde al valor "+ hashMap.get(key));
            
        }*/
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
