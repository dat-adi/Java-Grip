package Pattern;

class Triangle {
    public static void main(String[] args){
        int lim = 5;
        int sec_lim = (lim-1)/2;
        for(int i = 0; i <= lim; i += 2){
            for(int j = 0; j <= sec_lim; j++)
                System.out.print(" ");
            for(int k = 0; k <= i; k += 2)
                System.out.print("*");
            System.out.println();
            sec_lim--;
        }
    }
}
