package PrintArrayTask;

import java.util.*;

public class TryRecursion {

    private static void print(List<Object> mainList)  {

        System.out.println(mainList.toString());
        for (Object o : mainList) {
            if(o instanceof ArrayList){
               mainList.addAll((ArrayList) o);
                mainList.remove(o);
                print(mainList);
                return;
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
