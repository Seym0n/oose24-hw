package code;

public class Stringify {
    Strategy strategy;
    
    public Stringify(Strategy pStrategy){
        this.strategy = pStrategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public String stringify(String pWord){
        return this.strategy.execute(pWord);
    }
}
