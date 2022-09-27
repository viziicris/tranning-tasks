public class NrOfWords {

    public static void main(String[] args) {
        String a1 = "hello for this world and hello my love hello for hello";
        String a2 = "hello";
        String a3 = "for";
        String a4 = "love";
        System.out.println(numberof(a1,a2) );
        System.out.println(numberof(a1,a3) );
        System.out.println(numberof(a1,a4) );

    }


    public static int numberof (String s1, String s2) {
        int numberof = 0;
        String[] bits = s1.split(" ");
        for (int i = 0; i < bits.length; i++) {
            if (bits[i].equals(s2)) {
                numberof += 1;
            } else {
                numberof += 0;
            }
        }
        return numberof;
    }
}



