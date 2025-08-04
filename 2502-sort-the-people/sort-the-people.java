class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();
        String[] result  = new String[names.length];
        for(int i =0; i<heights.length; i++){
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        for (int i = 0; i < heights.length; i++) {
            result[i] = map.get(heights[heights.length - 1 - i]);
        }
        return result;
    }
}