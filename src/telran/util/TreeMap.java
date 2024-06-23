package telran.util;

import java.util.Comparator;

public class TreeMap<K, V> extends AbstractMap<K, V> implements SortedMap<K, V> {

	@Override
	public K firstKey() {
		Entry<K, V> entry = ((TreeSet<Entry<K, V>>) set).first();
		return entry == null ? null : entry.getKey();
	}

	@Override
	public K lastKey() {
		Entry<K, V> entry = ((TreeSet<Entry<K, V>>) set).last();
		return entry == null ? null : entry.getKey();
	}

	@Override
	public K floorKey(K key) {
        K result = null;
        Entry<K, V> pattern = new Entry<>(key, null);
        Entry<K, V> floorEntry = ((TreeSet<Entry<K, V>>) set).floor(pattern);
        if (floorEntry != null) {
            result = floorEntry.getKey();
        }
        return result;
	}

	@Override
	public K ceilingKey(K key) {
        K result = null;
        Entry<K, V> pattern = new Entry<>(key, null);
        Entry<K, V> ceilingEntry = ((TreeSet<Entry<K, V>>) set).ceiling(pattern);
        if (ceilingEntry != null) {
            result = ceilingEntry.getKey();
        }
        return result;
	}

	@Override
	protected Set<K> getEmptyKeySet() {
		
		return new TreeSet<K>();
	}
	public TreeMap() {
		set = new TreeSet<>();
	}
	public TreeMap(Comparator<Entry<K, V>> comp) {
		set = new TreeSet<>(comp);
	}

}

