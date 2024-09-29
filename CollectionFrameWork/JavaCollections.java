
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.Set;

public class JavaCollections {
    public static void main(String[] args) {
        
        //  List

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        System.out.println(list);


        //  ArrayList

       

        //  LinkedList
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(15);
        ll.add(30);
        System.out.println(ll);


        //  Vector

        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        System.out.println(vector);


        //  Stack

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(30);
        stack.push(20);
        System.out.println(stack);


        //  Queue
        //  ArrayDeque
        //  PriorityQueue

        
        //  Set
        Set<Integer> set = new HashSet<>();
        set.add(50);
        set.add(30);
        set.add(3);
        System.out.println(set);


        //  LinkedHashSet
        LinkedHashSet<Integer> lHashSet = new LinkedHashSet<>();
        lHashSet.add(15);
        lHashSet.add(5);
        lHashSet.add(9);
        System.out.println(lHashSet);

        //  TreeSet
        TreeSet<Integer> treeSet =  new TreeSet<>();
        treeSet.add(7);
        treeSet.add(4);
        treeSet.add(0);
        treeSet.add(10);
        treeSet.add(4);
        System.out.println(treeSet);
    }


    
}
