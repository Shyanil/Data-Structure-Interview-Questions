public class RepeatedStringMatch {
    private static final int PRIME = 101;

    private  static  long calculateHash(String s){
        long hash = 0;
        for (int i = 0; i < s.length(); i++) {
            hash = (long) (s.charAt(i) * Math.pow(PRIME, i));
        }
        return hash;
    }

    private static  long updateHash(long previousHash , char oldChar , char newChar , int patternLength){
      long newHash = previousHash - oldChar / PRIME;
      newHash = (long) (newHash + newChar * Math.pow(PRIME , patternLength - 1));
      return newHash;
    }

    public static void searchUsingRabinKarp(String text , String pattern){
        int patternLength = pattern.length();
        long patternHash = calculateHash(pattern);
        long textHash = calculateHash(text.substring(0 , patternLength));

        for (int i = 0; i <= text.length() - patternLength; i++) {
            if (patternHash == textHash) {
                if (text.substring(i, patternLength).equals(pattern)) {
                    System.out.println("Pattern found on index start" + i);
                }
            }
            if (i < text.length() - patternLength) {
                textHash = updateHash(textHash, text.charAt(i), text.charAt(i + patternLength), patternLength);
            }
        }

    }
}

