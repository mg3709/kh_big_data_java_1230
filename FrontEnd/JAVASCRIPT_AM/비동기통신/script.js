//객체 생성
const xhr = new XMLHttpRequest();
xhr.open("POST", "URL 경로");//IP주소, PORT 번호, 백앤드가 수신할 컨트롤러
xhr.setRequestHeader("content-type", "application/json");

const data = {
    id:100,
    title: "비동기 통신 연습 하기",
    author: "곰돌이사육사"
};

xhr.send(JSON.stringify(data)); // JSON.stringify를 통해 오브젝트를 문자열 형태로 변경해서 전송

