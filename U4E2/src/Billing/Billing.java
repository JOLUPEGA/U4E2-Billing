
package Billing;

public class Billing {
    public Float computeBill(Float price){
        Float deuda;
        deuda = price;
        price = price/(float)100;
        price = price*(float)8;
        deuda = deuda + price;
        return deuda;
    }

    public Float computeBill(Float price, Float cantidad){
        Float deuda,dos;
        dos = price*cantidad;
        deuda = dos;
        dos = dos/(float)100;
        dos = dos*(float)8;
        deuda = deuda + dos;
        return deuda;
    }

    public Float computeBill(Float price, Float cantidad, Float cupon){
        Float deuda,dos;
        dos = price*cantidad;
        deuda = dos;
        dos = dos/(float)100;
        dos = dos*(float)8;
        deuda = deuda + dos;
        deuda = deuda - cupon;
        return deuda;
    }                                                                                       
}
