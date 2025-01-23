import java.util.ArrayList;
 import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

 public class ContainsPair {

     public static void main(String[] args) {
         List<Integer> list1 = Arrays.asList(1, 2, 3, 2);
         List<Integer> list2 = Arrays.asList(5, 2, -10, 44, 90);
         System.out.println(ContainsPair.check(list1)); // should print true
         System.out.println(ContainsPair.check(list2)); // should print false
     }
     public static boolean check(List<Integer> l) {
         Set<Integer> hold = new HashSet<Integer>();
         hold.addAll(l);
         return hold.size() != l.size();
     }
 }