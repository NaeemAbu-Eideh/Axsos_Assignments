import React from "react";
import {useParams} from "react-router-dom";

const Word = () => {
    const {word, color} = useParams();
    return (
        <>
            <h1 style={{backgroundColor: color !== undefined? color : "white", color: color!== undefined? ( color === "black"? "white":"black" ) : "black"}} className={"font-bold text-center mt-10 text-3xl"}>The word is: {word}</h1>
        </>
    );
}

export default Word;