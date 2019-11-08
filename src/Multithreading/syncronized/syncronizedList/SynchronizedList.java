package Multithreading.syncronized.syncronizedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedList {

    private List<Object> unsafeList = new ArrayList<Object>();
    private final List<Object> safeList = Collections.synchronizedList(unsafeList);

    public void print(){
        synchronized (safeList) {
            Iterator<Object> it = safeList.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }

}
