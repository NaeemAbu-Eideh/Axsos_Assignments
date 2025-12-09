import React, {useState} from 'react';
import './App.css'
import axios from 'axios'



function App() {
    const [poks, setPoks] = useState([]);

    const axiosData = async () => {
        let arr =  []
        axios.get('https://pokeapi.co/api/v2/ability/battle-armor').then(response=>{
            const pokemon = response.data.names;
            for (let i = 0; i < pokemon.length; i++) {
                arr.push(pokemon[i]['name']);
            }
            setPoks(arr);
        })

    };
  return (
    <>
        <button onClick={() => axiosData()}>Fetch Pokemon</button>
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
