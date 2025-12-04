

import './App.css'
import PersonCard from "./components/PersonCard.jsx";

function App() {
    return (
    <>
        <PersonCard firstname={"Doe"} lastname={"Jane"} age = {45} hairColor = {"Black"}/>
        <PersonCard firstname={"Smith"} lastname={"John"} age = {88} hairColor = {"Brown"}/>
        <PersonCard firstname={"Fillmore"} lastname={"Millard"} age = {50} hairColor = {"Brown"}/>
        <PersonCard firstname={"Smith"} lastname={"Maria"} age = {62} hairColor = {"Brown"}/>
    </>
  )
}

export default App
