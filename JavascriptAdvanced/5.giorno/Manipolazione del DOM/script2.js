//! DOM -> Document Object Model
// console.dir(document)

//! html, head, body
//* prendere gli elementi
// let title = document.querySelector('#title');
// console.log(title.style.backgroundColor)
// title.style.backgroundColor = 'green';

//* addEventListener
//* collegare un evento ( un'azione che avviene nel browser ( click, mousover, moueleave))
// let btn = document.querySelector('#btn');
// function onclickfunction() { console.log('cliccato') }
// btn.addEventListener('click', onclickfunction)

//* innerHTML -> ci permette di modicifare il contenuto di HTML di un tag
// let title = document.querySelector('#title');
// setTimeout(() => {
//     title.innerHTML = 'ciaone';
// }, 3000);
//* createElement
let games;

fetch('https://api.rawg.io/api/games?key=9af72c943356453fb08b37b3f1f9a18a')
    .then(resp => resp.json())
    .then(data => {
        console.log('dati arrivati')
        renderGames(data.results);
        games = data.results;
        renderCategories(data.results)
    });

  function renderGames(games){
    let gamescontainer = document.querySelector('#gamescontainer');
    gamescontainer.innerHTML = '';
    console.log(games[0]);
    games.forEach(game => {
        let col = document.createElement('div');
        col.classList.add('col-12', 'col-md-6', 'col-lg', 'my-2', 'gy-3', 'px-2');
        col.innerHTML = `
            <div class="card h-100" style="width: 18rem;">
                <img src="${game.background_image
                }" class="card-img-top" alt="${game.name}">
                <div class="card-body">
                    <h5 class="card-title">${game.name}</h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="#" class="btn btn-primary">Go somewhere</a>
                </div>
            </div>
        `;
        gamescontainer.appendChild(col);
    });
  }

  function renderCategories(games){
    //! una lista di categorie senza ripetizioni
    let categories = Array.from(
            new Set(games.map(game => game.genres)
                .map(el => el.map(x => x.name))
                .flat())
        )
    let categorycontainer = document.querySelector('#categorycontainer');
    categories.forEach(category => {
        let li = document.createElement('li');
        li.classList.add("dropdown-item", "category-items");
        li.innerHTML = category;
        categorycontainer.appendChild(li)
        li.addEventListener('click',() => filterGamesByCategory(category))
    })
  }

  function filterGamesByCategory(category) {
        let filteredGames = games.filter(game => {
            return game.genres.some(genre => genre.name.toLowerCase() === category.toLowerCase());
        });
        console.log("Filtered Games:",filteredGames);
        renderGames(filteredGames);
    }
