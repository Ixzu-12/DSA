class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long individual=(long) cost1 *(long) need1+(long) cost2*(long)  need2;
        long combined=(long) Math.max(need1,need2)*costBoth;
         long minimumofneeds=Math.min(need1, need2);

        long combandindi = minimumofneeds*costBoth
               +(long)(need1-minimumofneeds)*cost1
               +(long)(need2-minimumofneeds)*cost2;


               return Math.min(combandindi,Math.min(individual,combined));

       

        

        
    }
}