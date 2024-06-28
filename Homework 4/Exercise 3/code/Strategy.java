package code;

@FunctionalInterface
public interface Strategy {
    String execute(String word);
}