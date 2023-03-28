// 문자열의 길이 체크 : length
const pw = "1234";
if(pw.length < 4){
    console.log("비밀번호는 최소 4자리 이상 입력해 주세요.");
}

// 특정 문자열의 포함 여부 확인 : includes
const email = "jks2024!@gmail.com";
if(email.includes("@") === false){
    console.log("올바른 이메일 형식이 아닙니다.");
}

const email2 = "@jks2024!gmail.com";
if(email2.indexOf("@") === -1){
    console.log("올바른 이메일 형식이 아닙니다");
}

// 찾고자 하는 문자열이 둘 이상 발견되면 제일 마지막에 발견된
// 문자열의 index를 반환하는 함수
const email3 = "@jks2024!@gmail.com@";
console.log(email3.lastIndexOf("@"));

// slice() : 시작 위치와 종료 위치를 주면 문자열에서 해당 부분을 잘라내서 반환
let str = "Apple, Banana, Kiwi";
let res = str.slice(7, 13);
console.log(res);
console.log(str); //원본은 바뀌지 않습니다

// substring() : 시작위치와 종료위치를 주면 문자열에서 해당 부분을 잘라내서 반환
let str2 = "Apple, Banana, Kiwi";
let res2 = str.substring(7, 13);
console.log(res2);

// replace() : 문자열 내의 특정 문자열을 지정한 문자열로 바꾸는 함수
let str7 = "지구오락실, 이영지, 안유진, 미미, 이은지, 안유진";
let newstr = str7.replace("안유진", "나영석");
console.log(newstr);

// replaceAll() : 문자열 내의 특정 문자열을 지정한 문자열로 모두 바꾸는 함수
let newstr2 = str7.replaceAll("안유진", "나영석");
console.log(newstr2);

// 문자열을 모두 대문자 및 소문자로 변경합니다
let alpha = "Better late than never";
console.log(alpha.toUpperCase());
console.log(alpha.toLowerCase());

// concat() : 2개 이상의 문자열을 하나의 문자열로 합치는 함수
// 기존 문자열을 변경하지 않고 합쳐진 새로운 문자열을 생성(불변성)
let text1 = "Hello";
let text2 = "World";
let text3 = text1.concat(" ", text2);
console.log(text3);

// trim() : 문자열의 앞, 뒤 공백을 제거
let str8 = "Hello JavaScript!!!                       ";
console.log(str8.trim());

// padStart(), padEnd() : 문자열 앞과 뒤에 지정된 길이 만큼 추가하는 함수
let str9 = "5";
let str10 = str9.padStart(4, 0);
let str11 = str9.padEnd(4, 0);
console.log(str10);
console.log(str11);

// charAt() : 문자열에서 특정 인덱스에 해당하는 문자를 반환하는 함수
let addr = "서울시 강남구 역삼동 KH정보교육원";
console.log(addr.charAt(5));

// charCodeAt() : 문자열에 특정 인덱스에 해당하는 문자 하나의 유니코드 반환
let uniCode = "HELLO WORLD";
console.log(uniCode.charCodeAt(0));

// slpit() : 특정 문자 기준으로 문자열을 잘라서 새로운 문자열 배열을 생성
let birthDay = "1997-06-12";
let arr2 = birthDay.split("-");
console.log(arr2);
