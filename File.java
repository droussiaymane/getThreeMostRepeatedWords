import java.util.*;
public class File {


  public static void main(String[] args) {
    System.out.println(getThreeMostRepeatedWords("We’re building tomorrow—and beyond. BCG X brings together over 3,000 of the best tech, design, and entrepreneurial minds to create businesses, products, and services that will change the world. Working in collaboration with BCG’s deep industry and functional experts, our diverse teams help CEOs and world leaders create powerful solutions for a bigger, brighter future."));

	}

  public static List<String> getThreeMostRepeatedWords(String paragraph) {
    String[] words = paragraph.split("\\s+");

    if (words.length < 3) {
        return Arrays.asList("Error: Paragraph must have at least 3 words.");
    }

    Map<String, Integer> wordCountMap = new HashMap<>();
    for (String word : words) {
        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
    }




    String maxWord1 = "", maxWord2 = "", maxWord3 = "";
        int max1 = 0, max2 = 0, max3 = 0;

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            int count = entry.getValue();
            if (count > max1) {
                max3 = max2;
                max2 = max1;
                max1 = count;
                maxWord3 = maxWord2;
                maxWord2 = maxWord1;
                maxWord1 = entry.getKey();
            } else if (count > max2) {
                max3 = max2;
                max2 = count;
                maxWord3 = maxWord2;
                maxWord2 = entry.getKey();
            } else if (count > max3) {
                max3 = count;
                maxWord3 = entry.getKey();
            }
        }

        return Arrays.asList(maxWord1, maxWord2, maxWord3);
}

}
