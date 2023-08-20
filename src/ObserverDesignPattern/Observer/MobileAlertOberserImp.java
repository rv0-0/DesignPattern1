package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StockObservable;

public class MobileAlertOberserImp implements NotificationAlertObserver
{
    String number;
    StockObservable observable;
    public MobileAlertOberserImp(String number, StockObservable observable)
    {
        this.number = number;
        this.observable = observable;
    }
    
    @Override
    public void update()
    {
        sendMail(number, "Product is instock");

    }

    private void sendMail(String number, String msg)
    {
        System.out.println("Message sent to "+ number);
    }
    
}
