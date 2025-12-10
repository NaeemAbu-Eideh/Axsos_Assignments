import React from "react";
import {useParams} from "react-router-dom";

const Word = () => {
    const {word, color, textColor, bgColor} = useParams();
    return (
        <>
            <h1 style={{color: color !== undefined? color : textColor, backgroundColor: bgColor !== undefined? bgColor: "white"}} className={"font-bold text-center mt-10 text-3xl"}>The word is: {word}</h1>
        </>
    );
}

export default Word;