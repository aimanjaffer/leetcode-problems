class ValidPalindrome {
    public boolean isPalindrome(String s) {
    StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
           if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
               sb.append(Character.toUpperCase(s.charAt(i)));
           } 
        }
        String newS = sb.toString();
        int j=0;
        boolean isPal = true;
        while(j < newS.length()/2){
            //System.out.println(newS.charAt(j) +", "+newS.charAt(newS.length()-1-j));
            if(newS.charAt(j) != newS.charAt(newS.length()-1-j)){
                isPal = false;
                break;
            }
            j++;
        }
        return isPal;
}
}