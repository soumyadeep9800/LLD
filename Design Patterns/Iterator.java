//7 Iterator Design Pattern-behavioral patterns.
/*
Iterator Pattern provides a standard way to traverse a collection of objects
without exposing the underlying structure of the collection.
👉 You don’t need to know how the collection stores elements (array, linked list, tree, graph, etc.)
👉 You only need to use the iterator to move through items.
*/
/*
1) Create Iterator Interface
public interface Iterator<T> {
    boolean hasNext();
    T next();
}
2)Create Container Interface
public interface Container<T> {
    Iterator<T> createIterator();
}
3)Concrete Collection → NameCollection
public class NameCollection implements Container<String> {
    private String[] names = {"Soumyadeep", "Rahul", "Arjun", "Rohit"};
    
    @Override
    public Iterator<String> createIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator<String> {
        private int index = 0;
        @Override
        public boolean hasNext() {
            return index < names.length;
        }
        @Override
        public String next() {
            if (hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
Client Code (Main)
    NameCollection collection = new NameCollection();
    Iterator<String> iterator = collection.createIterator();
    while (iterator.hasNext()) {
        System.out.println(iterator.next());
    }
*/
