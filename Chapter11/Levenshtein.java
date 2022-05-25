package Chapter11;

// https://en.wikipedia.org/wiki/Levenshtein_distance

public class Levenshtein {
    public static void main(String args[]) {
        System.out.println(get_levenshtein("bird".toCharArray(), "word".toCharArray()));
    }

    // This method computes and returns the edit distance of two char arrays
    public static int get_levenshtein(char[] word1, char[] word2) {
        int[][] matrix = new int[word1.length + 1][word2.length + 1];

        // These two loops create base numbers in the matrix
        // that will help do operations for edit distance. 
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[0][i] = i;
        }

        for (int i = 0; i < matrix.length; i++) {
            matrix[i][0] = i;
        }

        for (int i = 1; i <= word1.length; i++) {
            for (int j = 1; j <= word2.length; j++) {
                if (word1[i-1] == word2[j-1]) {
                    matrix[i][j] = matrix[i-1][j-1];    // Diagonal process if characters match
                } else {
                    matrix[i][j] = 1 + minimum(matrix[i-1][j-1], matrix[i-1][j], matrix[i][j-1]); // Finding the min around and adding 1
                }
            }
        }
        return matrix[word1.length][word2.length];  // Returns last element which is edit distance
    }

    // Computes the minimum between 3 numbers
    public static int minimum(int a, int b, int c) {
        int temp = Math.min(a, b);
        return Math.min(temp, c);
    }
}
