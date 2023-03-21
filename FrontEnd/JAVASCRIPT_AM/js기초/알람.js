// 시간 정보 (시간과 분)을 입력 받아 45분 빼주는 문제
let tmp, hour, min, calc;
tmp = prompt("시간 입력 : ", "");
hour = Number(tmp);
tmp = prompt("분 입력 : ", "");
min = Number(tmp);
calc = (hour * 60) + min;
console.log(calc);
if(calc < 45) {
    calc = (24 * 60) + min;
}
calc -= 45;
console.log(calc);
hour = parseInt(calc / 60);
min = calc % 60;
document.write("<h2>" + `${hour}시 ${min}분 ` + "</h2>");//(``) : 탭키 위에 있는 따옴표