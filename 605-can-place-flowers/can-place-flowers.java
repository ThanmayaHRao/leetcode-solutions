class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int c =0;
        if(flowerbed == null )return false;
        for(int i =0;i<flowerbed.length;i++){
           if(flowerbed[i] == 0){
            boolean leftEmpty = (i==0) || flowerbed[i-1]==0;
            boolean rightEmpty = (i == flowerbed.length-1 )|| flowerbed[i+1]==0;
             if(leftEmpty && rightEmpty){
             c++;
            flowerbed[i] =1;
           }
           }
          
            if(c >= n)return true;
        }
         return false;
    }
}