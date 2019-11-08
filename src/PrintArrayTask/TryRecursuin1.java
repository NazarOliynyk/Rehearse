package PrintArrayTask;

//import javax.xml.soap.Node;
import java.util.*;

public class TryRecursuin1 {

    private static void print(List<Object> mainList)  {
        //Object [] arr = mainList.toArray();
       // System.out.println(arr.);
        List<Object> linkedList = new LinkedList<>();


        //System.out.println(linkedList.iterator().next());

       linkedList.addAll(mainList);
//        System.out.println(linkedList.iterator().next());
 //       System.out.println(linkedList.lastIndexOf(linkedList));
//        while (linkedList.iterator().next()!=null){
//
//            print(mainList);
//            //System.out.println(linkedList.toString());
//            return;
//        }
       // System.out.println(linkedList.toString());
       // System.out.println(linkedList);
        String s = mainList.toString();
        String sd = Arrays.deepToString(mainList.toArray());
        //System.out.println(s);
        //System.out.println(sd);
        System.out.println(mainList.toString());
        //System.out.println(mainList.pop());
      // System.out.println(mainList.toString());
      //  System.out.println(Arrays.deepToString(mainList.toArray()));
        //            else {
//                print(mainList);
//                return;
//            }
        for (Object o : mainList)
            if (o instanceof ArrayList) {
               // System.out.println(mainList.toString());
                // System.out.println(s.replaceAll(o.toString(), "fdgd"));
//                System.out.println(mainList.subList(mainList.indexOf(o), mainList.indexOf(o)+1));
//                System.out.println(mainList.subList(0, mainList.indexOf(o)));

//                mainList.addAll((ArrayList) o);
//                mainList.remove(o);
                // print((List<Object>) o);
                //  print(Arrays.deepToString(mainList.toArray()));
                // System.out.println(Arrays.deepToString(mainList.toArray( ((ArrayList) o).toArray())));
                //print();
                //return;
//                System.out.println(mainList);
//                System.out.println(o.toString());
//                print(mainList);
//                    return;
                // System.out.println(o);
//                for (Object o1 : o) {
//
//                }
                for (Object o1 : (ArrayList) o) {

                }


            } else {
                System.out.println(o.toString());
            }
   // mainList.
//        for (int i =0; i<mainList.size(); i++){
//            if (mainList.get(i) instanceof ArrayList){
//                for (int j =0; j < ((ArrayList) mainList.get(i)).size(); j++){
//                    if (((ArrayList) mainList.get(i)).get(j) instanceof ArrayList){
//                        for (int k=0; k<((ArrayList) ((ArrayList) mainList.get(i)).get(j)).get(k)))
//                    }else {System.out.println(((ArrayList) mainList.get(i)).get(j));}
//
//                }
//            }else {
//                System.out.println(mainList.get(i).toString());
//            }
//        }

    }

    private static void print2(List<Object> mainList){

        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.addAll(mainList);

//        for (Object o : linkedList) {
//            if(o instanceof ArrayList){
//                print2(linkedList);
//                System.out.println(linkedList.toString());
//                return;
//            }
//        }
       // if (linkedList.getLast()==null) return;
       // print2(linkedList);
        System.out.println(linkedList.toString());
        System.out.println(linkedList.getLast()+", "+linkedList.getFirst());
    }

    private static void print1(List<Object> list){
        for (Object o : list) {
            
        }
    }

    private static void print3(List<Object> list, Iterator it){
        Iterator iterator = list.iterator();
        System.out.println(list.toString());
       // System.out.println(iterator.next().toString());
        System.out.println(iterator);
        System.out.println(iterator.toString());
        while (iterator.hasNext()){
            System.out.println(iterator.next());
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

       // print(mainList);
        //print1(mainList);
       // print2(mainList);
        Iterator iterator = mainList.iterator();
        print3(mainList, iterator);
    }
}
