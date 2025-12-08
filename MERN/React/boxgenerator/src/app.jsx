import { useState } from 'preact/hooks'
import './app.css'
import Form from "./components/form.jsx";
import Divs from "./components/divs.jsx";

export function App() {
    const [tags, setTags] = useState([]);
  return (
    <>
        <Form tags = { tags } setTags={setTags} />
        <Divs tags={tags} />
    </>
  )
}
