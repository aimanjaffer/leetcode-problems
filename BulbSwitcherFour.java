class BulbSwitcherFour{
    public int minFlips(String target) {
        int res = 0;
// since all bulbs start in off state
// keeping track of how many times the bulb has been switched (as a result of switching a previous bulb) tells us whether it is on or off
// now that we know whether it is on/off we just need to compare it with the target bulb at that position
// if its not the same we need to switch again
        for(int i=0;i<target.length();i++){
            if((target.charAt(i) == '1' && (res%2==0)) 
               || (target.charAt(i) == '0' && (res%2==1))){
                res++;
            }
            
        }
        return res;
    }
}