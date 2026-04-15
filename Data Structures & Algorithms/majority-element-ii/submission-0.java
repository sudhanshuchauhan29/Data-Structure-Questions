class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int el1 = 0,el2 = 0;
        int c1 = 0,c2=0;
        for(int num:nums){
            if(c1==0  && el2!=num){
                el1 = num;
                c1 = 1;
            }
            else if(el1!=num && c2==0){
                el2 = num;
                c2 = 1;
            }
            else if(num==el1){
                c1++;
            }
            else if(num==el2){
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }
        List<Integer>list = new ArrayList<>();
         c1 = 0;
         c2 = 0;
         if(el1==el2) {
            list.add(0);
            return list;
         } 
        for(int num:nums){
            if(num==el1){
                c1++;
            }
            if(num==el2){
                c2++;
            }
        }
        
        if(c1>=(nums.length/3 + 1)) list.add(el1);
        if(c2>=(nums.length/3 + 1)) list.add(el2);
        return list;
    }
}