import java.util.ArrayList;
import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        //Creating a normal array
        String[] array = {"Hello", "Dineth"};
        //Converting normal array to arraylist by toList() method in Arr library
        ArrayList arrayList = Arr.toList(array);
        //Printing arraylist by converting it to a normal array again by toArray() method in Arr library
        System.out.println(Arrays.toString(Arr.toArray(arrayList)));
    }
}
