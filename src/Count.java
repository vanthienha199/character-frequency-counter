public class Count {
    public int count(String string, char letter){
        int count = 0;
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
}
