import java.util.HashMap;

public class DNA {
    
    private String nucleotide;

    public DNA(String nucleotide) {
        this.nucleotide = nucleotide;
    }
    
    public HashMap<Character , Integer> nucleotideCounts(){
        HashMap<Character, Integer> cache = new HashMap<Character, Integer>();
        Character [] letters = {'A','C','G','T'};
        for(Character c : letters){
            cache.put(c, count(c));
        }
        return cache;
    }
    
    public int count(Character pInput){
        int count=0;
        if(pInput.equals('A') || pInput.equals('C') || pInput.equals('G') || pInput.equals('T')){
            for(int index =0; index < nucleotide.length(); index ++){
                char originalChar = nucleotide.toUpperCase().charAt(index);
                if(Character.valueOf(originalChar).equals(pInput)){
                    count++;
                }
            }
        }else throw new IllegalArgumentException("Input no valid");
        return count;
    }
    
}
