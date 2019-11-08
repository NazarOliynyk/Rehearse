package PrintArrayTask;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TryRecursionWithCopyOnWriteArrayList {

    private static void print(List<Object> mainList)  {

        List<Object> list = new CopyOnWriteArrayList<>(mainList);
        System.out.println(list.toString());
        for (Object o : list) {
            if(o instanceof ArrayList){
                list.remove(o);
                list.addAll((ArrayList) o);
                print(list);
            }
        }


    }

    public static void main(String[] args) {

        ArrayList<Object> mainList = new ArrayList<>();

        mainList.add(1);
        mainList.add(2);
        mainList.add(3);
        mainList.add(4);
        ArrayList<Object> newList1 = new ArrayList<>();
        newList1.add(5);
        newList1.add(6);
        newList1.add(7);
        newList1.add(8);
        ArrayList<Object> newList2 = new
                ArrayList<>();
        newList2.add(9);
        newList2.add(10);
        newList2.add(11);
        newList1.add(newList2);
        mainList.add(newList1);

        print(mainList);
    }
}
