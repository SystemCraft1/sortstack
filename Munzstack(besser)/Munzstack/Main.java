import java.util.Stack;
import java.util.ArrayList;

public class Main {
    /**
     * A description of the entire Java function.
     *
     * @param args description of parameter
     * @return description of return value
     */
    public static void main(String[] args) {
        stack s = new stack();
        Stack<Coin> result = new Stack<>();
        ArrayList<Coin> coins = s.getScramble();
        result = s.sort(coins);
        while (!(result.isEmpty())) {
            System.out.println(result.pop().getTyp());
        }

    }

}
