/*
The classic word-count algorithm: given an array of strings, return a Map<String, Integer> 
with a key for each different string, with the value the number of times that string appears in the array.

wordCount(["a", "b", "a", "c", "b"]) ? {"a": 2, "b": 2, "c": 1}
wordCount(["c", "b", "a"]) ? {"a": 1, "b": 1, "c": 1}
wordCount(["c", "c", "c", "c"]) ? {"c": 4}
*/

public Map<String, Integer> wordCount(String[] strings) {
  Map<String, Integer> map = new HashMap<>();
  for (String key:strings){
    if (map.containsKey(key)){
      map.put(key, map.get(key)+1);
    }
    else{
      map.put(key, 1);
    }
  }
  return map;
}
