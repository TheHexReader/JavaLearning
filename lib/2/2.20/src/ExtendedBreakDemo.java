public class ExtendedBreakDemo {
    public static void main(String[] args){
        for (int i = 1; i < 4; i++){
            Block1: {
                Block2: {
                    Block3: {
                        System.out.println("\ni равно " + i);
                        if (i == 1) break Block1;
                        if (i == 2) break Block2;
                        if (i == 3) break Block3;

                        System.out.println("Эта строка никогда не будет напечатана");
                    }
                }
            }
        }
    }
}
