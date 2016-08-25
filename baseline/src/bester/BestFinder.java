package bester;

public class BestFinder<T>{
    public Comparable findTheBestOne(T[] items) {
        if(items == null) return null;

        Comparable best = ((Comparable)items[0]);
        for(int i = 0; i < items.length; i++){
            if(!best.better((Comparable) items[i])){
                best = (Comparable) items[i];
            }
        }
        return best;
    }
}
