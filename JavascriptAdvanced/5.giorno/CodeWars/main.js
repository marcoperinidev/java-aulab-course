// 1, 246, 2, 123, 3, 82, 6, 41 are the divisors of number 246. Squaring these divisors we get: 1, 60516, 4, 15129, 9, 6724, 36, 1681. The sum of these squares is 84100 which is 290 * 290.

// Task
// Find all integers between m and n (m and n integers with 1 <= m <= n) such that the sum of their squared divisors is itself a square.

// We will return an array of subarrays or of tuples (in C an array of Pair) or a string. The subarrays (or tuples or Pairs) will have two elements: first the number the squared divisors of which is a square and then the sum of the squared divisors.

/*list_squared(1, 250) --> [[1, 1], [42, 2500], [246, 84100]]
list_squared(42, 250) --> [[42, 2500], [246, 84100]]*/

// The form of the examples may change according to the language, see "Sample Tests".

// In Fortran - as in any other language - the returned string is not permitted to contain any redundant trailing whitespace: you can use dynamically allocated character strings.

function listSquared(m, n) {
    let result = [];
  for (let num = m; num <= n; num++) {
    let sum = 0;
    for (let div = 1; div <= num; div++) {
      if (num % div === 0) {
        sum += div * div;
      }
    }
    if (Number.isInteger(Math.sqrt(sum))) {
      result.push([num, sum]);
    }
  }
  return result;
}

// Write two functions that convert a roman numeral to and from an integer value. Multiple roman numeral values will be tested for each function.

// Modern Roman numerals are written by expressing each digit separately starting with the left most digit and skipping any digit with a value of zero. In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC. 2008 is written as 2000=MM, 8=VIII; or MMVIII. 1666 uses each Roman symbol in descending order: MDCLXVI.

// Input range : 1 <= n < 4000

// In this kata 4 should be represented as IV, NOT as IIII (the "watchmaker's four").

// Examples
// to roman:
// 2000 -> "MM"
// 1666 -> "MDCLXVI"
// 1000 -> "M"
//  400 -> "CD"
//   90 -> "XC"
//   40 -> "XL"
//    1 -> "I"

// from roman:
// "MM"      -> 2000
// "MDCLXVI" -> 1666
// "M"       -> 1000
// "CD"      -> 400
// "XC"      -> 90
// "XL"      -> 40
// "I"       -> 1

class RomanNumerals {
    static toRoman(num) {
      const romanValues = [
        { value: 1000, symbol: 'M' },
        { value: 900, symbol: 'CM' },
        { value: 500, symbol: 'D' },
        { value: 400, symbol: 'CD' },
        { value: 100, symbol: 'C' },
        { value: 90, symbol: 'XC' },
        { value: 50, symbol: 'L' },
        { value: 40, symbol: 'XL' },
        { value: 10, symbol: 'X' },
        { value: 9, symbol: 'IX' },
        { value: 5, symbol: 'V' },
        { value: 4, symbol: 'IV' },
        { value: 1, symbol: 'I' },
      ];
  
      let result = '';
      let i = 0;
  
      while (num > 0) {
        if (romanValues[i].value <= num) {
          result += romanValues[i].symbol;
          num -= romanValues[i].value;
        } else {
          i++;
        }
      }
  
      return result;
    }
  
    static fromRoman(str) {
      const romanValues = {
        M: 1000,
        CM: 900,
        D: 500,
        CD: 400,
        C: 100,
        XC: 90,
        L: 50,
        XL: 40,
        X: 10,
        IX: 9,
        V: 5,
        IV: 4,
        I: 1,
      };
  
      let result = 0;
  
      for (let i = 0; i < str.length; i++) {
        let currentValue = romanValues[str[i]];
        let nextValue = romanValues[str[i + 1]];
  
        if (nextValue && nextValue > currentValue) {
          result += nextValue - currentValue;
          i++;
        } else {
          result += currentValue;
        }
      }
  
      return result;
    }
  }

  //soluzione stra DRY (non fatta da me)

  const map = { M:1000, CM:900, D:500, CD:400, C:100, XC:90, L:50, XL:40, X:10, IX:9, V:5, IV:4, I:1};

    class RomanNumerals {
    static toRoman(num) {
        let str = '';
        for (var i in map) {
            while (num >= map[i]) {
                str += i;
              num -= map[i];
            }
        }
        return str;
    }
    static fromRoman(str) {
         return str.match(/CM|CD|XC|XL|IX|IV|\w/g).reduce((acc, el) => acc + map[el], 0);
    }
}