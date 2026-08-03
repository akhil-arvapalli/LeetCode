class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        char[] par = new char[s.length()];
        int top = -1;
        for (char c : s.toCharArray()) {
            if(c == '{'){
                par[++top] = '}';
            }else if(c == '['){
                par[++top] = ']';
            }else if(c == '('){
                par[++top] = ')';
            }else if(top == -1 || par[top--] != c){
                return false;
            }
        }
        return top == -1;
    }
}