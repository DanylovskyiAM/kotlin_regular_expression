# Use Case #10

## Application description:

Compose regular expressions to efficiently search, match, and manipulate text patterns.

## Regex implementation description

     ^                 # start-of-string
     (?=.*[0-9])       # a digit must occur at least once
     (?=.*[a-z])       # a lower case letter must occur at least once
     (?=.*[A-Z])       # an upper case letter must occur at least once
     (?=.*[!"#$%&'()*+,-./:;<=>?@[\]^_`{|}~])  # a special character must occur at least once
     (?=\\S+$)         # no whitespace allowed in the entire string 
     .{0,maxSize}      # anything, not longer then maxSize 
     $                 # end-of-string

## Information on how to open and run the project tests locally

Run *RegexUtilsUnitTest.kt* 
