public class Learn {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = 9;
        int d = 8;

        a++;
        ++b;
        a--;
        --a;
//        System.out.println(max(max(a, b), max(c, d)));

        int[] items = {1, 2, 4, 5, 6, 7, 8};

        int count = 0;
        do {
            System.out.println(items[count++]);
        } while (count < items.length);

        while (count-- > 0) {
            System.out.println(items[count]);
        }
        int e = 1;
        if (e == 1){
            System.out.println();
        }else if(e ==2){

        }else if(e ==3){

        }else if(e ==4){

        }else{

        }


        switch (e){
            case 1:
            case 2:{
                System.out.println(e+2);
                break;
            }
            case 3:{
                break;

            }
            case 4: {

                break;
            }
            default:{

            }
        }
        
    }

    public static int max(int x, int y) {
        return x > y ? x : y;
    }
}
