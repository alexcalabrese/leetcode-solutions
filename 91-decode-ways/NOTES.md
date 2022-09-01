### Explanation
The idea is to first create a map to memoize results, at first we enter the total length of the given string e as a int we put 1 (it means that we reach the end of the string so we can decode the string in 1 way).
​
Then I will call my helper function passing the given string and the starting index 0.
Inside the helper function:
- If string is null there aren't way to read it.
- If we already encountered that substring we return the ways in which we can read the substring.
- If we meet a '0' we just return 0 as said in the track.
​
### Recursive idea
<aside>
💡 **Foreach digit** we have two case to follow:
- Take 1 digit
- Take 2 digit
​
</aside>
​
Initialise a int variable to count the ways.
​
1. We increment the ways counter with the recursive call on the next digit, we are iterating on the entire list:
```java
// 1 digit case
ways += helper(s, start + 1);
```
// "12"