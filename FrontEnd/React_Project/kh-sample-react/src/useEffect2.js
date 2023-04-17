import React, {useState, useEffect} from "react";

const EffectCnt = () => {
    const [count, setCount] = useState(0);

    useEffect(() => {
        
        document.title = `You clicked ${count} items`;

    },[count]);

    return(
        <>
            <p>You clicked {count} times</p>
            <button onClick={() => setCount(count + 1)}>Click me</button>
        </>
    );
}

export default EffectCnt;