import React from "react";

//props 기본값 설정 : defaultProps
//porps 값을 따로 지정하지 않는 경우, 보여 줄 기본값을 설정합니다
// children : 태그사이의 내용을 전달 받아보여줌

//구조분해(비구조화할당) : 배열이나 객체의 속성 혹은 값을 해체하여 그 값을 변수에 담아 표현하는 자바스크립트 표현식
const MyCompoment = ({name, children}) => {
    // const {name, children} = props;
    return(
        <>
            <p>안녕하세요. 제이름은 {name} 입니다</p>
            <p>저의 취미는 {children} 입니다</p>
        </>
    )
}

MyCompoment.defaultProps = {
    name:"기본 이름"
}


export default MyCompoment;