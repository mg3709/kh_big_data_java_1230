import React from "react";
import { useNavigate } from "react-router-dom";

const About = () => {

    const nav = useNavigate();

    return(
        <>
            <h1>소개 페이지 입니다</h1>
            <p>리액트 라우터를 사용해 보는 프로젝트입니다</p>
            <button onClick={() => nav(-1)}>뒤로가기</button>
        </>
    );
}

export default About;