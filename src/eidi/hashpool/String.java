package eidi.hashpool;

import eidi.List;

public class String {

    private static final int n = 1024; // willkürlich, man kann auch eine andere Zahl nehmen
    private static final List<String>[] hashSet = new List[n];

    public String intern() {
        int i = (Math.abs(hashCode() % n)); // abs, da hashCode auch negativ sein kann, % n sonst könnte ein index > 1024 rauskommen
        for (List<String> t = hashSet[i]; t != null; t = t.getNext()) {
            if (equals(t.getInfo())) {
                return t.getInfo();
            }
        }
        hashSet[i] = new List<>(this, hashSet[i]);
        return this;
    }

}
