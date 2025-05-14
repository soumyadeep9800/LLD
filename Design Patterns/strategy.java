/*6(imp)
Strategy Design Pattern is a behavioral design pattern that defines a family of algorithms,
encapsulates each one, and makes them interchangeable. The strategy lets the algorithm vary independently
from the clients that use it.


public interface SortStrategy {
    void sort(int[] arr);
}
public class BubbleSort implements SortStrategy {
    void sort(int[] arr);
}
public class QuickSort implements SortStrategy {
    void sort(int[] arr);
}
public class SortContext {
    private SortStrategy strategy;
    public SortContext(SortStrategy strategy) {
        this.strategy = strategy;
    }
    public void applySort(int[] arr) {
        strategy.sort(arr);
    }
}

 */
