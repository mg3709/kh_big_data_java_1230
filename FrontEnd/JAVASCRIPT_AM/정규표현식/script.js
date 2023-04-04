// 정규표현식(regular expression) : 문자열에 포함된 특정 문자 조합을 찾기 위해 사용되는 패턴입니다
// const regexp = /World/;
// const regexp = new RegExp("World");

let str = "Hello World World";
const re = /World/;
// 해당 문자열의 포함여부 확인
console.log(re.test(str));
// 해당 문자열의 시작 위치를 반환
console.log(str.search(re));

// exec() 메소드 : 인수로 전달된 문자열에서 특정 패턴을 검색하여, 패턴과 일치하는 문자열 반환
// 만약에 패턴과 일치하는 문자열이 없으면 null을 반환
let targetStr = "큰 실수는 포기, 가장 어리석은 일은 남의 결점 찾기, 좋은 선물은 용서";
let firstRst = /가장+/.exec(targetStr); //패턴과 일치하는 문자열이 여러개인 경우
let secRst = /가장큰+/.exec(targetStr);
console.log(firstRst);
console.log(secRst);

// test() 메소드 : 인수로 전될된 문자열에서 특정 패턴과 일치하는 문자열이 있는지 검사
// 문자열이 있으면 true, 없으면 false
let tarStr = "큰 실수는 포기, 가장 어리석은 일은 남의 결점 찾기, 좋은 선물은 용서";
let firRst = /가장+/.test(tarStr); //패턴과 일치하는 문자열이 여러개인 경우
let secondRst = /가장큰+/.test(tarStr);
console.log(firRst);
console.log(secondRst);

// 전화번호 검사하기
// \d : 숫자를 의미
// {}안의 숫자는 갯수를 의미
let inputNum = "010-5006-4146";
const regex = /\d{3}-\d{4}-\d{4}/;
let rst = regex.test(inputNum);
console.log(rst);

// 전화 번호 추출하기
// match : 주어진 문자열의 처음부터 패턴 매칭을 수행
const inputText = "안녕하세요. 제 번호는 010-5006-4146 입니다. 연락 주세요.";
const regex2 = /\d{3}-\d{4}-\d{4}/;
let regNumber = inputText.match(regex2);
console.log(regNumber);
console.log(regNumber[0]);

// 전화번호 여러개 추출하기(g)
// \d{2,3} : 숫자 2 ~ 3개로 시작
// g : 매칭되는 모든 항목 찾기
const inputText2 = "안녕하세요. 제 번호는 010-5006-4146 031-304-9991 입니다";
const regex3 = /\d{2,3}-\d{3,4}-\d{4}/g;
let rst2 = inputText2.match(regex3);
console.log(rst2);
console.log(rst2[0]);
console.log(rst2[1]);

// 정규식 주요 패턴에 대한 사용 예제
const regex4 = /오늘의/; //단순 글자 찾기
const regex5 = /010/g;//모두 찾기
const regex6 = /[a-zA-Z]/g; //모든 알파벳 대소문자 찾기
const regex7 = /[^0-9]/g; //숫자가 아닌 모든것 찾기
const regex8 = /[ㄱ-ㅎ 가-힣]/g; // 숫자가 아닌것 모두 찾기
let res =inputText2.match(regex4);
console.log(res);


// 웹사이트 주소 정규식 검사하기
// http:// 나 http://로 시작하고, 알파벳, 언더스코어(_), 하이폰(-), dot(.)으로 이루어져있음
// https?:// \/\/[/w\-\.]+/g
const text = "구입문의는 : http://gogumarket.com https://google.co.kr 010-5006-4146 입니다";
const regex9 = /http?:\/\/[/w\-\.] + /g;
let rst3 = text.match(regex9);
console.log(regex9);