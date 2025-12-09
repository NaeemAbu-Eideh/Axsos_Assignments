import React, { useState } from 'react'
import './App.css'

function App() {
    const [list, setList] = useState([]);
    const [text, setText] = useState("");

    const addItem = (e) => {
        e.preventDefault();
        if (!text.trim()) return;
        setList([...list, { text: text, done: false }]);
        setText("");
    };

    const addTolist = (e) => {
        setText(e.target.value);
    };

    const deleteItem = (e, i) => {
        e.preventDefault();
        const arr = list.filter((_, index) => index !== i);
        setList(arr);
    };

    const changeBox = (i) => {
        setList(prev =>
            prev.map((item, index) =>
                index === i ? { ...item, done: !item.done } : item
            )
        );
    };

    return (
        <>
            <form className={"mb-10"} onSubmit={addItem}>
                <input value={text} onChange={addTolist} className="bg-gray-200 w-100 mr-4 h-10 border-black border-2 text-black" type="text"/>
                <button type="submit">Add</button>
            </form>

            {list.map((item, index) => (
                <div className="flex items-center" key={index}>
                    <p style={{textDecorationLine: item.done ? "line-through" : "none",}} className="text-white mr-7">{item.text}</p>
                    <input type="checkbox" checked={item.done} onChange={() => changeBox(index)} className={"mr-3"}/>
                    <button type="button" onClick={(e) => deleteItem(e, index)}>Delete</button>
                </div>
            ))}
        </>
    );
}

export default App;
