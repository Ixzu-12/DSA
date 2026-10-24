class Solution {
    public int finddays(String date,int totaldays[]){
            int month=Integer.parseInt(date.substring(0,2));
            int day=Integer.parseInt(date.substring(3));

            return totaldays[month-1]+day;
        }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        
        int monts[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int totaldays[]=new int[13];
        totaldays[1]=31;
        for(int i=2;i<13;i++){
            totaldays[i]=totaldays[i-1]+monts[i-1];

        }
        int arrivealice=finddays(arriveAlice,totaldays);
        int leavealice=finddays(leaveAlice,totaldays);
        int arrivebob=finddays(arriveBob,totaldays);
        int leavebob=finddays(leaveBob,totaldays);
        int overlap=Math.min(leavealice,leavebob)-Math.max(arrivealice,arrivebob)+1;
        return overlap <0 ? 0:overlap;
    
        
        
        
        
        
    }
}