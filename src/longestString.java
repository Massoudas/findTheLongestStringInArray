public class longestString {

    public static String longString(String[] strArray){
        int len=0;
        int element=0;
        String longestStr="";

        for (int i=0; i< strArray.length; i++){
            if(strArray[i].length()>len){
                element=i;
                longestStr=strArray[i];
            }
        }
        System.out.println("The string: " +longestStr+ " at position: "+element +" is the longest string in the array" );
        return longestStr;
    }
    public static String longestWord(String sentences){
        String[] str = sentences.split("\\s+");
        return longString(str);
    }

    public static void main(String[] args) {
        System.out.println(longestWord("Can you reuse the first method in the second method?"));

    }
}
