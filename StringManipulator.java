public class StringManipulator {
    public String trimAndConcat(String str1, String str2){
        String result = str1.trim() + str2.trim();
        return result;
    }

    public Integer getIndexOrNull(String str1, char letter){
        Integer result = str1.indexOf(letter);
        if(result==-1) {
            return null;
        }
        return result;
    }

    public Integer getIndexOrNull(String str1, String str2) {
        Integer result = str1.indexOf(str2);
        if(result==-1) {
            return null;
        }
        return result;
    }

    public String concatSubstring(String str1, int num1, int num2, String str2) {
        String result = str1.substring(num1, num2) + str2;
        return result;
    }
}