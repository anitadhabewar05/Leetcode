class Solution {
    public boolean backspaceCompare(String s, String t) {
        String str1 = process(s);
        String str2 = process(t);

        return str1.equals(str2);
    }

    public String process(String str) {
        char[] stack = new char[str.length()];
        int top = -1;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != '#') {
                top++;
                stack[top] = ch;   // push
            } else {
                if (top != -1) {
                    top--;         // pop
                }
            }
        }

        return new String(stack, 0, top + 1);
    }
}