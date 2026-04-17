class Solution {
    public boolean backspaceCompare(String s, String t) {
        char[] stack1 = new char[s.length()];
        int top1 = -1;
        //for s
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != '#') {
                stack1[++top1] = ch;
            } else if (top1 != -1) {
                top1--;
            }
        }

        //for t
        char[] stack2 = new char[t.length()];
        int top2 = -1;

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if (ch != '#') {
                stack2[++top2] = ch;
            } else if (top2 != -1) {
                top2--;
            }
        }

        String str1 = new String(stack1, 0, top1 + 1);
        String str2 = new String(stack2, 0, top2 + 1);

        if (str1.equals(str2)) {
            return true;
        } else {
            return false;
        }
    }
}