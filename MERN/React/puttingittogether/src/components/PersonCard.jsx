import React, {useState} from 'react'

const PersonCard = (props) => {
    const {firstname, lastname, age, hairColor, birthdayText} = props;

    const [state, setState] = useState({
        birthday: age
    });

    const increment = () => {
        setState({
            birthday: state.birthday + 1,
        });
    }

    return (
        <>
            <h1>{firstname}, {lastname}</h1>
            <p>Age: {state.birthday}</p>
            <p>Hair Color: {hairColor}</p>
            <button onClick={increment} >{birthdayText}</button>
        </>
    );
}

export default PersonCard;