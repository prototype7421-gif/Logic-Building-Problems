public class strHash{
    public static void main(String args[]){
        String s = "aayush";
        int hash[] = new int[26];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-'a']++;
            System.out.println(hash[s.charAt(i)-'a']);
        }
            }
    }