package code;

public class StrategyExample {
    public static void main(String[] args){
        Strategy strategy1 = (String word) -> {
            return word;
        };

        Strategy strategy2 = (String word) -> {
            String newWord = "";
            for(int i = word.length()-1; i >= 0; i--){
                newWord = newWord + word.charAt(i);
            }
            return newWord;
        };

        Stringify stringify = new Stringify(strategy1);

        String word = stringify.stringify("Test");

        System.out.println(word);

        stringify.setStrategy(strategy2);

        String word2 = stringify.stringify("Test");
        System.out.println(word2);


    }
}