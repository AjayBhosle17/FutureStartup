import java.util.*;
class Future{

    static LinkedList<Integer> mergeLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> mergedList = new LinkedList<>();

        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                mergedList.add(list1.get(i));
                i++;
                
            }else {
                mergedList.add(list2.get(j));
                j++;
            }
        }
        while(i<list1.size()){
            mergedList.add(list1.get(i));
        }
        System.out.println("Hi");
        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return new LinkedList<>(mergedList);
    }
    public static void main(String[] args) {

        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(3);
        l.add(6);
        System.out.println("LinkedList:" + l); 

        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(2);
        l2.add(4);
        l2.add(7);

        LinkedList<Integer> mergedList = mergeLists(l, l2);

        System.out.println(mergedList);

    }
}
