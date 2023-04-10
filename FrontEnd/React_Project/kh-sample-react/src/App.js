import './App.css';

function App() {
  const name = "리액트";
  // 리액트에서 DOM 요소에 스타일을 적용할 때는 문자열 형태가 아닌 객체 형태로 넣어야함
  // 스타일 이름 중에서 background-color 처럼 하이폰이 포함되어 있으면 카멜 표기법으로 변경해야 합니다

  const style = {
    backgroundColor:"#222",
    color:"royalBlue",
    fontSize:"2em"
  };

  const member = {
    name:"안유진",
    job:"개발자",
    addr:"경기도 수원시",
    gender:"여성"
  };

  function getGeeting(user){
    return (user) ? (<h1>환영합니다 {member.name}</h1>) : (<h1>환영합니다 방문자님</h1>);
  }

  //다항연산자와 AND연산자 사용가능
  // 다항연산자를 사용해서 참인 조건과 거짓인 조건에 대해 렌더링
  // AND 연산자를 이용한 조건부 렌더링
  return (
    //class 키워드는 JSX 문법에서는 className 으로 변경해야함(카멜표기법)
    <div className="App">
      {/* {name === "리액트" ? (<h1>리액트 입니다</h1>) : (<h1>리액트가 아닙니다</h1>)} */}
      {name === "리액트" && <h1 style={style}>리액트 화면을 갱신합니다....</h1> }

      <p className="title-name">안녕하세요. 저는 {member.name} 입니다</p>
      <p className="title-name">직업은 {member.job} 입니다</p>
      <p className="title-name">주소는 {member.addr} 입니다</p>
      <p className="title-name">성별은 {member.gender} 입니다</p>

      <div>{getGeeting(true)}</div>
    </div>
  );
}

export default App;
