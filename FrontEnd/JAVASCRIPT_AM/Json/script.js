// JSON(JAVASCRIPT Object Nation)은 자바스크립트 객체를 문자열로 표현하는 데이터 포멧입니다.
// JSON은 사용하면 객체를 직렬화 할 수 있음
// 원래는 자바스크립트 언어에서 파생되었지만 현재는 언어에 독립적으로 사용됩니다.
// JSON 은 두가지 기본 자료구조인 객체와 배열을 기반하여 웹서버와 웹 어플리케이션 간의 데이터 교환에 사용
// XML의 대안으로 자주사용

//객체 리터럴
const person = {
    name:"곰돌이사육사",
    age:18,
    addr:"경기도 수원시"
};

//해당 데이터의 입력은 ajax, Fetch API, Promise, Axios 등의 비동기통신으로 부터 전달받음
const jsonString = '{"name":"안유진", "age":21, "city":"서울시 강남구"}';
const jsonObject = JSON.parse(jsonString);//JSON => 객체 리터럴로 반환
console.log(jsonObject.name);
console.log(jsonObject.age);
console.log(jsonObject.city);

// 자바스크립트 객체를 JSON문자열로 변환하기
let memberInfo = [
    {
        name:"이영지",
        age:22,
        job:"래퍼",
        addr:"서울시 강남구 청담동"
    },
    {
        name:"미미",
        age:24,
        job:"오마이걸",
        addr:"서울시 강남구 역삼동"
    },
    {
        name:"안유진",
        age:21,
        job:"아이브",
        addr:"서울시 강북구"
    },
];

let json = JSON.stringify(memberInfo);
console.log(json);

// JSON
// {
//     "":"곰돌이사육사",
//     "":18,
//     "addr":"경기도 수원시"
// }