// ajax
const xhr = new XMLHttpRequest(); //XMLHttpRequest 객체 생성
// HTTP 요청 방식 == POST : 리소스 생성 GET : 리소스 요청 PUT 리소스 수정 PATCH : 리소스 일부 수정 DELETE : 리소스 삭제
xhr.open("POST", "https://jsonplaceholder.typicode.com/posts");//HTTP Method, URL 정의 (첫번째)
xhr.setRequestHeader("content-type", "application/json");//헤더 값 중 content-type 정의

const data = {
    id:"jks2024",
    pwd:"sphb8250",
    name:"곰돌이사육사",
    addr:"경기도 수원시"
}

xhr.send(JSON.stringify(data));//XMLHttpRequest 객체를 사용하여 서버로 HTTP 요청을 보내는 메서드
// XMLHttpRequest 객체를 사용하여 서버로부터 HTTP 응답을 받았을 때 호출되는 콜백 함수를 설정하는 포로퍼티
xhr.onload = () => {
    if(xhr.status === 201){
        //정상적으로 응답되면 status가 200
        const res = JSON.parse(xhr.response);
        console.log(res);//100개의 데이터를 받아옴
    }else{
        //에러발생
        console.log(xhr.status, xhr.statusText);
    }
};