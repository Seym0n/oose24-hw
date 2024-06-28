import java.util.ArrayList;
import java.util.List;

public class Model {

    private static Model modelInstance;

    private List<Observer> viewList = new ArrayList<>();
    private List<Integer> numbers = new ArrayList<Integer>();

    private Integer average = 0;

    public Model(){

    }

    /**
     * Add a number to the list
     * @param pNumber number to bee added to the list
     */

    public void addNumber(int pNumber){
        this.numbers.add(pNumber);
    }

    /**
     *
     * @return list of numbers
     */

    public List<Integer> getNumbers(){
        return numbers;
    }

    /**
     * Set new average of the list
     * @param average new average of the list
     */

    public void setAverage(Integer average) {
        this.average = average;
        notifyObservers();
    }

    /**
     * Average of the List
     * @return average of the list
     */

    public Integer getAverage() {
        return average;
    }

    /**
     * Registers a view
     * @param pObserver View to register
     */

    public void registerObserver(Observer pObserver){
        this.viewList.add(pObserver);
    }

    /**
     * Unregister an View
     * @param pObserver VIew to unregister
     */

    public void unregisterObserver(Observer pObserver){
        this.viewList.remove(pObserver);
    }

    /**
     * Notifies the view about an average change
     */

    public void notifyObservers(){
        for(Observer o : viewList){
            o.update(average);
        }
    }

    /**
     * returns  an instance
     * @return Instance of the class Model
     */

    public static Model getInstance(){
        if(modelInstance == null){
            modelInstance = new Model();
        }
        return modelInstance;
    }
}
