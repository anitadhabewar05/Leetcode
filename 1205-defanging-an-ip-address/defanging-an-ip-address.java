class Solution {
    public String defangIPaddr(String address) {
        char[] arr = address.toCharArray();
        
        // Step 1: count dots
        int dots = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == '.') {
                dots++;
            }
        }
        
        // Step 2: create new array
        char[] result = new char[arr.length + 2 * dots];
        
        // Step 3: fill new array
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == '.') {
                result[j++] = '[';
                result[j++] = '.';
                result[j++] = ']';
            } else {
                result[j++] = arr[i];
            }
        }
        
        return new String(result);
    }
}