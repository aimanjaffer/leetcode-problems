class DetectCapital {
    public boolean detectCapitalUse(String word) {
    return isAllCaps(word) || isAllLower(word) || isOnlyFirstLetterCap(word);    
    }
    
    
    public boolean isAllCaps(String word){
        boolean isAllCaps=true;
        for(int i=0;i<word.length();i++){
            if(Character.isLowerCase(word.charAt(i))){
                isAllCaps=false;
                break;
            }
        }
        return isAllCaps;
    }
    public boolean isAllLower(String word){
        boolean isAllLower=true;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                isAllLower=false;
                break;
            }
        }
        return isAllLower;
    }
    public boolean isOnlyFirstLetterCap(String word){
        boolean firstLetterCap = Character.isUpperCase(word.charAt(0));
        boolean result = firstLetterCap;
        if(firstLetterCap){
            for(int i=1;i<word.length();i++){
                if(Character.isUpperCase(word.charAt(i))){
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}