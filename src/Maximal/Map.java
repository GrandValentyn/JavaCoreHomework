package Maximal;

import java.util.*;

public class Map<K, V> {
    private List<MyEntry<K, Set<V>>> map;

    public Map() {
        map = new ArrayList<>();
    }

    public Map(List<MyEntry<K, Set<V>>> map) {
        this.map = map;
    }

    public void addElement(K k, V v) {
        Iterator<MyEntry<K, Set<V>>> iterator = map.iterator();
        boolean haveAlready = false;
        int index = 0;
        while (iterator.hasNext()) {
            MyEntry<K, Set<V>> myEntry = iterator.next();
            if (myEntry.getK().equals(k) || k == myEntry.getK()) {
                haveAlready = true;
                break;
            }
            index++;
        }
        if (haveAlready) {
            Set<V> tepmSet = new HashSet<>();
            tepmSet.add(v);
            map.get(index).getV().clear();
            map.get(index).getV().add(v);
            return;
        }
        if (!haveAlready) {
            Set<V> tepmSet = new HashSet<>();
            tepmSet.add(v);
            map.add(new MyEntry<>(k, tepmSet));
        }
    }


    public void deleteByKey(K k) {
        Iterator<MyEntry<K, Set<V>>> iterator = map.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            MyEntry<K, Set<V>> myEntry = iterator.next();
            if (myEntry.getK().equals(k)) {
                map.remove(index);
                break;
            }
            index++;
        }
    }

    public void deleteByValue(V v) {
        Iterator<MyEntry<K, Set<V>>> iterator = map.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            boolean remove = false;
            MyEntry<K, Set<V>> myEntry = iterator.next();
            for (V value :
                    myEntry.getV()) {
                if (value.equals(v)) {
                    remove = true;
                    break;
                }
            }
            if (remove) {
                iterator.remove();
            }
            index++;
        }
    }

    public void outPutSets() {
        Iterator<MyEntry<K, Set<V>>> iterator = map.iterator();
        while (iterator.hasNext()) {
            MyEntry<K, Set<V>> myEntry = iterator.next();
            System.out.println(Arrays.toString(myEntry.getV().toArray()));
        }
    }

    public void outputKeys() {
        Iterator<MyEntry<K, Set<V>>> iterator = map.iterator();
        while (iterator.hasNext()) {
            MyEntry<K, Set<V>> myEntry = iterator.next();
            System.out.println(myEntry.getK());
        }
    }

    public void showMap() {
        Iterator<MyEntry<K, Set<V>>> iterator = map.iterator();
        while (iterator.hasNext()) {
            MyEntry<K, Set<V>> myEntry = iterator.next();
            System.out.println("Key = " + myEntry.getK());

            System.out.println(myEntry.getV());

        }
    }

    public List<MyEntry<K, Set<V>>> getMap() {
        return map;
    }

    public void setMap(List<MyEntry<K, Set<V>>> map) {
        this.map = map;
    }
}