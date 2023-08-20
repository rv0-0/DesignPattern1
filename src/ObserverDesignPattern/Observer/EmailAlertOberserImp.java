package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StockObservable;

public class EmailAlertOberserImp implements NotificationAlertObserver
{
    String emailId;
    StockObservable observable;
    public EmailAlertOberserImp(String emailId, StockObservable observable)
    {
        this.emailId = emailId;
        this.observable = observable;
    }
    
    @Override
    public void update()
    {
        sendMail(emailId, "Product is instock");

    }

    private void sendMail(String emailId, String msg)
    {
        System.out.println("Mail sent to "+ emailId);
    }
    
}
