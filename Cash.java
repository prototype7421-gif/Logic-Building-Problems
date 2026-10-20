

class payment{
void pay(double amount){
  System.out.println("the total payment is "+ amount );
}
}
class UPIpayment extends payment{
void pay(double amount){
System.out.println("PAID using UPI" + amount);
}
}
class cardpayment extends payment{
void pay(double amount){

System.out.println("PAID usinG CARD" + amount);
}
}
public class Cash{
    public static void main(String[] args) {
        
        payment obj = new payment();
        obj.pay(1500);
    UPIpayment obj1 = new UPIpayment();
    obj1.pay(500);
    cardpayment obj2 = new cardpayment();
    obj2.pay(1000);
    }
}
