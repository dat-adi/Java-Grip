public class BitCounting {
	public static int countBits(int n){
        String binarybois = Integer.toBinaryString(n);
        int count = 0;
        for(int i=0; i< binarybois.length(); i++){
            if(binarybois.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args){
        System.out.println(countBits(23));
    }
}
