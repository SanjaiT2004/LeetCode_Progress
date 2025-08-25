class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int rSize = mat.length;
        int cSize = mat[0].length;
        Map<Integer,List<Integer>> map = new HashMap<>();
        int k = 0;
        for(int i=0;i<rSize;i++){
            for(int j=0;j<cSize;j++){
                if(!map.containsKey(i+j)){
                map.put(i+j,new ArrayList<>());
                k++;
            }    map.get(i+j).add(mat[i][j]);
            }
        }
        cSize = rSize * cSize;
        int arr[] = new int[cSize];
        int l = 0;
        for(int i=0;i<k;i++){
            if(i%2 == 0){
                for(int j = map.get(i).size() -1 ;j>=0;j--){
                    arr[l++] = map.get(i).get(j);
                }
            }else{
                rSize = map.get(i).size();
                for(int j=0;j<rSize;j++)
                arr[l++] = map.get(i).get(j);
            }
        }
        
        return arr;
    }
}