import java.util.ArrayList;
import java.util.List;

public class View implements Observer {

    private List<Observer> controllerList = new ArrayList<>();


    public View(){

    }

    /**
     * Outputs a number on the console
     * @param pNumber number to be outputted on the console
     */
    @Override
    public void update(int pNumber){
        System.out.println("Number: " + pNumber);
    }


    /**
     * Register a controller as observer
     * @param pObserver Controller to be addded as observer
     */
    public void registerObserver(Observer pObserver){
        this.controllerList.add(pObserver);
    }

    /**
     * Unregister a controller from the observer
     * @param pObserver Observer to be unregistered
     */

    public void unregisterObserver(Observer pObserver){
        this.controllerList.remove(pObserver);
    }

    /**
     * Notify the controllers about an added number
     * @param pNumber number to be notified to the controllers
     */

    public void notifyObservers(int pNumber){
        for(Observer o: controllerList){
            o.update(pNumber);
        }
    }
}