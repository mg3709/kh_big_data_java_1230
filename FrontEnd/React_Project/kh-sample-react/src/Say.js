import React, {useState} from "react";

// useState : 리액트 훅(Hook) 중 하나로, 함수형 컴포넌트에서 상태를 관리 할 수 있게 해줍니다
// 상태가 변경되면 화면을 렌더링 해줌

const Say = () => {
    const [message, setMessage] = useState('');
    const onClickEnter = () => setMessage("안녕하세요!!");
    const onClickLeave = () => setMessage("안녕히 가세요!!");
    const [color, setColor] = useState('black');

    return (
        <div>
            <button onClick={onClickEnter}>입장</button>
            <button onClick={onClickLeave}>퇴장</button>
            <h1 style={{color}}>{message}</h1>
            <button style={{color:'red'}} onClick={()=>setColor('red')}>빨간색</button>
            <button style={{color:'green'}} onClick={()=>setColor('green')}>초록색</button>
            <button style={{color:'blue'}} onClick={()=>setColor('blue')}>파란색</button>
        </div>
    );

};
export default Say;