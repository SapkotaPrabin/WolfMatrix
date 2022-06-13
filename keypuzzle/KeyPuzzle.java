package keypuzzle;

public class KeyPuzzle {

   static int r[] = new int[3];

    public void result(int num, int index) {
        r[index] = num;        
    }

    public static void main(String[] args) {
        int a[] = {6, 8, 2};
        int b[] = {6, 1, 4};
        int c[] = {2, 0, 6};
        int d[] = {7, 3, 8};
        int e[] = {3, 8, 0};

        for (int num : a) {
            for (int i = 0; i < 3; i++) {
                if (b[i] == num) {
                    for (int num2 : c) {
                        for (int j = 0; j < 3; j++) {
                            if (c[j] == num) {
                                c[j] = -1;
                            }
                        }
                    }
                    for (int num2 : e) {
                        for (int j = 0; j < 3; j++) {
                            if (e[j] == num) {
                                e[j] = -1;
                            }
                        }
                    }
                    a[i] = -1;
                    b[i] = -1;
                    e[i] = -1;
                }
                if (e[i] == num) {
                    e[i] = -1;
                }
            }
        }
        for (int num : d) {
            for (int i = 0; i < 3; i++) {
                if (a[i] == num) {
                    a[i] = -1;
                }
                if (b[i] == num) {
                    b[i] = -1;
                }
                if (c[i] == num) {
                    c[i] = -1;
                }
                if (e[i] == num) {
                    e[i] = -1;
                }
            }

        }
        for (int i = 0; i < 3; i++) {
            for (int num : a) {
                System.out.print(num + "\t");
            }
            System.out.print("\n");
            for (int num : b) {
                System.out.print(num + "\t");
            }
            System.out.print("\n");
            for (int num : c) {
                System.out.print(num + "\t");
            }
            System.out.print("\n");
            for (int num : e) {
                System.out.print(num + "\t");
            }
            System.out.print("\n");
        }
//        KeyPuzzle kp = new KeyPuzzle();
//        kp.result(a[2], 2);
//        kp.result(b[2], 1);
//        kp.result(c[1], 0);
//        
//        for (int k = 0; k < 3; k++) {
//            System.out.print(r[k]+"\t");
//        }
    }        
 
}
