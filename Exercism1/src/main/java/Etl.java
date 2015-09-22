import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Etl {
    
   public Map<String, Integer> transform(Map<Integer, List<String>> old) {
       Map<String, Integer> answer = new HashMap<String, Integer>() ;
       for(Iterator it = old.keySet().iterator(); it.hasNext();){
           Integer key = (Integer)it.next();
                for(String s : old.get(key)){
                    answer.put(s.toLowerCase(), key);
                }
       }
      return answer;
   }
}
