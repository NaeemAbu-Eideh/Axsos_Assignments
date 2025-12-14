import React, { useState, useEffect } from "react";
import "./App.css";
import axios from "axios";
import Form from "./components/form.jsx";
import { Routes, Route } from "react-router-dom";
import Data from "./components/data.jsx";

function App() {
    const [persons, setPersons] = useState({});
    const [planets, setPlanets] = useState({});

    useEffect(() => {
        axios.get("https://swapi.dev/api/people").then((response) => {
            setPersons(response.data);
        });

        axios.get("https://swapi.dev/api/planets").then((response) => {
            setPlanets(response.data);
        });
    }, []);

    return (
        <>
            <Form />

            <Routes>
                <Route path="/" element={""} />
                <Route
                    path="/:section/:id"
                    element={<Data planets={planets} persons={persons} />}
                />
            </Routes>
        </>
    );
}

export default App;
