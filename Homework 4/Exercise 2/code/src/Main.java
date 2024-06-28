public class Main {

    public static void main(String[] args){
        // Instantiate views
        View view1 = new View();
        View view2 = new View();
        View view3 = new View();


        // Get controller and model instances
        Controller controller = Controller.getInstance();
        Model model = Model.getInstance();


        // Register controller to the views
        view1.registerObserver(controller);
        view2.registerObserver(controller);
        view3.registerObserver(controller);

        // Register views to the model
        model.registerObserver(view1);
        model.registerObserver(view2);
        model.registerObserver(view3);

        // Emit numbers to controller via Observer
        // Shall output in console as the model notify the views about incoming changes on the average
        view1.notifyObservers(3);
        view2.notifyObservers(5);
        view2.notifyObservers(10);
        view3.notifyObservers(50);
    }
}
