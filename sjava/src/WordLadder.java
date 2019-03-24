import java.util.*;
import java.util.LinkedList;

public class WordLadder {
    int ladderLength(String start, String end, Set<String> dict) {
        Queue<String> queue = new LinkedList<>();
        queue.add(start);

        HashMap<String, Integer> visited = new HashMap<>();
        visited.put(start, 1);

        while (!queue.isEmpty()) {
            String temp = queue.poll();
            List<String> neighbours = getNeighbours(temp, dict, visited, queue);
            for (String n : neighbours) {
                if (n.equals(end)) {
                    return visited.getOrDefault(n, 0);
                }
            }
        }
        return 0;
    }

    private List<String> getNeighbours(
            String str,
            Set<String> dict,
            HashMap<String, Integer> visited,
            Queue<String> queue) {

        List<String> neighbours = new ArrayList<>();

        int level = visited.get(str);
        for (int i = 0; i < str.length(); i++) {
            char[] chars = str.toCharArray();

            for (char c = 'a'; c <= 'z'; c++) {
                chars[i] = c;

                String word = new String(chars);
                if (dict.contains(word) && !visited.containsKey(word)) {
                    queue.add(word);
                    visited.put(word, level + 1);
                    neighbours.add(word);
                }
            }
        }

        return neighbours;

    }
}
