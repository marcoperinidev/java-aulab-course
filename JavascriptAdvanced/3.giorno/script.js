// // //-------ESERCIZIO 1-------
// // //calcolare l'ipotenusa di un triangolo rettangolo di cateti 3 e 4. Potete usare Math
// // function calcolaIpotenusa(cateto1, cateto2) {
// //     return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
// //   }
  
// //   const cateto1 = 3;
// //   const cateto2 = 4;
// //   const ipotenusa = calcolaIpotenusa(cateto1, cateto2);
  
// //   console.log(ipotenusa);
  
// //   // metodo alternativo
  
// //   // function calcolaIpotenusa(cateto1, cateto2) {
// //   //   const sommaDeiQuadrati = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
// //   //   const ipotenusa = Math.sqrt(sommaDeiQuadrati);
// //   //   return ipotenusa;
// //   // }
  
// //   // const cateto1 = 3;
// //   // const cateto2 = 4;
// //   // const ipotenusa = calcolaIpotenusa(cateto1, cateto2);
  
// //   // console.log(ipotenusa);
  
// //   //-------ESERCIZIO 2-------
// //   // scrivere una funzione che trasformi un nome nelle sue iniziali "Tizio Caio" => T.C.
  
// //   function trasformaInIniziali(nome) {
// //     const nomeSplittato = nome.split(" ");
// //     const iniziali = nomeSplittato[0].charAt(0) + "." + nomeSplittato[1].charAt(0);
// //     return iniziali;
// //   }
// //   console.log(trasformaInIniziali("Tizio Caio Sampronio")); //questo non funziona con più parole perché passandogli direttamente gli indici non controlla altre parole con indici diversi da 0 e 1
  
// //   //metodo GIUSTO:
  
// //   function getInitials(name) {
  
// //       let words = name.split(" ");
      
// //       let initials = "";
// //       for (let i = 0; i < words.length; i++) {
// //         let word = words[i];
// //         if (word.length > 0) {
// //           initials += word[0].toUpperCase() + ".";
// //         }
// //       }
// //       return initials;
// //     }
    
// //     let name = "Tizio Caio Sampronio";
// //     let initials = getInitials(name);
// //     console.log(initials);
    
// //     //-------ESERCIZIO 3-------
// //   //   scrivere una funzione che , dati 3 segmenti di misure a, b, c, ritorni true se questi 3 numeri possono formare un triangolo. False altrimenti; ciascuno dev'essere minore della somma degli altri due e maggiore della loro differenza.
// //   //     a < b+c
// //   //     b < a+c
// //   //     c < a+b
// //   //     a > b-c
// //   //     b > a-c
// //   //     c > a-b
  
// //   function isTriangle(a, b, c) {
// //     if (a < b + c && b < a + c && c < a + b && a > b - c && b > a - c && c > a - b) {
// //       return true;
// //     } else {
// //       return false;
// //     }
// //   }
// //   console.log(isTriangle(3, 4, 5));
// //   console.log(isTriangle(1, 2, 3));
// //   console.log(isTriangle(5, 11, 15));
  
// //   //-------ESERCIZIO 4-------
// //   // congettura di collatz
// //   // preso un numero maggiore di 1, se questo è pari dividerlo per due, se dispari moltiplicarlo per 3 e aggiungere 1. Ripetere. Qualunque sia il numero di partenza, l'algoritmo termina sempre ad uno. Scrivere una funzione che implementi l'algoritmo e ritorni un array con il valore calcolato ad ogni iterazione
  
// //   function collatz(n) {
// //     const array = [n];
// //     while (n > 1) {
// //       if (n % 2 === 0) {
// //         n = n / 2;
// //       } else {
// //         n = n * 3 + 1;
// //       }
// //       array.push(n);
// //     }
// //     return array;
// //   }
// //   console.log(collatz(10));
  
// //   //alternativa senza .push()
  
// //   function collatz(n) {
// //     const array = [];
// //     let i = 0;
// //     array[i] = n;
// //     while (n > 1) {
// //       if (n % 2 === 0) {
// //         n = n / 2;
// //       } else {
// //         n = n * 3 + 1;
// //       }
// //       i++;
// //       array[i] = n;
// //     }
// //     return array;
// //   }
// //   console.log(collatz(10));
  
// //   //-------ESERCIZIO 5-------
  
// //   // Scrivere una funzione che, assegnato un numero n,  ritorni la successione di fibonacci fino al numero n sottoforma di array.
// //   // Ad esempio 3 => [1,1,2], 9 => [1,1,2,3,5,8,13,21,34]
  
// //   function fibonacci(n) {
// //     const array = [1, 1];
// //     for (let i = 2; i < n; i++) {
// //       array.push(array[i - 1] + array[i - 2]);
// //     }
// //     return array;
// //   }
  
// //   console.log(fibonacci(9));
  
// //   // //-------ESERCIZIO 6-------
// //   // scrivere una funzione che, assegnato un numero n, ritorni se è primo o no
  
// //   function isPrime(n) {
// //     for (let i = 2; i < n; i++) {
// //       if (n % i === 0) {
// //         return false;
// //       }
// //     }
// //     return true;
// //   }
  
// //   console.log(isPrime(7));
// //   console.log(isPrime(9));
// //   console.log(isPrime(11));
  
// //   //-------ESERCIZIO 7-------
// //   // scrivere una funzione che assegnata una stringa ritorni la somma delle cifre in essa presenti. Ad esempio "Sono 1 stringa di 6 parole" => 7
  
// //   function sumDigits(string){
// //     let sum = 0;
// //     for (let i = 0; i < string.length; i++) {
// //       let currentChar = string.charAt(i);
// //       if (!isNaN(currentChar) && currentChar !== " ") {
// //         sum += parseInt(currentChar);
// //       }
// //     }
  
// //     return sum;
// //   }
  
// //   console.log(sumDigits("Sono 1 stringa di 6 parole"));
// //   console.log(sumDigits("Sono 1 stringa di 6 parole e 2 numeri"));
  
// //   //-------ESERCIZIO 8-------
// //   //Scrivere una funzione che trasformi un numero in ore e minuti. Ad esempio 3014 => 50:14. Devono essere sempre presenti due cifre, sia per le ore che per i minuti.
  
// //   function convertToHoursMinutes(n) {
// //     const hours = Math.floor(n / 60);
// //     const minutes = n % 60;
// //     return hours + ":" + minutes;
// //   }
  
// //   console.log(convertToHoursMinutes(3014));
// //   console.log(convertToHoursMinutes(2345));
  
// //   //-------ESERCIZIO 9-------
// //   // scrivere una funzione che, assegnata una stringa, ritorni l numero di vocali presenti. gestire le maiuiscole
  
// //   function countVocali(string) {
// //     let count = 0;
// //     for (let i = 0; i < string.length; i++) {
// //       let currentChar = string.charAt(i); //.toLowerCase() .toUpperCase()
// //       if (currentChar === "a" || currentChar === "e" || currentChar === "i" || currentChar === "o" || currentChar === "u" || currentChar === "A" || currentChar === "E" || currentChar === "I" || currentChar === "O" || currentChar === "U") {
// //         count++;
// //       }
// //     }
// //     return count;
// //   }
  
// //   console.log(countVocali("Sono una stringa di testo"));
// //   console.log(countVocali("Son una string di tst"));
  
// //   //-------ESERCIZIO 10-------
// //   //scrivere una funzione che accetta una stringa e restituisce la parola più lunga
  
// //   function longestWord(string) {
// //     let words = split(string, " ");
// //     let longest = "";
// //     for (let i = 0; i < words.length; i++) {
// //       if (words[i].length > longest.length) {
// //         longest = words[i];
// //       }
// //     }
// //     return longest;
// //   }
// //   console.log(longestWord("Sono una stringa di testo"));
// //   console.log(longestWord("Sono una supermegastringa di testo"));
  
// //   //metodo .split() per esteso:
  
// //   function split(string, separator) {
// //     const array = [];
// //     let currentWord = "";
// //     for (let i = 0; i < string.length; i++) {
// //       if (string.charAt(i) !== separator) {
// //         currentWord += string.charAt(i);
// //       } else {
// //         array.push(currentWord);
// //         currentWord = "";
// //       }
// //     }
// //     array.push(currentWord);
// //     return array;
// //   }
  
// //   //-------ESERCIZIO 11-------
// //   //scrivere una funzione che accetti una stringa contenente solo caratteri x e y e ritorni true se il numero delle x è uguale al numero delle y
// //   //differenza tra string.charAt() e string[i]? string.CharAt() è un metodo, mentre string[i] è una proprietà
// //   //"string.charAt()" restituisce il carattere della stringa in corrispondenza dell'indice specificato.
// //   //La proprietà "string[i]" consente di accedere al carattere della stringa corrispondente all'indice specificato
  
// //   function isXEqualY(string) {
// //     let x = 0;
// //     let y = 0;
// //     for (let i = 0; i < string.length; i++) {
// //       if (string.charAt(i) === "x") {
// //         x++;
// //       } else if (string.charAt(i) === "y") {
// //         y++;
// //       }
// //     }
// //     return x === y;
// //   }
  
// //   console.log(isXEqualY("xxxyyy"));
// //   console.log(isXEqualY("xxxyyyyy"));
  
// //   //-------ESERCIZIO 12-------
// //   //bubbleSort
  
// //   function bubbleSort(array) {
// //     let swapped = true;
// //     while (swapped) {
// //       swapped = false;
// //       for (let i = 0; i < array.length - 1; i++) {
// //         if (array[i] > array[i + 1]) {
// //           let temp = array[i];
// //           array[i] = array[i + 1];
// //           array[i + 1] = temp;
// //           swapped = true;
// //         }
// //       }
// //     }
// //     return array;
// //   }
  
// //   //----------------------------Merge sort and Quick Sort--------------------------------
  
// //   //merge sort if
  
// //   function mergeSort(array) {
// //     if (array.length < 2) {
// //       return array;
// //     }
// //     const middle = Math.floor(array.length / 2);
// //     const left = array.slice(0, middle);
// //     const right = array.slice(middle, array.length);
// //     return merge(mergeSort(left), mergeSort(right));
// //   }
  
// //   //merge with while loop
  
// //   function merge(left, right) {
// //     const array = [];
// //     while (left.length && right.length) {
// //       if (left[0] <= right[0]) {
// //         array.push(left.shift());
// //       } else {
// //         array.push(right.shift());
// //       }
// //     }
// //     return array.concat(left.slice()).concat(right.slice());
// //   }
  
// //   //quick sort
  
// //   function quickSort(array) {
// //     if (array.length < 2) {
// //       return array;
// //     }
// //     const pivot = array[0];
// //     const less = array.slice(1).filter((item) => item <= pivot);
// //     const greater = array.slice(1).filter((item) => item > pivot);
// //     return quickSort(less).concat(pivot, quickSort(greater));
// //   }

// //--------------------------------------PROGRAMMAZIONE FUNZIONALE--------------------

// // Esercizio1
// // calcolare l'ipotenusa di un triangolo rettangolo di cateti 3 e 4 con la programmazione funzionale

// const ipotenusa1 = (a, b) => Math.sqrt(a * a + b * b); 

// //alternativa
// const cateto1 = 3;
// const cateto2 = 4;

// const ipotenusa = Math.sqrt([cateto1, cateto2].map(x => x * x).reduce((acc, curr) => acc + curr));

// console.log(ipotenusa);
// //perché il reduce e non un filter?

// //Esercizio2

// //scrivere una funzione che trasformi un nome nelle sue iniziali "Tizio Caio" => T.C. con la programmazione funzionale

// const iniziali = (string) => string.split(" ").map(x => x.charAt(0)).join(".");

// console.log(iniziali("Tizio Caio Sempronio Massimo"));

// //Esercizio3
// // scrivere una funzione che , dati 3 segmenti di misure a, b, c, ritorni true se questi 3 numeri possono formare un triangolo. False altrimenti; ciascuno dev'essere minore della somma degli altri due e maggiore della loro differenza.

// const isTriangle = (a, b, c) => a < b + c && b < a + c && c < a + b;

// console.log(isTriangle(3, 4, 5));

// //Esercizio4
// // preso un numero maggiore di 1, se questo è pari dividerlo per due, se dispari moltiplicarlo per 3 e aggiungere 1. Ripetere. Qualunque sia il numero di partenza, l'algoritmo termina sempre ad uno. Scrivere una funzione che implementi l'algoritmo e ritorni un array con il valore calcolato ad ogni iterazione

// const collatz = (n) => {
//     let array = [];
//     while (n > 1) {
//         array.push(n);
//         n = n % 2 === 0 ? n / 2 : n * 3 + 1;
//     }
//     return array;
// }


// console.log(collatz(10));


// //Esercizio5
// // scrivere una funzione che, assegnato un numero n, ritorni se è primo o no, con la programmazione funzionale


// const isPrime = (n) => {
//     if (n < 2) return false;
//     for (let i = 2; i < n; i++) {
//         if (n % i === 0) return false;
//     }
//     return true;
// }

// //esercizio8

// // Scrivere una funzione che trasformi un numero in ore e minuti. Ad esempio 3014 => 50:14. Devono essere sempre presenti due cifre, sia per le ore che per i minuti.

// const time = (n) => {
//     let hours = Math.floor(n / 60);
//     let minutes = n % 60;
//     return `${hours}:${minutes}`;
// }

// console.log(time(3014));

// //Esercizio9
// // scrivere una funzione che, assegnata una stringa, ritorni l numero di vocali presenti. gestire le maiuiscole e le minuscole

// const countVocali1 = (string) => {
//     let count = 0;
//     for (let i = 0; i < string.length; i++) {
//         if (string.charAt(i).match(/[aeiou]/i && /[AEIOU]/i)) {
//             count++;
//         }
//     }
//     return count;
// }

// console.log(countVocali1("Tizio Caio Sempronio Massimo"));

// //alternativa

// const countVocali2 = (string) => {
//     let vocals = ["a", "e", "i", "o", "u"];
//     let count = 0;
//     const stringLower = string.toLowerCase();
//     for (let i = 0; i < stringLower.length; i++) {
//         if (vocals.includes(stringLower.charAt(i))) {
//             count++;
//         }
//     }
//     return count;
// }

// console.log(countVocali2("Massimo Decimo Meridio"));

// //Esercizio CodeWars

// // For a given string s find the character c (or C) with longest consecutive repetition and return:
// // [c, l]
// // If there are two or more characters with the same l return the first in order of appearance.

// // For empty string return: ["", 0]

function longestRepetition(s) {
  let mostRecursiveChar = "";
  let mostCounted = 0;
  let currentChar = "";
  let currentCount = 0;

  for (let i = 0; i < s.length; i++) {
    if (s[i] === currentChar) {
      currentCount++;
    } else {
      if (currentCount > mostCounted) {
        mostRecursiveChar = currentChar;
        mostCounted = currentCount;
      }
      currentChar = s[i];
      currentCount = 1;
    }
  }

  if (currentCount > mostCounted) {
    mostRecursiveChar = currentChar;
    mostCounted = currentCount;
  }

  return [mostRecursiveChar, mostCounted];
}

console.log(longestRepetition("aaaabb"));

// //Esercizio CodeWars2

// // Write a function that takes a string of braces, and determines if the order of the braces is valid. It should return true if the string is valid, and false if it's invalid.

// // All input strings will be nonempty, and will only consist of parentheses, brackets and curly braces: ()[]{}.

function validBraces(braces) {
  let stack = [];
  let openBraces = ["(", "[", "{"];
  let closeBraces = [")", "]", "}"];
  for (let i = 0; i < braces.length; i++) {
    if (openBraces.includes(braces[i])) {
      stack.push(braces[i]);
    } else if (closeBraces.includes(braces[i])) {
      if (stack.length === 0) {
        return false;
      }
      let last = stack.pop();
      if (openBraces.indexOf(last) !== closeBraces.indexOf(braces[i])) {
        return false;
      }
    }
  }
  return stack.length === 0;
}

console.log(validBraces("(){}[]"));

// //Esercizio CodeWars3

// add chain 

function add(n){
    const sum = n;
    
    const next = next => add(sum + next);
    
    next.valueOf = () => sum; 
    
    return next;
  };

    console.log(add(1)(2)(3)(4)(5).valueOf());

// //Esercizio CodeWars4

// For a given string s find the character c (or C) with longest consecutive repetition and return:

// [c, l]
// where l (or L) is the length of the repetition. If there are two or more characters with the same l return the first in order of appearance.

// For empty string return:

// ["", 0]

function longestRepetition(s) {
    let longestChar = "";
    let longestCount = 0;
    let currentChar = "";
    let currentCount = 0;
  
    for (let i = 0; i < s.length; i++) {
      if (s[i] === currentChar) {
        currentCount++;
      } else {
        if (currentCount > longestCount) {
          longestChar = currentChar;
          longestCount = currentCount;
        }
        currentChar = s[i];
        currentCount = 1;
      }
    }
  
    if (currentCount > longestCount) {
      longestChar = currentChar;
      longestCount = currentCount;
    }
  
    return [longestChar, longestCount];
  }

    console.log(longestRepetition("aaaabb"));

    