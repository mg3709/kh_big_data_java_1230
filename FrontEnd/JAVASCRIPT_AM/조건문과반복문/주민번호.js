//길이 체크, 하이폰이 있는지 체크
//성별 확인 123456-1234567
// 현재 년도 - 태어난 년도 = 나이
// 문자열에서 해당 문자 추출은 charAt(n)
// 문자열 잘라내기 substring(0, 2) 0 부터 2 미만 까지 잘라냄
// 날짜 객체를 만드는 방법도 자바와 동일 const date = new Date();
// 날짜 객체에서 현재 년도 가져오기 : date.getFullYear();
let jumin;
while(true){
    jumin = prompt("주민번호를 입력하세요 : ", "");
    if(jumin.length != 14){
        alert("입력 오류 : 다시 입력하세요");
    }else{
        if(jumin.indexOf("-") == -1){
            alert("하이폰이 누락되었습니다");
        }else break;
    }
}
let gender = jumin.charAt(7); //문자열에서 해당 인덱스의 문자 추출(성별자리)
let prnGender;
if(gender === "1" || gender === "3")prnGender = "남성";
else prnGender = "여성";

// 나이를 계산하기 위해 주민번호에서 연도 추출
let birthYear = Jumin.substring(0,2);//0번 인덱스에서 2미만까지 잘라냄(0에서 1번 인덱스의 값 추출)
if(gender === "1" || gender === "2"){
    birthYear = "19" + birthYear;
}else birthYear = "20" + birthYear;

// 문자 타입을 숫자 타입으로 변경
birthYear = Number(birthYear);

// 현재 날짜 가져오기
const date = new Date(); //날짜  객체에서 현재 시간 정보 읽어오기
const currYear = date.getFullYear(); //2023
let age = currYear - birthYear;//나이를 구함

document.write(`<p class="box"> 성별 : ${prnGender} <br> 나이 : ${age}</p>`);



