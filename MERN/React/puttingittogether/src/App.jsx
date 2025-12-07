import React from "react";
import './App.css'
import PersonCard from "./components/PersonCard.jsx";

function App() {
  return (
    <>
        <PersonCard firstname = "Doe" lastname = "Jan" age={45} hairColor={"Black"} birthdayText={"Birthday Button for Jan Doe"}/>
        <PersonCard firstname = "Smith" lastname = "John" age={88} hairColor={"Brown"} birthdayText={"Birthday Button for John smith"}/>
    </>
  )
}

export default App
