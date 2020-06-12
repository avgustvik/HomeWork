package com.gmail.vik.avgust;

public class Phone {

    private String phoneProducer;
    private String modelPhone;
    private String colorPhone;
    private int pricePhone;
    private int screenSizePhone;

    public String getPhoneProducer() {
        return phoneProducer;
    }

public int getPricePhone() {
return pricePhone;
}

public Phone () {
}

public Phone (String phoneProducer, String modelPhone, String colorPhone, int pricePhone, int screenSizePhone) {
    this.phoneProducer = phoneProducer;
    this.modelPhone = modelPhone;
    this.colorPhone = colorPhone;
    this.pricePhone = pricePhone;
    this.screenSizePhone = screenSizePhone;
}

 public String toString ()  {
 return "This Phone Producer is "+
this.phoneProducer + ", " + "Price in UAH is " +
         this.pricePhone ;


 }



}


