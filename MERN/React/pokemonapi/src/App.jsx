import React, {useState} from 'react';
import './App.css'



function App() {
    const [poks, setPoks] = useState([]);

    const fetchData = async () => {
        let arr =  []
        let response = await fetch("https://pokeapi.co/api/v2/ability/battle-armor");
        const data = await response.json();
        const pokemon = data.names;
        for (let i = 0; i < pokemon.length; i++) {
            arr.push(pokemon[i]['name']);
        }
        setPoks(arr);
        console.log(poks);
    };
  return (
    <>
        <button onClick={() => fetchData()}>Fetch Pokemon</button>
        <ul>
            {
                poks.map((pok) => (
                    <li>{pok}</li>
                ))
            }
        </ul>
    </>
  )
}

export default App
