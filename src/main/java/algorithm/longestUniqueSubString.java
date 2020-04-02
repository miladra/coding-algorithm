package algorithm;

// Java program to find the length of the longest substring
// without repeating characters
public class longestUniqueSubString {

    static final int NO_OF_CHARS = 256;
    static int longestUniqueSubString(String input)
    {
        int inputLength = input.length();
        int currentLength = 1; // length of current substring
        int maxLength = 1; // result
        int prevIndex; // previous index
        int i;
        int visited[] = new int[NO_OF_CHARS];

        /* Initialize the visited array as -1, -1 is
         used to indicate that character has not been
         visited yet. */
        for (i = 0; i < NO_OF_CHARS; i++) {
            visited[i] = -1;
        }

        /* Mark first character as visited by storing the
             index of first   character in visited array. */
        visited[input.charAt(0)] = 0;

        /* Start from the second character. First character is
           already processed (cur_len and max_len are initialized
         as 1, and visited[str[0]] is set */
        for (i = 1; i < inputLength; i++) {

            prevIndex = visited[input.charAt(i)];

            /* If the current character is not present in
           the already processed substring or it is not
              part of the current NRCS, then do cur_len++ */
            if (prevIndex == -1 || i - currentLength > prevIndex)
                currentLength++;

            /* If the current character is present in currently
               considered NRCS, then update NRCS to start from
               the next character of the previous instance. */
            else {
                /* Also, when we are changing the NRCS, we
                   should also check whether length of the
                   previous NRCS was greater than max_len or
                   not.*/
                if (currentLength > maxLength)
                    maxLength = currentLength;

                currentLength = i - prevIndex;
            }

            // update the index of current character
            visited[input.charAt(i)] = i;
        }

        // Compare the length of last NRCS with max_len and
        // update max_len if needed
        if (currentLength > maxLength)
            maxLength = currentLength;

        return maxLength;
    }

    /*
    Time Complexity: O(n + d) where n is length of the input string and d is number of characters in input string alphabet. For example, if string consists of lowercase English characters then value of d is 26.
    Auxiliary Space: O(d)
     */
}
