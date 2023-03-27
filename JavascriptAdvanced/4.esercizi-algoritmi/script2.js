// // calcolare l'ipotenusa di un triangolo rettangolo di cateti 3 e 4. Potete usare Math
// const cateto1 = 3;
// const cateto2 = 4;

// function calcIpotenusa(cateto1, cateto2) {
//     return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2)    
// }

// const ipotenusa = calcIpotenusa(cateto1, cateto2)
// console.log(ipotenusa);

// // -----------------------------------------------------------

// //scrivere una funzione che trasformi un nome nelle sue iniziali "Tizio Caio" => T.C.

// function onlyInitials(nome) {
//     let nomeSplittato = nome.split(" ");

//     let iniziali = "";
//     for (let i = 0; i < array.length; i++) {
//         const singoloChar = nomeSplittato[i];
                
//     }
// }

function longestWord(string) {
    return string.split(" ")
      .reduce((longest, word) => {
        return word.length > longest.length ? word : longest;
      }, "");
  }

  console.log(longestWord("ciao commmme stai?"));