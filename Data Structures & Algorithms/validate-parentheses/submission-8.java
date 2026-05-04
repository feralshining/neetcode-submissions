class Solution {
    public boolean isValid(String s) {
        // 1. 여는 괄호만 스택에 넣는다.
        // 2. 닫는 괄호라면, 스택에서 빼낸다.
        // 2-1. 단, pop의 값과 닫는 괄호가 한 쌍이어야 한다.
        Stack<String> stack = new Stack<>();
        try {
            if (s.length() <= 1)
                return false;
            for (int i = 0; i < s.length(); i++) {
                String s1 = s.substring(i, i + 1);

                if (s1.equals("(")) {
                    stack.push(s1);
                } else if (s1.equals(")")) {
                    if (!stack.pop().equals("("))
                        return false;
                }

                if (s1.equals("{"))
                    stack.push(s1);
                else if (s1.equals("}")) {
                    if (!stack.pop().equals("{"))
                        return false;
                }

                if (s1.equals("["))
                    stack.push(s1);
                else if (s1.equals("]")) {
                    if (!stack.pop().equals("["))
                        return false;
                }
            }
            if (stack.size() != 0)
                return false;
        } catch (EmptyStackException e) {
            return false;
        }
        return true;
    }
}
