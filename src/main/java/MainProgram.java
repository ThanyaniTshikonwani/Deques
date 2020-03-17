public class MainProgram {
    public static void main(String[] args) {
        int [] setArray = new int[]{6,2,6,8,3,7,1,4,4};
        System.out.println ("Number of integer in the set = 9");
        System.out.println ("Size of the subArray to consider = 3");
        System.out.println ("Output = "+Deque.dequeCollection (  setArray,9,3));
        System.out.println ("   ");
        int [] setArray1 = new int[]{2,2, 2, 2, 2, 2, 2, 2};
        System.out.println ("Number of integer in the set = 8");
        System.out.println ("Size of the subArray to consider = 4");
        System.out.println ("Output = "+ Deque.dequeCollection (  setArray1,8,4));
    }
}
