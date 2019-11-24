package tudelft.ghappy;

public class GHappy {

    public boolean gHappy(String str) {
        assert str!=null;
        boolean isHappy = false;
        for (int i = 1; i<=str.length()-2; i++){
            if(str.charAt(i) == 'g' ){
               if(str.charAt(i-1)=='g' || str.charAt(i+1)=='g'){
                   isHappy = true;
               }
               else{
                   return false;
               }
            }
        }
        if(str.charAt(0) == 'g' && str.charAt(2) != 'g' && isHappy == true) return false;
        if(str.charAt(str.length()-1) == 'g' && str.charAt(str.length()-2) != 'g' && isHappy == true) return false;
        return  isHappy;
    }
}
