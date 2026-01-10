// class Solution { //valid for some input sets
//     public int totalFruit(int[] fruits) {
//         HashMap <Integer,Integer> map= new HashMap<>();
//         int max=0;
//         int res=0;
//         int key=0;
//         for(int i=0;i<fruits.length;i++){
//             map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
//         }
//         for(Map.Entry<Integer,Integer> mapElement : map.entrySet()){
//             int value=mapElement.getValue();

//             if(max<value){
//                 max=value;
//                 key=mapElement.getKey();
//             }
//         }
//         map.remove(key);
//         res=res+max;
//         max=0;
//         for(Map.Entry<Integer,Integer> mapElement : map.entrySet()){
//             int value=mapElement.getValue();

//             if(max<value){
//                 max=value;
//             }
//         }
//         return res+max;

//     }
// }
class Solution {
    public int totalFruit(int[] fruits) {
        HashMap <Integer,Integer> map= new HashMap<>();
        int max=-1;
        int low=0;
        for(int high=0;high<fruits.length;high++){
            map.put(fruits[high],map.getOrDefault(fruits[high],0)+1);
            while(map.size()>2){
                map.put(fruits[low],map.get(fruits[low])-1);
                if(map.get(fruits[low])==0){
                    map.remove(fruits[low]);
                }
                low++;
            }
            max=Math.max(max,high-low+1);
        }
        return max;

    }
}
