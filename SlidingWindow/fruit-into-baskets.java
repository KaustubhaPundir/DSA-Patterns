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
