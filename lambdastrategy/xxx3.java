
public class xxx3 {
    public static boolean passAll(int x){
        return true;
    }
    public static boolean isEven(int x){
        return x%2==0;
    }
    public static boolean isOdd(int x){
        return !isEven(x);
    }
    public static boolean isPrime(int x){
        if(x==2) return true;
        if(x<=1) return false;
        if (x % 2 == 0) return false;
        for(int i=3; i*i <= x; i+=2){
            if(x%i ==0) return false;
        }
        return true;
    }
    public static boolean isPerfectSquare(int x) {
        if(x <= 1) return true;
        int lo = 1, hi = x;
        while(lo <= hi) {
            int mid = lo + (hi-lo)/2;
            int midSquare = mid*mid;
            if(midSquare == x) return true;
            if(midSquare < x) {
                lo = mid+1;
            } else {
                hi = mid-1;
            }
        }
        return false;
    }

    public static boolean isFibonacci(int x) {
        if(x<=1) return  true;
        return isPerfectSquare(5*x*x+4) || isPerfectSquare(5*x*x-4);
    }

    public static boolean isFiboAndOdd(int x) {
        return isFibonacci(x) && isOdd(x);
    }
}



class StatData{
    private int avg;
    private int median;
    private int min;
    private int max;

    public StatData(int avg,int median,int min,int max){
        this.avg=avg;
        this.median=median;
        this.min=min;
        this.max=max;
    }

    public int getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }

    public int getMedian() {
        return median;
    }

    public void setMedian(int median) {
        this.median = median;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + avg;
        result = prime * result + median;
        result = prime * result + min;
        result = prime * result + max;
        return result;
        // return Objects.hash(avg,median,min,max);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        StatData other = (StatData) obj;
        if (avg != other.avg)
            return false;
        if (median != other.median)
            return false;
        if (min != other.min)
            return false;
        if (max != other.max)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "StatData [avg=" + avg + ", median=" + median + ", min=" + min + ", max=" + max + "]";
    }
}

// public record StatData(int avg,int median,int min,int max);
// public StatData calculateStatistics(int arr[]){
// }