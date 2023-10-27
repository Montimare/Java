package ab2;

public class A2 {

    public enum Compass {
        NORTH (0),
        EAST (90),
        SOUTH (180),
        WEST (270);

        private int degree;

        Compass(int degree){
            this.degree = degree;
        }

        public int getDegree() {
            return degree;
        }
    }

    public static void main(String[] args) {
        int value = 3;
        switch (value) {
            case 0:
                
                break;
        
            default:
                break;
        }
        Compass a = Compass.NORTH;

        System.out.println(a.getDegree());
        // for (int i = 0; i < 1000; i += 50) {
        //     System.out.println(i);
        // }

        // for (int i = 0; i < 999; i++) {
        //     if (i % 50 == 0) {
        //         System.out.println(i);
        //     }
        // }

        // int i = 0;
        // while (i < 1000) {
        //     if (i % 50 == 0){
        //         System.out.println(i);
        //     }
        //     i++;
        // }
        
        // int i = 0;
        // do {
        //     if (i % 50 == 0){
        //         System.out.println(i);
        //     }
        //     i++;
        // } while (i < 1000);
        
            
    }
}
