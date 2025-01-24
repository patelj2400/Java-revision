package String;

public class StringMethods {
    public static void main(String[] args) {


        String name = "    Jay Patel2624   ";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());

        System.out.println("Pen".startsWith("P"));
        System.out.println("Pen".startsWith("N"));

        System.out.println("Pen".endsWith("en"));
        System.out.println("Pen".endsWith("N"));


        System.out.println("Pen".equals("Pen"));
        System.out.println("Pen".equalsIgnoreCase("pen"));

        System.out.println("Pen".charAt(2));

        int age = 18;
        System.out.println(age+2);
        String strage = String.valueOf(age);
        System.out.println(strage+2);

        String set= "I love the Java and, Java is good programming!";
        String newset = set.replace("Java","Python");

        System.out.println(set);
        System.out.println(newset);

        System.out.println(set.contains("Java"));
        System.out.println(set.contains("Python"));

        // Being number is inclusive so it included
        // Last number is exclusive so it can't be included
        String substring = set.substring(2,5);
        System.out.println(substring);
        System.out.println(set.substring(2));


        String words[] = set.split(",");
        for (String word : words) {
            System.out.println(word);
        }


        String color = "red";
        char letters[] = color.toCharArray();
        for (char letter : letters) {
            System.out.println(letter);
        }


        String animal = "";
        if(animal.isEmpty())
        {
            System.out.println("String is empty");
        } else if (animal.isBlank()) {
            System.out.println("String is blank");
        } else {
            System.out.println("String is not empty");
        }

    }
}