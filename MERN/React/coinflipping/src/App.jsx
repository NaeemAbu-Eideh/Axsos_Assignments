import React, {useEffect, useRef} from 'react';
import './App.css'

function tossCoin() {
    return Math.random() <= 0.5 ? "tails" : "heads";
}
function fiveHeads() {
    return new Promise((resolve, reject) => {
        let trying = 0;
        let headCounter = 0;

        while (headCounter !== 5) {
            const head = tossCoin();
            if (head === "heads") {
                headCounter++;
            } else {
                headCounter = 0;
            }
            trying += 1;
        }

        if (trying <= 100) {
            resolve("successfully got 5 heads in a row after " + trying + " tries");
        } else {
            reject("failed, took more than 100 tries (" + trying + ")");
        }
    });
}

function App() {
    const hasRun = useRef(false);
    useEffect(() => {
        if (hasRun.current) return;
        hasRun.current = true;
        fiveHeads()
            .then( res => console.log(res) )
            .catch( err => console.log(err) );
        console.log( "When does this run now?" );

    }, []);

  return (
    <>

    </>
  )
}

export default App
