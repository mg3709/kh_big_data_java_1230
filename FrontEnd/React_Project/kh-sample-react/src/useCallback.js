import React, {useState, useMemo, useCallback} from "react";

// useCallback : 렌더링 최적화를 위해 사용, 렌더링을 최적화해야 할 상황에서 사용하며, 만들어 놓은 함수를 재사용하는 방법

//일반적인 구현 방식
const Average = () => {

    const [list, setList] = useState([]);
    const [number, setNumber] = useState("");

    const onChange = useCallback(e => {
        setNumber(e.target.value)
    },[])//빈 배열을 넣으면 처음 렌더링될 때만 함수 호출

    const onInsert = useCallback(() => {
        //현재 입력 받은 숫자를 기존의 리스트에 추가(concat 으로 추가 했으므로 새로운 배열이 생성됨. 불변성의 원칙)
        const nextList = list.concat(parseInt(number));
        setList(nextList);
        setNumber("");
    },[number, list])
    
    const getAverage = (numbers) => {
        console.log("평균값 계산 중..");
        
        if(numbers.length === 0) return 0;

        const sum = numbers.reduce((a, b) => a + b);

            return sum / numbers.length;

    }

    const avg = useMemo(() => getAverage(list), [list]);

    return(
        <>
            <input type="text" value={number} onChange={onChange}/>
            <button onClick={onInsert}>등록</button>
            <ul>
                {list.map((value, index) => <li key={index}>{value}</li>)}
            </ul>
            <div>
                <b>평균값 : {getAverage(list)}</b>
                <b>평균값 : {avg}</b>
            </div>
        </>
    );
}

export default Average;