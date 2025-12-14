import React from "react";
import { useParams } from "react-router-dom";

const Data = (props) => {
    const { planets, persons } = props;
    const { section, id } = useParams();

    if (section === "people") {
        const person = persons?.results?.[id - 1];

        if (!person) {
            return <h1 className={"font-bold text-3xl mb-8 text-center mt-10"}>Person not found</h1>;
        }

        return (
            <div className={"w-100 mx-auto mt-10"}>
                <h1 className={"font-bold text-3xl mb-8"}>{person.name}</h1>
                <p className={"text-[1.3em] mb-3"}>Height: {person.height}</p>
                <p className={"text-[1.3em] mb-3"}>Mass: {person.mass}</p>
                <p className={"text-[1.3em] mb-3"}>Hair Color: {person.hair_color}</p>
                <p className={"text-[1.3em] mb-3"}>Skin Color: {person.skin_color}</p>
            </div>
        );
    }

    if (section === "planets") {
        const planet = planets?.results?.[id - 1];

        if (!planet) {
            return <h1 className={"font-bold text-3xl mb-8 text-center mt-10"}>Planet not found</h1>;
        }

        return (
            <div className={"w-100 mx-auto mt-10"}>
                <h1 className={"font-bold text-3xl mb-8"}>{planet.name}</h1>
                <p className={"text-[1.3em] mb-3"}>Climate: {planet.climate}</p>
                <p className={"text-[1.3em] mb-3"}>Terrain: {planet.terrain}</p>
                <p className={"text-[1.3em] mb-3"}>Surface Water: {planet.surface_water >= 1? "true" : "false"}</p>
                <p className={"text-[1.3em] mb-3"}>Population: {planet.population}</p>
            </div>
        );
    }


};

export default Data;
