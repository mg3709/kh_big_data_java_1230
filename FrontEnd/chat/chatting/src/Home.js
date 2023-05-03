import React from "react";
import { useNavigate } from "react-router-dom";

const Home = () => {

    const nav = useNavigate();

    return(
        <>
            <h1>Home</h1>
            <button onClick={() => nav("/Chat")}>입장하기</button>
        </>
    );
}

export default Home;