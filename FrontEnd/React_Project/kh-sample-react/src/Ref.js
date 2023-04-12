import React, {useRef} from 'react';

const CreateRef = () => {
    const inputRef = useRef(null);//userRef() 함수 호출하기
    const handleFocus = () => {
        inputRef.current.disabled = false;
        inputRef.current.focus();
    }

    return(
        <>
            <input disabled type='text' ref={inputRef}></input>
            <button onClick={handleFocus}>활성화</button>
        </>
    );
}

export default CreateRef;