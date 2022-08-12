import java.util.*;
class SumOfMultiples {
ArrayList<Integer> m = new ArrayList<Integer>();
    SumOfMultiples(int number, int[] set) {
        for(int i=0; i<set.length; i++){
            for(int j=1; set[i]*j<number; j++){
                if(set[i]==0){
                    break;
                }
                if(m.indexOf(set[i]*j)==-1){
                    m.add(set[i]*j);
                }        
            }
        } 
        

    }

    int getSum() {
        int sum = 0;
        for(int i = 0; i < m.size(); i++)
            sum += m.get(i);
        return sum;

       
     
    }

}
