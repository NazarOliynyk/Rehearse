package PrintArrayTask;

import java.util.ArrayList;

public class Task1 {


    private static void print1(ArrayList<Object> mainList){


        System.out.println();
        ArrayList<Object> sublist = new ArrayList<>();

        for (Object o : mainList) {
            if(!(o instanceof ArrayList)){
                sublist.add(o);
            }else {
                for (Object o1 :(ArrayList) o) {
                    if (!(o1 instanceof ArrayList)){
                        sublist.add(o1);
                    }else {
                        sublist.addAll((ArrayList) o1);
                    }
                }
            }

        }
        System.out.println(sublist.toString());

    }

    private static void print2(ArrayList<Object> mainList){

        System.out.println();
        ArrayList<Object> sublist = new ArrayList<>();

        for (Object o : mainList) {
            if(!(o instanceof ArrayList)){
                sublist.add(o);
            }else {
                sublist.addAll((ArrayList) o);
            }

        }
        System.out.println(sublist.toString());

    }

    private static void print3(ArrayList<Object> mainList){

        for (int i = 0; i < mainList.size(); i++) {
            while (!(mainList.get(i) instanceof ArrayList)){
                System.out.print(mainList.get(i)+", ");
                i++;
            } if(mainList.get(i) instanceof ArrayList){
                for(int j = 0; j<((ArrayList) mainList.get(i)).size(); j++){
                    while (!(((ArrayList) mainList.get(i)).get(j) instanceof ArrayList)){
                        System.out.print( ((ArrayList) mainList.get(i)).get(j)+", ");
                        j++;
                    }if (((ArrayList) mainList.get(i)).get(j) instanceof ArrayList){
                        for(int y = 0; y <((ArrayList) ((ArrayList) mainList.get(i)).get(j)).size(); y++){
                            System.out.print( ((ArrayList) ((ArrayList) mainList.get(i)).get(j)).get(y)+", ");
                        }
                    }
                }

            }
        }
        System.out.println();
    }

    private static void print4(ArrayList<Object> mainList){

        for (int i = 0; i < mainList.size(); i++) {
            while (!(mainList.get(i) instanceof ArrayList)){
                System.out.print(mainList.get(i)+", ");
                i++;
            } if(mainList.get(i) instanceof ArrayList){
                for(int j = 0; j<((ArrayList) mainList.get(i)).size(); j++){
                    System.out.print( ((ArrayList) mainList.get(i)).get(j)+", ");
                    j++;
                }

            }
        }
        System.out.println();
    }



    public static void main(String[] args){

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

        System.out.println(mainList.toString());
        print1(mainList);
        print2(mainList);
        System.out.println("--------------");
        print3(mainList);
        print4(mainList);
    }



}
