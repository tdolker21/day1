import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // followings are the data types;
        // Int, Long, eg: 1, 1000, 3450
        // Double,  Float, eg: 1.25, 3.56, 99.99
        // Boolean eg: True, False
        // String, eg: "Tashi," "Tendol", "Bikram","123","123.45","TRUE","False"

        double a = 10.5;
        double b = 15.5;
        double result = a/b;
        System.out.println(result);

        boolean c= true;
        c= false;
        System.out.println(c);
        String name= "Tenzin";
        //String name1= "Tashi";

        List<String> names= new ArrayList<>();
        names.add("Tashi");
        names.add("Tenzin");
        names.add("Bikram");


        System.out.println(names);

        String firstName= "Bikram";
        String lastName= "Dolker";
        System.out.println("my name is "+ firstName+ " "+lastName+".");


        import java.util.ArrayList;
        import java.util.ArrayList;
        import java.util.List;
        import java.util.Map;
        import java.util.stream.Collectors;

        public class GroupingMap {
            public static void main(String[] args) {
                List<Fruits> fruitLists= Arrays.asList(new Fruits("apple", "fruits"), new Fruits("orange", "fruits")
                        new Fruits( "carrots", "vegetable"), new Fruits(" broccoli", "vegetable"),new Fruits("carrots","vegetables"),
                new Fruits("broccoli", "vegetable"));

                //Map<String, Long> map = fruitList.stream().collect(Collectors.groupingBy(Fruits::getName, Collectors.counting()));
                fruitLists.stream().filter(f-> f.getCategory().equals("vegetable")).ForEach(fr->{});
                // System.out.println(map);

            }
        }

    }}


