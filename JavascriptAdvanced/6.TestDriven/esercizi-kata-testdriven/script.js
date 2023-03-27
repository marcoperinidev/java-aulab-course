//SPLIT STRING

// Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').

// Examples:

// * 'abc' =>  ['ab', 'c_']
// * 'abcdef' => ['ab', 'cd', 'ef']


function solution(str) {
    const finalArr = [];
  
    for (let i = 0; i < str.length; i += 2) {
      finalArr.push(str.slice(i, i + 2).padEnd(2, "_"));
    }
  
    return finalArr;
  }

//SHORT VARIATION NON MIA

function solution(str){
    return (str.length % 2 ? str + '_' : str).match(/../g);
  }

//UNIQUE IN ORDER

// Implement the function unique_in_order which takes as argument a sequence and returns a list of items without any elements with the same value next to each other and preserving the original order of elements.

// For example:

// uniqueInOrder('AAAABBBCCDAABBB') == ['A', 'B', 'C', 'D', 'A', 'B']
// uniqueInOrder('ABBCcAD')         == ['A', 'B', 'C', 'c', 'A', 'D']
// uniqueInOrder([1,2,2,3,3])       == [1,2,3]

  var uniqueInOrder = function(iterable){
    if (!Array.isArray(iterable)){
      iterable = iterable.split('');
    }
    const result = [];
    
    iterable.forEach((char, index) => {
      if (char !== iterable[index -1]) {
        result.push(char)
      }
    });
    return result;
  }

//SHORT VARIATION NON MIA

var uniqueInOrder=function(iterable){
    return [...iterable].filter((a, i) => a !== iterable[i-1])
  }

  //NEGATIVE CONNOTATION

// You will be given a string with sets of characters, (i.e. words), seperated by between one and three spaces (inclusive).

// Looking at the first letter of each word (case insensitive-"A" and "a" should be treated the same), you need to determine whether it falls into the positive/first half of the alphabet ("a"-"m") or the negative/second half ("n"-"z").

// Return True/true if there are more (or equal) positive words than negative words, False/false otherwise.

// "A big brown fox caught a bad rabbit" => True/true
// "Xylophones can obtain Xenon." => False/false

function connotation(str) {
    const letters = 'abcdefghijklmnopqrstuvwxyz'; //creo una stringa con tutte le lettere dell'alfabeto
    const arr = str.toLowerCase().split(' '); //splitto la stringa in un array di parole e le metto in minuscolo
    const result = []; //creo un array vuoto dove pushare i valori numerici delle lettere
    
    arr.forEach(word => { //per ogni parola nell'array arr ciclo 
      if(word.length > 0 /*Testing for "pefjnqp": expected true to equal false*/){
        result.push(letters.indexOf(word[0])); //pusho nell'array result il valore numerico della lettera iniziale della parola
      }
      });
    
    const positive = result.filter(num => num <= 12).length; //filtro result e pusho in positive i valori minori o uguali a 12
    const negative = result.filter(num => num >= 13).length; //filtro result e pusho in negative i valori maggiori o uguali a 13
    
    return positive >= negative; //ritorno true se positive è maggiore o uguale a negative
  }

   
//short variation NON MIA

function connotation(str) {
    let positiveMatches = str.match(/\b[a-m]/ig) || []
    let negativeMatches = str.match(/\b[n-z]/ig) || []
    return positiveMatches.length >= negativeMatches.length
  }
