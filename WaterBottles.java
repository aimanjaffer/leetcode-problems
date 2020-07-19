class WaterBottles{
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrank = 0;
        int totalEmpty = 0;
        while(numBottles > 0){
            totalDrank++;
            numBottles--;
            totalEmpty++;
            if(numBottles==0){
                numBottles = totalEmpty / numExchange;
                totalEmpty = totalEmpty % numExchange;
            }
        }
        return totalDrank;
    }
}