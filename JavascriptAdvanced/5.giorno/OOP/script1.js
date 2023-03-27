//! Object oriented
//* tipo di dato
//* 1. attributi
//* 2. metodi

//* attributi sono i dati conservati all'interno dell'oggetto
//* metodi sono le azioni che questo oggetto può compiere

//! Object literals
// let smartphone = {
//     //! attributi / proprietà
//     //* chiave:valore
//     //* le chiavi possono essere stringhe
//     'nome telefono': 'Samsung Galaxy S22',
//     'memoria' : 12,
//     'connettore': 'Type-C',
//     'rubrica': [
//         {'nome': 'Valerio', 'numero': '333333'},
//         {'nome': 'Silvia', 'numero': '4444444'}
//     ],
//     //! metodi
//     'stampaNome': function () {
//         console.log(this['nome telefono'])
//     },
//     'stampaRubrica': function() {
//         this.rubrica.forEach(contact => console.log(`${contact['nome']} : ${contact['numero']}`));
//     }
// }

//* ciclare gli oggetti
// for(key in smartphone){
//     console.log(smartphone[key])
// }

//* Object reference
// let stringa1 = "hello";
// let stringa2 = stringa1;
// console.log(stringa1, stringa2)
// stringa2 = "ciao"
// console.log(stringa1, stringa2)
// let user = {
//     name: "John"
// }
// let user2 = user;
// user2.name = "pippo";
// user2.surname = "ciccio";
// console.log(user);

//* confronto tra oggetti
// let user = {
//     name: "John"
// }
// let user2 = user;
// console.log(user == user2);

// let user1 = {
//     name: "john",
//     isEqualInValues: function(obj){
//         for(key in this){
//             console.log(obj[key]);
//             if(obj[key] == undefined){
//                 return false;
//             }
//         }
//         return true;
//     },
//     isEqual: function(obj){

//     }
//  };
// let user2 = {
//     name: "john",
//     isEqualInValues: function(obj){
//         for(key in this){
//             console.log(obj[key]);
//             if(obj[key] == undefined){
//                 return false;
//             }
//         }
//         return true;
//     }
// };
// // console.log(user1.isEqual(user2))
// console.log(user1.hasOwnProperty('name'));

// function confrontaOggetti(obj1, obj2) {
//     // Controlla se il numero di proprietà è uguale
//     if (Object.keys(obj1).length !== Object.keys(obj2).length) {
//       return false;
//     }

//     // Controlla ogni proprietà e valore
//     for (let prop in obj1) {
//       if (obj1.hasOwnProperty(prop)) {
//         if (!obj2.hasOwnProperty(prop)) {
//           return false;
//         }

//         if (obj1[prop] !== obj2[prop]) {
//           return false;
//         }
//       }
//     }

//     return true;
//   }

// let user = {
//     name: "Andrea",
//     surname: "Mininni",
//     age: 29,
//     fiscalCode: "MNNNDR94..."
// }

// function calcolaCose(user){
//    let clone = {};
//    //for(let key in user) clone[key] = user[key];
//     Object.assign(clone, user);
//     console.log(clone)
// }

// calcolaCose(user)

//! funzione -> ES5
//* dichiarazione di una classe tramite funzione senza parametri
// function persona() {
//     this.nome = "asdasd",
//     this.cognome = "";
//     this.email = ""
//     this.mostranome = function () { console.log(this.nome); }
// }
// const p1 = new persona();
// const p2 = new persona();
// p2.mostranome()

//* dichiarazione di una classe tramite funzione con parametri
// function persona(name, surname){
//     this.name = name;
//     this.surname = surname;
//     this.email = name + '.' + surname +'@gmail.com';
//     this.mostranome = function () { console.log(this.name); }
// }

// const p1 = new persona("Andrea", "Mininni");
// console.log(p1)
// let currentuserIsAdmin = true;
// //! ES6
// class Person {
//     //! attributi
//     #name;
//     #surname;
//     //! metodi
//     constructor(name, surname){
//        this.setName(name);
//        this.setSurname(surname);
//     }
//     getName() { //* Getter -> ci permette di accedere ad una proprietà
//         if(currentuserIsAdmin) return this.#name;
//         return "non puoi accedere perché non sei admin";
//     }
//     getSurname() { //* Getter -> ci permette di accedere ad una proprietà
//         if(currentuserIsAdmin) return this.#surname;
//         return "non puoi accedere perché non sei admin";
//     }
//     setName(value){ //* Setter -> ci permette di assegnare un valore ad una proprietà
//         if(value == ""){
//             throw Error ("Non puoi assegnare una stringa vuota all'attributo name")
//         }
//         this.#name = value;
//     }
//     setSurname(value){ //* Setter -> ci permette di assegnare un valore ad una proprietà
//         if(value == ""){
//             throw Error ("Non puoi assegnare una stringa vuota all'attributo surname")
//         }
//         this.#surname = value;
//     }
// }
// //* incapsulato il modo in cui costruisco ( setto ) gli attributi
// //* inversion of control
// const p1 = new Person("Pippo", "Ciccio");
// // console.log(p1.name)


// function persona(nome, cognome) {
// 	this.nome = nome;
// 	this.cognome = cognome;
// 	this.indirizzo = "";
// 	this.email = "";
// 	this.mostraNomeCompleto = function() {};
// 	this.calcolaCodiceFiscale = function() {};
// }

// const p1 = new persona("Pippo", "Baudo");
// const p2 = new persona("Pluto", "Disney");

// Array.prototype.add = function(el){
//     if(!this.includes(el)){
//         this.push(el);
//     }
// }
// Array.prototype.printAll = function(){
//     this.forEach(el => console.log(el))
// }
// let arr = ["Andrea", "Marco", "Fabrizio"];
// arr.printAll()
// console.log(Object.getPrototypeOf(arr.__proto__))
// Object.prototype.isEqualInValues = function (obj2) {
//     // Controlla se il numero di proprietà è uguale
//     if (Object.keys(this).length !== Object.keys(obj2).length) {
//       return false;
//     }

//     // Controlla ogni proprietà e valore
//     for (let prop in this) {
//       if (this.hasOwnProperty(prop)) {
//         if (!obj2.hasOwnProperty(prop)) {
//           return false;
//         }

//         if (this[prop] !== obj2[prop]) {
//           return false;
//         }
//       }
//     }

//     return true;
//   }

//   let user = {
//     name : 'John'
//   }
//   let user2 = {
//     name : 'Pippo'
//   }

//   console.log(user.isEqualInValues(user2))

//! PROXY
//* un oggetto che protegge un altro oggetto
//* oggetto da proteggere
// let persona = {
//     name: "Andrea",
//     surname: ""
// }
// let loggeduser = {
//     isAdmin:false
// }
// //* oggeto che protegge l'oggetto da proteggere
// //* controllare ciò che accade quando provo ad accedere ( inlettura e in scrittura ) ad una proprietà dell'oggetto che sto proteggendo
// let proxy = {
//     //* accedere in lettura -> get
//     //* target -> l'oggetto che stiamo proteggendo ( persona )
//     //* propertyName -> l'attributo a cui vogliamo accedere
//     get(target, propertyName){
//         if(loggeduser.isAdmin){
//             return target[propertyName]
//         }
//         throw Error ("TU NON PUOI PASSARE!");
//     },
//     //* accedere in scrittura -> set
//     set(target, propertyName, value){
//         let pwd = 'asd';
//         let insertPwd = prompt('inserisci la pwd');
//         console.log(value != '');
//         if(value != '' && pwd == insertPwd){
//             target[propertyName] = value;
//         } else {
//             throw Error ("FUGGITE SCIOCCHI!");
//         }
//     }
// }

// let personaProxata = new Proxy(persona, proxy);

// personaProxata.name = "Ciccio";
// console.log(persona.name)
