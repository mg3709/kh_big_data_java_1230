// Number 객체 : 객체에 정의되어 있는 숫자와 관련된 작업을 할 떄 사용되는 메소드
// Number.parseFloat() : 문자열에 포함된 숫자 부분을 실수 형태로 반환

let str = "123412.12";
console.log(Number(str)); //NaN : (Not a Number)
console.log(Number.parseFloat(str));//앞에꺼만 읽어 냄
console.log(Number.parseInt(str));//뒷부분만 읽어 냄

