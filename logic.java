public class logic{
public static void main(String[] args) {
String[] messages = {
    "ERROR: file missing",
    "INFO: starting",
    "ERROR: network failed",
    "INFO: finished"
};

int errorCount = 0;
int infoCount = 0;
for(int i =0; i<=messages.length-1;i++){
        StringBuilder s = new StringBuilder();
         if(s.charAt(0)=='E'){
        errorCount++; 
         }else{
        infoCount++;
    }
}
System.out.println(errorCount);
System.out.println(infoCount);
}
}
