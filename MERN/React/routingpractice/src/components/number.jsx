import React from "react";
import {useParams} from "react-router-dom";

const Number = () => {
    const {number} = useParams();
    return (
        <>
            <h1 className={"font-bold text-center mt-10 text-3xl"}>The number is: {number}</h1>
        </>
    );
}

export default Number;