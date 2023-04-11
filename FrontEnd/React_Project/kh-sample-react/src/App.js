import { Fragment } from 'react';
import './App.css';
// import Section from "./컴포넌트합성";
// import MyCompoment from './MyCompoment';
// import Person from './Person';
import Say from './Say';
// import Clock from './Clock';


// 컴포넌트는 항상 대문자로 시작하고, 반환값으로 UI요소를 반환함
// function WelcomeProps(dd){
//   return (
//   <>
//     <h1>Hello, {dd.age}</h1>
//     <p>안녕하세요. {dd.name}님.</p>
//     <p>화창한 봄날을 맞이하여 아래와 같이 행사를 진행 하고자 합니다</p>
//     <p>오셔서 자리를 빛내 주시기 바랍니다.</p>
//   </>
//   );
// }

function App() { 
  // 화살표 함수로도 선언 가능
  // const App = () => {

  // let insideTag = "운동하기";

  // const personData = {
  //   name:"곰돌이사육사",
  //   age:18,
  //   gender:"남성"
  // };

  return (
    <>
      {/* <WelcomeProps name="곰돌이사육사" age="20"/>
      <WelcomeProps name="아이브" age="21"/>
      <WelcomeProps name="르세라핌" age="21"/> */}

      {/* <Section title="오늘의 날씨" content="오늘은 흐리고 돌풍이 예상됩니다."/>
      <Section title="오늘의 스포츠" content="LG vs 두산 경기가 잠실에서 열립니다"/> */}

      {/* <MyCompoment name="곰돌이사육사">{insideTag}</MyCompoment> */}

      {/* <Person {...personData}/> */}

      <Say/>

      {/* <Clock/> */}

    </>
  );
}

export default App;
