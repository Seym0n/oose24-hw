import java.util.ArrayList;
import java.util.List;

public class Controller implements Observer {

    private static Controller controllerInstance;

    private Model model;

    public Controller(){
        this.model = Model.getInstance();
    }

    /**
     * Adds a new number and calculates the average
     * @param number to add to the model for the average
     */

    @Override
    public void update(int number){
        this.model.addNumber(number);
        List<Integer> numbers = this.model.getNumbers();
        int avg = 0;
        for(Integer numb : numbers){
            avg += numb;
        }
        avg /= numbers.size();
        this.model.setAverage(avg);
    }

    /**
     * returns  an instance
     * @return Instance of the class Controller
     */

    public static Controller getInstance(){
        if(controllerInstance == null){
            controllerInstance = new Controller();
        }
        return controllerInstance;
    }
}
