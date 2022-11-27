import java.util.*;

public class Counter {
    public static List<String> count(String[] words)
    {
        Set<String> targetSet = new HashSet<>(Arrays.asList(words));
        Map<String,Integer> dict = new HashMap<String,Integer>();
        List<Integer> new_list= new ArrayList<>();
        for(String elem : targetSet)
        {
            dict.put(elem, Collections.frequency(Arrays.asList(words),elem));
            new_list.add(Collections.frequency(Arrays.asList(words),elem));
        }
        Collections.sort(new_list, Collections.reverseOrder());
        List<String> listx = new ArrayList<>();
        for(Integer elem : new_list) {
            for(Map.Entry<String,Integer> elemx: dict.entrySet())
            {
                if(elemx.getValue()==elem)
                {
                    listx.add(elemx.getKey());
                }
            }
        }
        return listx;
    }
    public static void main(String[] args)
    {
        System.out.println(count(new String[]{"Ania","Ania","Wojtek", "Mirek", "Mirek", "Mirek"}));
    }
}
