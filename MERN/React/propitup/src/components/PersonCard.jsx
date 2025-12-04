import React, { Fragment } from 'react'

const PersonCard = (props) => {
    const {firstname, lastname, age, hairColor} = props;

    return (
        <>
            <h1>{firstname}, {lastname}</h1>
            <p>Age: {age}</p>
            <p>Hair Color: {hairColor}</p>
        </>
    );
}

export default PersonCard;