import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

    private ArrayList<String> words;
    private ArrayList<Integer> numbers;

    public ArrayListExample(ArrayList<Integer> numbers) {
        this.words = new ArrayList<>();
        this.numbers = numbers;
    }

    public void add(String word){
        this.words.add(word);
    }

    public int getWordCount(){
        return this.words.size();
    }

    public String getWordAtIndex(int index){
        return words.get(index);
    }

    public int getTotal(){
        int total = 0;
        for (int number : this.numbers){
            total += number;
        }
        return total;
    }

    public int getRandomNumber(){
        Collections.shuffle(numbers);
        return numbers.get(0);
    }

    public ArrayList<Integer> getNumbers() {
        return new ArrayList<>(this.numbers);
    }
}
