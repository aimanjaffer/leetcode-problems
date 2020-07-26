class ShuffleString{
    public String restoreString(String s, int[] arr) {
    
        char[] charArray = new char[s.length()];
        for(int i=0;i<arr.length;i++){
            int x = arr[i];
            charArray[x] = s.charAt(i);
        } 
        String str = new String(charArray);
        return str;
    }
}