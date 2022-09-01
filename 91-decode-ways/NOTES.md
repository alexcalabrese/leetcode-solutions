### Explanation
The idea is to first create a map to memoize results, at first we enter the total length of the given string e as a int we put 1 (it means that we reach the end of the string so we can decode the string in 1 way).

Then I will call my helper function passing the given string and the starting index 0.
Inside the helper function:
- If string is null there aren't way to read it.
- If we already encountered that substring we return the ways in which we can read the substring.
- If we meet a '0' we just return 0 as said in the track.

### Recursive idea
💡 Foreach digit we have two case to follow: <br/>
- Take 1 digit <br/>
- Take 2 digit

Initialise a int variable to count the ways.

1. We increment the ways counter with the recursive call on the next digit, we are iterating on the entire list:
    
    ```java
    // 1 digit case
    ways += helper(s, start + 1);
    ```
    
2. Then we check if the current digit (and all recursive call did before) have a next digit, if it is, we get the two digit and check if the number is less/equals to 26.
If it is, we do the recursive call with index + 2, to calculate also that case.
    
    ```java
    // 2 digit case
    if(start + 1 < s.length()){
      // It return the number casted to int
      int firstDigit = s.charAt(start) - '0';
      int secondDigit = s.charAt(start + 1) - '0';

      // first digit is more singificant so we have to multiply
      // "12"
      // firstDigit = 1, firstDigit = 2
      // number = 1*10 + 2 = 10 + 2 = 12
      int number = firstDigit * 10 + secondDigit;

      if(number <= 26)
          ways += helper(s, start + 2);
    }
    ```
    
3. At the end we just save results into the map and return the result.
