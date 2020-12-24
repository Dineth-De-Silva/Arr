import java.util.ArrayList;

public class Arr {
    public static ArrayList toList(Object[] Array) {
        ArrayList<Object> Return = new ArrayList<>();
        for (int i = 0; i < Array.length; i++) {
            Return.add(Array[i]);
        }
        return Return;
    }

    public static Object[] toArray(ArrayList<Object> List) {
        Object[] Return = new Object[List.size()];
        for (int i = 0; i < List.size(); i++) {
            Return[i] = List.get(i);
        }
        return Return;
    }
}