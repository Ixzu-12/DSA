import java.util.List;
import java.util.ArrayList;
class ProductOfNumbers {
    List<Integer> list;
    int n;

    public ProductOfNumbers() {
        list=new ArrayList<>();
        n=0;
        
    }
    
    public void add(int num) {
        // list.add(num);
        if(num==0){
            list.clear();
            n=0;
        }
        else{
          if(!list.isEmpty()){
            list.add(num*list.get(n-1));
        }
          else{
            list.add(num);
          }
          n++;
        }
    }
    
    public int getProduct(int k) {
        int product=1;
        int n=list.size();
        // for(int i=n-k;i<n;i++){
        //     product*=list.get(i);
        // }
        // return product;
        if(k>n){
            return 0;
        }
        else if(n==k){
            return list.get(n-1);
        }
        return list.get(n-1)/list.get(n-k-1);


        
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */