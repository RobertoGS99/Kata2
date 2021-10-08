/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2_rgs;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class Histogram<T> {
    private final T [] data;

    public Histogram(T[] data) {
        this.data = data;
    }

    public T[] getData() {
        return data;
    }
    
    public Map<T,Integer> getHistogram(){
        Map<Integer,Integer> histogram = new HashMap<Integer,Integer>();
        for (T key : data) {
            histogram.put((Integer) key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        return (Map<T, Integer>) histogram;
    }
}
