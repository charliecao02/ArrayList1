import java.util.ArrayList;

class Question4 {
    
    public static void filter(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        //This method removes all the elements in list1 that also appear in list2
        int i=0;
        while(i<list1.size()){
            for(int i1=0;i1<list2.size();i1++){
                if(list1.get(i)==list2.get(i1)) {
                    list1.remove(i);
                }
            }
            i++;
        }
    }
    
    public static void main (String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list2.add(2);
        list2.add(4);
        System.out.println("The list before: " + list1);
        filter(list1,list2);
        System.out.println("The list after:  " + list1);
        //the list after should be [1,3]
    }
    
    
    
}
