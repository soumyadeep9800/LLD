//we solve previous q in better way to use lambda function and predicate

/*
predicate --

Predicate<Integer> isOdd = (x) ->x%2 !=0;
isOdd.test(5);

 */

import java.util.*;
import java.util.function.Predicate;
public class xxx1 {
    public static int sumByTest(List<Integer> nums, Predicate<Integer> selector){
        int sum=0;
        for(int num:nums){
            if(selector.test(num)){
                sum+=num;
            }
        }
        return sum;
    }
    public static int sumByTestRefactored(List<Integer> nums, Predicate<Integer> selector){
        return nums.stream().filter(selector).mapToInt(Integer::intValue).sum();
    }
    public static void main(String[] args) {
        List<Integer> xxx=new ArrayList<>();
        xxx.add(1);
        xxx.add(2);
        xxx.add(3);
        xxx.add(4);
        xxx.add(5);
        // xxx.forEach(number -> System.out.print(number+" "));
        // System.out.println();
        // xxx.stream().mapToInt(Integer::intValue).forEach(number -> System.out.print(number+" "));
        // System.out.println();
        // xxx.stream().mapToInt(Integer::intValue).forEach(System.out::print);
        // System.out.println();
        // System.out.println(sumByTest(xxx, (x)->true));
        // System.out.println(sumByTest(List.of(1,2,3,4,5), (x)-> x % 2 ==0));
        // System.out.println(sumByTest(List.of(1,2,3,4,5), (x)-> x % 2 != 0));
        // System.out.println(sumByTestRefactored(xxx,(x)->true));
        // System.out.println(sumByTestRefactored(xxx, (x)-> x%2==0));
        // System.out.println(sumByTestRefactored(xxx, (x)-> x%2!=0));


//getting help from xxx3.java class
        System.out.println(sumByTest(List.of(1,2,3,4,5), xxx3::passAll));
        System.out.println(sumByTest(List.of(1,2,3,4,5), xxx3::isEven));
        System.out.println(sumByTest(List.of(1,2,3,4,5), xxx3::isOdd));
        System.out.println(sumByTest(List.of(1,2,3,4,5), xxx3::isPrime));
    }
}
