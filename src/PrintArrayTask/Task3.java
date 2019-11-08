package PrintArrayTask;

import java.util.ArrayList;

public class Task3 {

    private static ArrayList<Object> print(ArrayList<Object> mainList){

        ArrayList<Object> sublist = new ArrayList<>();
        for (Object o : mainList) {
            if(!(o instanceof ArrayList)){
                sublist.add(o);
            }else {
                sublist.addAll((ArrayList) o);
            }
        }
        return sublist;
    }

    private static void print1(ArrayList<Object> mainList){
        System.out.println(mainList.toString());
        System.out.println(print(mainList).toString());
        System.out.println(print(print(mainList)));
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

        print1(mainList);

    }
}