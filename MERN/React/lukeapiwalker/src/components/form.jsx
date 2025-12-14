import React, { useState } from "react";
import { useNavigate } from "react-router-dom";

const Form = () => {
    const [section, setSection] = useState("people");
    const [id, setId] = useState("");
    const navigate = useNavigate();

    const addRout = (e) => {
        e.preventDefault();
        navigate(`/${section}/${id}`); // ✅ فوري
    };

    return (
        <div className="flex w-200 mx-auto mt-20 items-center justify-center">
            <p className="text-[1.3em] mr-3">Search for:</p>

            <select
                value={section}
                onChange={(e) => setSection(e.target.value)}
                className="mr-4 border w-40 text-center"
            >
                <option value="people">People</option>
                <option value="planets">Planets</option>
            </select>

            <p className="text-[1.3em] mr-3">ID:</p>

            <input
                className="w-30 border rounded-lg mr-4 pl-2"
                type="text"
                value={id}
                onChange={(e) => setId(e.target.value)}
            />

            <button
                className="border rounded-lg bg-blue-500 h-12 px-5 border-white hover:bg-blue-800 hover:border-2 hover:border-black"
                onClick={addRout}
            >
                Search
            </button>
        </div>
    );
};

export default Form;
