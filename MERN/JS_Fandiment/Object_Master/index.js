const pokémon = Object.freeze([
    { id: 1,   name: "Bulbasaur",    types: ["poison", "grass"] },
    { id: 5,   name: "Charmeleon",   types: ["fire"] },
    { id: 9,   name: "Blastoise",    types: ["water"] },
    { id: 12,  name: "Butterfree",   types: ["bug", "flying"] },
    { id: 16,  name: "Pidgey",       types: ["normal", "flying"] },
    { id: 23,  name: "Ekans",        types: ["poison"] },
    { id: 24,  name: "Arbok",        types: ["poison"] },
    { id: 25,  name: "Pikachu",      types: ["electric"] },
    { id: 37,  name: "Vulpix",       types: ["fire"] },
    { id: 52,  name: "Meowth",       types: ["normal"] },
    { id: 63,  name: "Abra",         types: ["psychic"] },
    { id: 67,  name: "Machamp",      types: ["fighting"] },
    { id: 72,  name: "Tentacool",    types: ["water", "poison"] },
    { id: 74,  name: "Geodude",      types: ["rock", "ground"] },
    { id: 87,  name: "Dewgong",      types: ["water", "ice"] },
    { id: 98,  name: "Krabby",       types: ["water"] },
    { id: 115, name: "Kangaskhan",   types: ["normal"] },
    { id: 122, name: "Mr. Mime",     types: ["psychic"] },
    { id: 133, name: "Eevee",        types: ["normal"] },
    { id: 144, name: "Articuno",     types: ["ice", "flying"] },
    { id: 145, name: "Zapdos",       types: ["electric", "flying"] },
    { id: 146, name: "Moltres",      types: ["fire", "flying"] },
    { id: 148, name: "Dragonair",    types: ["dragon"] }
]);


//an array of pokémon objects where the id is evenly divisible by 3

arr1 = pokémon.filter(pok => pok.id % 3 === 0 );
console.log(arr1);


//an array of pokémon objects that are "fire" type

arr2 = pokémon.filter(pok => pok.types.includes('fire'));
console.log(arr2);

//an array of pokémon objects that have more than one type

arr3 = pokémon.filter(pok => pok.types.length > 1);
console.log(arr3);

//an array with just the names of the pokémon

arr4 = pokémon.map(pok => pok.name);
console.log(arr4);

//an array with just the names of pokémon with an id greater than 99

arr5 = pokémon.filter(pok=> pok.id > 99);
arr5 = arr5.map(pok => pok.name);
console.log(arr5);

// an array with just the names of the pokémon whose only type is poison

arr6 = pokémon.filter(pok => pok.types.length === 1);
arr6 = arr6.filter(pok => pok.types.includes('poison'));
console.log(arr6);


//an array containing just the first type of all the pokémon whose second type is "flying"

arr7 = pokémon.filter(pok => pok.types.length >1);
arr7 = arr7.filter(pok => pok.types.includes('flying'));
arr7 = arr7.map(pok => pok.types[0]);
console.log(arr7);

//a count of the number of pokémon that are "normal" type
arr8 = pokémon.filter(pok => pok.types.includes('normal'));
console.log(arr8.length);