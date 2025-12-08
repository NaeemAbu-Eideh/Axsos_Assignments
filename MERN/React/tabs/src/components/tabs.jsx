import React, {useState} from "react";

const tabs = () => {
    const [tab1, setTab1] = useState("true");
    const [tab2, setTab2] = useState("false");
    const [tab3, setTab3] = useState("false");
    const [text, setText] = useState("Tab 1 is showing now");
    const changeText = (element) => {
        if(element.target.name === "Tab1"){
            setTab1("true");
            setTab2("false");
            setTab3("false");
            setText("Tab 1 is showing now")
        }
        else if(element.target.name === "Tab2"){
            setTab1("false");
            setTab2("true");
            setTab3("false");
            setText("Tab 2 is showing now")
        }
        else{
            setTab1("false");
            setTab2("false");
            setTab3("true");
            setText("Tab 3 is showing now")
        }
    }

    return (
        <>
            <div className={"w-200 mx-auto mt-10"}>
                <button name={"Tab1"} onClick={(e) => changeText(e)} id={"t1"} style={{backgroundColor: tab1 === "true"? "black":"white" , color: tab1 === "true"? "white":"black"}} className={"border ml-3 w-50 h-10"}>Tab1</button>
                <button name={"Tab2"} onClick={(e) => changeText(e)} id={"t2"} style={{backgroundColor: tab2 === "true"? "black":"white" , color: tab2 === "true"? "white":"black"}} className={"border ml-3 w-50 h-10"}>Tab2</button>
                <button name={"Tab3"} onClick={(e) => changeText(e)} id={"t3"} style={{backgroundColor: tab3 === "true"? "black":"white" , color: tab3 === "true"? "white":"black"}} className={"border ml-3 w-50 h-10"}>Tab3</button>
            </div>
            <div className={"border w-200 mx-auto h-50 mt-8"}>
                <p>{text}</p>
            </div>
        </>
    );
}

export default tabs;