import java.util.Arrays;

/**
 * Created by Hemant on 29-09-2016.
 */
public class MaxLength_Chain_of_Pairs {
    static class pair implements Comparable<pair>{
        int l;
        int r;
        public pair(int i,int j){
            this.l = i;
            this.r = j;
        }
        public int compareTo(pair o) {
            return this.l-o.l;
        }
    }

    public static void main(String[] args){
        pair[] pair1 = new pair[5];
        pair1[0] = new pair(5,24);
        pair1[1] = new pair(39,60);
        pair1[2] = new pair(15,28);
        pair1[3] = new pair(50,90);
        pair1[4] = new pair(27,40);

        int result = maxLCP(pair1);
        System.out.println("Length of maximum size chain is "+result);
    }
    static int maxLCP(pair[] p){
        Arrays.sort(p);
        int length[] = new int[p.length];
        for(int i=0;i<p.length;i++){
            length[i] = 1;
        }
        for(int i=1;i<p.length;i++){
            for(int j=0;j<i;j++){
                if(p[j].r < p[i].l && length[i] < length[j]+1){
                    length[i] = length[j] + 1;
                }
            }
        }
        int maxLength = 0;
        for(int i=0;i<p.length;i++){
            maxLength = Math.max(maxLength,length[i]);
        }
        return maxLength;
    }

}
