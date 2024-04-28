Certainly! Regular expressions are incredibly useful for pattern matching and text processing. Here are some commonly used regular expressions that you might find helpful:

1. **Matching Email Addresses**:

   ```
   ^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$
   ```

   ```
   Email: "[a-z]+[a-z0-9]+@[a-z]*\\.(com|org|net)"
   ```

   This regex pattern matches most valid email addresses.

2. **Matching URLs**:

   ```
   ^(http|https):\/\/[^\s/$.?#].[^\s]*$
   ```

   This regex pattern matches most URLs, starting with either "http://" or "https://".

3. **Matching IP Addresses**:

   ```
   \b\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}\b
   ```

   This regex pattern matches IPv4 addresses.

4. **Matching Dates (MM/DD/YYYY)**:

   ```
   (0[1-9]|1[0-2])\/(0[1-9]|[1-2][0-9]|3[0-1])\/(19|20)\d{2}
   ```

   This regex pattern matches dates in MM/DD/YYYY format.

5. **Matching Credit Card Numbers** (simplified):

   ```
   \b(?:\d[ -]*?){13,16}\b
   ```

   This regex pattern matches most credit card numbers, with or without spaces or dashes.

6. **Matching Phone Numbers** (simplified):

   ```
   \(?\d{3}\)?[-.\s]?\d{3}[-.\s]?\d{4}
   ```

   This regex pattern matches most common phone number formats.

7. **Matching HTML Tags** (non-nested):

   ```
   <([a-zA-Z][a-zA-Z0-9]*)\b[^>]*>(.*?)<\/\1>
   ```

   This regex pattern matches basic HTML tags and their contents.

8. **Matching Hexadecimal Color Codes**:

   ```
   #([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})
   ```

   This regex pattern matches both 3-digit and 6-digit hexadecimal color codes.

9. **Matching Social Security Numbers (SSN)**:

   ```
   \d{3}-\d{2}-\d{4}
   ```

   This regex pattern matches the standard format of Social Security Numbers.

10. **Matching Username** (Alphanumeric with underscores, 3-16 characters):

    ```
    ^[a-zA-Z0-9_]{3,16}$
    ```

    This regex pattern matches usernames that consist of alphanumeric characters and underscores, with a length between 3 and 16 characters.

11. **Matching Password**
    **Password Rules**:

   - At least 8 characters long.
   - Contains at least one uppercase letter.
   - Contains at least one lowercase letter.
   - Contains at least one digit.
   - Contains at least one special character from a predefined set (e.g., !@#$%^&\*).

   Here's a regex pattern that enforces these rules:

   ```
   ^(?=.*[A-Z])(?=.*[a-z])(?=.*\d)(?=.*[!@#$%^&*]).{8,}$
   ```

   Explanation:

   - `^` asserts the start of the string.
   - `(?=.*[A-Z])` asserts that the string contains at least one uppercase letter.
   - `(?=.*[a-z])` asserts that the string contains at least one lowercase letter.
   - `(?=.*\d)` asserts that the string contains at least one digit.
   - `(?=.*[!@#$%^&*])` asserts that the string contains at least one special character.
   - `.{8,}` matches any character (except for line terminators) at least 8 times.
   - `$` asserts the end of the string.

12. **Matching Alphanumeric Characters**:
   ```
   ^[a-zA-Z0-9]+$
   ```
   This regex pattern matches strings that consist of only alphanumeric characters.

13. **Matching Numeric Values** (including decimals and negative numbers):
   ```
   ^-?\d*\.?\d+$
   ```
   This regex pattern matches numeric values, including integers, decimals, and negative numbers.

14. **Matching Positive Integers**:
   ```
   ^\d+$
   ```
   This regex pattern matches positive integer numbers.

15. **Matching Floating Point Numbers**:
   ```
   ^-?\d*\.?\d+$
   ```
   This regex pattern matches floating-point numbers, including both positive and negative values.

16. **Matching Words** (Separated by spaces):
   ```
   \b\w+\b
   ```
   This regex pattern matches individual words in a string.

17. **Matching Sentences** (Ending with periods):
   ```
   [^.!?]+[.!?]
   ```
   This regex pattern matches complete sentences in a text.

18. **Matching File Paths** (Unix-like):
   ```
   ^\/(?:[^\/]+\/)*[^\/]+$
   ```
   This regex pattern matches Unix-like file paths.

19. **Matching Credit Card Expiration Dates** (MM/YYYY):
   ```
   (0[1-9]|1[0-2])\/(1[9-9][0-9]|[2-9][0-9]{3})
   ```
   This regex pattern matches credit card expiration dates in MM/YYYY format.

20. **Matching HTML Comments**:
   ```
   <!--[\s\S]*?-->
   ```
   This regex pattern matches HTML comments.

21. **Matching IPv6 Addresses**:
    ```
    (([0-9a-fA-F]{1,4}:){7,7}[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,7}:|([0-9a-fA-F]{1,4}:){1,6}:[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,5}(:[0-9a-fA-F]{1,4}){1,2}|([0-9a-fA-F]{1,4}:){1,4}(:[0-9a-fA-F]{1,4}){1,3}|([0-9a-fA-F]{1,4}:){1,3}(:[0-9a-fA-F]{1,4}){1,4}|([0-9a-fA-F]{1,4}:){1,2}(:[0-9a-fA-F]{1,4}){1,5}|[0-9a-fA-F]{1,4}:((:[0-9a-fA-F]{1,4}){1,6})|:((:[0-9a-fA-F]{1,4}){1,7}|:)|fe80:(:[0-9a-fA-F]{0,4}){0,4}%[0-9a-zA-Z]{1,}|::(ffff(:0{1,4}){0,1}:){0,1}((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])|([0-9a-fA-F]{1,4}:){1,4}:((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9]))
    ```
    This regex pattern matches IPv6 addresses.
