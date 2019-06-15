public class StringManipulator {

    public String trimAndConcat(String first, String second){
        return first.trim()+second.trim();
    }
    public int getIndexOrNull(String stringvalue, char findchar){
        return stringvalue.indexOf(findchar);
    }
    public int getIndexOrNull(String stringvalue, String findstring){
        return stringvalue.indexOf(findstring);
    }
    String concatSubstring(String firststring, int start, int end, String secondstring) {
        return firststring.substring(start,end)+secondstring;
    }
}