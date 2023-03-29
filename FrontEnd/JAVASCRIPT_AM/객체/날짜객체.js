// 날짜와 시간을 다루는 Date 객체
const date = new Date();
console.log(date);

// 인스턴스 만들기 
// 월은 0부터 시작, GMT 기준 시간으로 설정됨
const date1 = new Date(2022, 11, 27, 18, 30, 50);
console.log(date1);


//원하는 달로 입력됨
const date2 = new Date("2022-12-25/18:30:50");
console.log(date2);

// Date 객체의 메소드 
let myDate = new Date();
console.log(myDate.getFullYear()); //현재 연도 출력
console.log(myDate.getMonth() + 1); //현재 월 출력 (0부터 시작)
console.log(myDate.getDate());//현재 날짜 출력
console.log(myDate.getDay());// 현재 요일 출력
console.log(myDate.getHours());//현재 시간 출력
console.log(myDate.getMinutes());// 분 출력
console.log(myDate.getSeconds());// 초 출력
console.log(myDate.getTime());//1970년 1월1일 0시 0분 부터 지금까지의 경과 시간
