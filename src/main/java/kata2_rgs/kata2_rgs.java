
package kata2_rgs;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class kata2_rgs {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        HashMap <Integer, Integer> histogram = new HashMap <Integer,Integer>();
        
        int[] data;
        data = new int[15];
        for (int i = 0; i < 15; i++) {
            data[i]= i;
        }
        
        for (int i = 0; i < data.length; i++) {
            if (histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i])+1);
            }else {
                histogram.put(data[i], 1);
            }
            
        }
        
        for (Integer key : histogram.keySet()) {
            System.out.println(key + "==>" + histogram.get(key));
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
