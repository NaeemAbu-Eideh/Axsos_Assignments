import React from "react";


const Form = (props) => {
    const {tags, setTags} = props;

    const addColor = ()=>{
        let color = document.getElementById("color").value;
        setTags(tags => [...tags, color]);
        document.getElementById("color").value = "";
    }

    return (
        <>
            <div className="w-200 mx-auto flex justify-between mt-20">
                <lable className="text-2xl mr-3">Color</lable>
                <input id = "color"  type="text" className="border border-black w-100 bg-gray-300  pl-3"/>
                <button onClick={() => addColor()} className="rounded-2xl bg-blue-500 hover:bg-blue-800 text-white w-20 h-10">Click</button>
            </div>
        </>
    )
}

export default Form;