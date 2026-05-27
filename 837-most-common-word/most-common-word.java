class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
       Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        String[] words = paragraph.toLowerCase().replaceAll("[!?',;.]", " ").split("\\s+");
        Map<String, Integer> freq = new HashMap<>();
        for (String word : words) 
        {
            if (!bannedSet.contains(word)) 
            {
                freq.put(word, freq.getOrDefault(word, 0) + 1);
            }
        }
        return Collections.max(freq.entrySet(), Map.Entry.comparingByValue()).getKey(); 
    }
}