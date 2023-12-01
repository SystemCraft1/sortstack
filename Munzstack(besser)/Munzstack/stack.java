import java.util.Stack;
import java.util.ArrayList;
import java.util.Scanner;

public class stack {
    ArrayList<Coin> scramble = new ArrayList<Coin>();
    Coin c1 = new Coin(1);
    Coin c2 = new Coin(1);
    Coin c3 = new Coin(1);
    Coin c4 = new Coin(20);
    Coin c5 = new Coin(5);

    public stack() {
        scramble.add(c1);
        scramble.add(c2);
        scramble.add(c3);
        scramble.add(c4);
        scramble.add(c5);
    }

    /**
     * Sorts the given ArrayList of Coins in ascending order using a stack.
     *
     * @param input the ArrayList of Coins to be sorted
     * @return the sorted stack of Coins
     */
    public Stack<Coin> sort(ArrayList<Coin> input) {
        Stack<Coin> stack = new Stack<Coin>();
        int size = input.size();
        for (int j = 0; j < size; j++) {
            int index = 0;
            for (int i = 0; i < input.size(); i++) {
                if (input.get(index).val > input.get(i).val) {
                    index = i;
                }
            }
            stack.push(input.get(index));
            input.remove(index);
        }
        return stack;
    }

    /**
     * Retrieves the scramble ArrayList of Coin objects.
     *
     * @return the scramble ArrayList of Coin objects
     */
    public ArrayList<Coin> getScramble() {
        return scramble;
    }

    




}