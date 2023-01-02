import java.util.ArrayList;
import java.util.List;

/**
 * Question Link:
 * https://leetcode.com/problems/combination-sum-iii/description/
 */

public class MicroSoft_2 {


        public List<List<Integer>> combinationSum3(int k, int n) {
            List<List<Integer>> res = new ArrayList<>();
            sol(1,9,n,new ArrayList(),res,k);
            return res;
        }

        public void sol(int start,int end, int sum,List<Integer> cur, List<List<Integer>> res,int k){

            if(sum==0 && k==cur.size()){
                res.add(new ArrayList(cur));
                return;
            }
            for(int i=start;i<=end;i++){
                cur.add(i);
                sol(i+1,end,sum-i,cur,res,k);
                cur.remove(cur.size()-1);
            }
        }


}
