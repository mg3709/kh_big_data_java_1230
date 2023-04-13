import React, {useState} from 'react';
import './App.css';
//연습문제
// -이름, 직책, 회사명, 회사주소, 이메일, 전화번호를 입력 받아 명함 형태로 출력
// -명함은 객체 리터럴로 관리
// -입력값의 변경은 useState 사용
// -제출 버튼을 만들어서 제출 누르면 명함 형태로 출력

const NameCard = (props) => {
    return(
        <>
            <h3>명함 정보</h3>
            <p>이름 : {props.member.name}</p>
            <p>직책 : {props.member.position}</p>
            <p>회사 : {props.member.company}</p>
            <p>주소 : {props.member.addr}</p>
            <p>메일 : {props.member.eMail}</p>
            <p>전화 : {props.member.phone}</p>
        </>
    );
}

const Test = () => {

    const [member, setMember] = useState({
        name:"",
        position:"",
        company:"",
        addr:"",
        eMail:"",
        phone:""
    });

    const [submit, setSubmit] = useState(false);

    const onChangeName = (e) => setMember({...member, name:e.target.value});
    const onChangePos = (e) => setMember({...member, position:e.target.value});
    const onChangeComp = (e) => setMember({...member, company:e.target.value});
    const onChangeAddr = (e) => setMember({...member, addr:e.target.value});
    const onChangeMail = (e) => setMember({...member, eMail:e.target.value});
    const onChangePhone = (e) => setMember({...member, phone:e.target.value});

    const onSubmit = () => {
        setSubmit(true);
    }

    return(
        <>
            <h1>회원 정보 가입</h1>
            <input type="text"  placeholder="이름 입력" value={member.name} onChange={onChangeName} />
            <br />
            <input type="text" placeholder="직책 입력" value={member.position} onChange={onChangePos} />
            <br />
            <input type="text" placeholder="회사 입력" value={member.company} onChange={onChangeComp} />
            <br />
            <input type="text" placeholder="주소 입력" value={member.addr} onChange={onChangeAddr} />
            <br />
            <input type="email" placeholder="메일 입력" value={member.eMail} onChange={onChangeMail} />
            <br />
            <input type="tel" placeholder="폰 입력" value={member.phone} onChange={onChangePhone} />
            <br />
            <button onClick={onSubmit}>제출</button>
            {submit && <NameCard member={member}/>}
            
        </>
    );
}

export default Test;