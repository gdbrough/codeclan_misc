public class ArrayExample {

    private String[] words;

    public ArrayExample(){
        this.words = new String[5];
    }

    public int getWordCount(){
        return this.words.length;
    }

    public void add(String word){
        for (int i = 0; i < words.length; i++){
            if (words[i] == null) {
                this.words[i] = word;
                break;
            }
        }
    }

}
