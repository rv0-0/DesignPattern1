package ObserverDesignPattern.Observable;
import ObserverDesignPattern.Observer.NotificationAlertObserver;

public interface StockObservable {

    public void add(NotificationAlertObserver observer);
    public void remove (NotificationAlertObserver removeNotificationAlertObserver);
    public void notifySubscriber();
    public void setStockCount(int newStockCount);
    public int getStockCount();

    
}
