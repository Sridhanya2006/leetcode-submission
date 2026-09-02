class Solution {
    public String compare(String str){
        StringBuilder ans = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(ch != '#'){
                ans.append(ch);
            }
            else if(!ans.isEmpty()){
                ans.deleteCharAt(ans.length()-1);
            }
        }
        return ans.toString();
    }
    public boolean backspaceCompare(String s, String t) {
    return compare(s).equals(compare(t));
    }
}