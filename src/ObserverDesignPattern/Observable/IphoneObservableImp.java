package ObserverDesignPattern.Observable;

import java.util.ArrayList;
import java.util.List;

import ObserverDesignPattern.Observer.NotificationAlertObserver;

public class IphoneObservableImp implements StockObservable
{
    public int stockCount = 0;
    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    @Override
    public void add(NotificationAlertObserver observer)
    {
        observerList.add(observer);

    }
    @Override
    public void remove (NotificationAlertObserver observer)
    {
        observerList.remove(observer);

    }
    @Override
    public void notifySubscriber()
    {
        for(NotificationAlertObserver observer: observerList)
        {
            observer.update();
        }

    }
    @Override
    public void setStockCount(int newStockCount)
    {
        if(stockCount == 0 )
        {
            notifySubscriber();
        }
        stockCount += newStockCount;

    }
    @Override
    public int getStockCount()
    {
        return stockCount;
    }
}
