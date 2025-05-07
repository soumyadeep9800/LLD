//BAD code
// in this code we do same thing multiple time
import java.util.*;
public class xxx{
    public static int sumAll(List<Integer> nums){
        int sum=0;
       for(int num:nums){
        sum+=num;
       } 
       return sum;
    }
    public static int sumAllOdd(List<Integer> nums){
       int sum=0;
       for(int num:nums){
        if(num%2!=0){
            sum+=num;
        }
       }
       return sum;
    }
    public static int sumAllEven(List<Integer> nums){
       int sum=0;
       for(int num:nums){
        if(num%2==0){
            sum+=num;
        }
       }
       return sum;
    }
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        System.out.println(sumAll(nums));
        System.out.println(sumAllOdd(nums));
        System.out.println(sumAllEven(nums));
    }
}
