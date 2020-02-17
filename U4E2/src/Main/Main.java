
package Main;

import Billing.Billing;

public class Main {
    public static void main(String[]args){
        Billing bill = new Billing();
        System.out.println(bill.computeBill((float)10));
        System.out.println(bill.computeBill((float)10,(float)2));
        System.out.println(bill.computeBill((float)10,(float)2,(float)5));
     
    }
}
