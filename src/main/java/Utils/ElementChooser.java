package Utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ElementChooser {

    public static String[] getNElementsWithoutRepetition(String[] elements, int n) {
        String[] response = new String[n];
        List<String> elementList = Arrays.asList(elements);
        Collections.shuffle(elementList);
        for (int i = 0; i < n; i++) {
            response[i] = elementList.get(i);
        }
        return response;
    }
}
