package ObserverDesignPattern;
import ObserverDesignPattern.Observable.IphoneObservableImp;
import ObserverDesignPattern.Observable.StockObservable;
import ObserverDesignPattern.Observer.EmailAlertOberserImp;
import ObserverDesignPattern.Observer.MobileAlertOberserImp;
import ObserverDesignPattern.Observer.NotificationAlertObserver;

public class App {
    public static void main(String[] args) throws Exception {
        StockObservable iphonObservable  = new IphoneObservableImp();

        NotificationAlertObserver observer1 = new EmailAlertOberserImp("xyz@gamil.com", iphonObservable);
        NotificationAlertObserver observer2 = new EmailAlertOberserImp("kaka@gamil.com", iphonObservable);
        NotificationAlertObserver observer3 = new MobileAlertOberserImp("8981119170", iphonObservable);
        iphonObservable.add(observer1);
        iphonObservable.add(observer2);
        iphonObservable.add(observer3);

        iphonObservable.setStockCount(10);

    }
}
