import './App.css'
import {Routes, Route} from "react-router-dom";
import Welcome from "./components/welcome.jsx";
import Number from "./components/number.jsx";
import Word from "./components/word.jsx";

function App() {
    return (
    <>
        <Routes>
            <Route path="/" element={<Welcome/>} />
            <Route path="/:number" element={<Number/>} />
            <Route path="/:word" element={<Word/>} />
            <Route path="/:word/:color" element={<Word/>} />
            <Route path="/:word/:textColor/:bgColor" element={<Word/>} />
        </Routes>
    </>
  )
}

export default App
