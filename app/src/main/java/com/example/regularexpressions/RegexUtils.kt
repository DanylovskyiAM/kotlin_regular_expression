package com.example.regularexpressions

class RegexUtils {

    companion object {

        fun checkWithRegex(str: String, maxSize: Int) : Boolean {
            val minSize = 4
            if (str.length < minSize || str.length > maxSize) {
                return false
            } else {
                val regex =
                    Regex("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~])(?=\\S+$).{4,$maxSize}$")
                /*
                ^                 # start-of-string
                (?=.*[0-9])       # a digit must occur at least once
                (?=.*[a-z])       # a lower case letter must occur at least once
                (?=.*[A-Z])       # an upper case letter must occur at least once
                (?=.*[!"#$%&'()*+,-./:;<=>?@[\]^_`{|}~])  # a special character must occur at least once
                (?=\\S+$)          # no whitespace allowed in the entire string
                .{0,maxSize}             # anything, not longer then maxSize
                $                 # end-of-string
             */
                return regex.matches(str)
            }
        }

    }
}