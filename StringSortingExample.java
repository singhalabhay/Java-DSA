public class StringSortingExample {
    public static void main(String[] args) {
        String[] name = {"abhay", "prachi", "soniya", "Moye", "Jogi"};
        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < name.length - 1; j++) { // Fixed the variable from i to j
                if (name[j].compareTo(name[j + 1]) > 0) {
                    String temp = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
    }
}
