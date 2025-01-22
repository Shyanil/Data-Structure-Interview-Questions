import java.util.*;

public class Word_Ladder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
     if(!wordList.contains(endWord)) return 0;
     Set<String> wordSet = new HashSet<>(wordList);
     Set<String> visited = new HashSet<>();
     Queue<String> stringQueue = new LinkedList<>();
     stringQueue.offer(beginWord);
     visited.add(beginWord);
     int count = 1;
     while (!stringQueue.isEmpty()){
         int size = stringQueue.size();


         for (int i = 0; i < size; i++) {
             String currE = stringQueue.poll();
             for (int k = 0; k < currE.length(); k++) {
                 char[] chars = currE.toCharArray();
                 for (char j = 'a'; j <= 'z'; j++) {
                     chars[k] = j;
                     String newWord = new String(chars);
                     if(newWord.equals(endWord)) return count + 1;

                     if(wordSet.contains(newWord) && !visited.contains(newWord)){
                         stringQueue.offer(newWord);
                         visited.add(newWord);
                     }
                 }
             }
         }
         count++;
     }

        return 0;
    }
}
