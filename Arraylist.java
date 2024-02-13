import java.util.Scanner;
import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list =new ArrayList<>();
//        list.add(10) ;
//        list.add(20) ;
//        list.add(30) ;
//        list.add(40) ;
//        list.add(50) ;
//
//        list.addFirst(50);
//        list.addLast(60);
//        list.remove(5);
//        System.out.println(list);
//        System.out.println(list.contains(30));
//        Input
//        for (int i = 0; i < 5; i++)
//        {
//            list.add(in.nextInt());
//
//        }
//
//        //Printing of List
//
//        for (int i = 0; i < 5; i++)
//        {
//            System.out.println(list.get(i));
//        }
//
//
//        System.out.println(list);
//
        //we need to change the arraylist of array list in  initialisation
        //Multidimensional array in Array list0
        //Initialisation
        for (int i = 0; i < 3; i++) {
                list.add(new ArrayList<>());
        }

        //add Element
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                list.get(i).add(in.nextInt());

        }

        System.out.println(list);
    }
}
