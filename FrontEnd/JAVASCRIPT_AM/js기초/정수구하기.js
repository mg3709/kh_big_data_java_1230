/* 3개의 정수를 입력 받아 가장 큰 수와 작은 수 구하기 */
let a,b,c, tmp;
let min, max;
tmp = prompt("첫번째 수 입력 : ", "");
a = Number(tmp);
tmp = prompt("두번째 수 입력 : ", "");
b = Number(tmp);
tmp = prompt("세번째 수 입력 : ", "");
c = Number(tmp);

if(a > b) {
    if(a > c) max = a;
    else min = c;
} else {
    if(b > c) max = b;
    else max = c;
}
if(a > b) {
    if(b > c) min = c;
    else min = b;
} else {
    if(a > c) min = c;
    else min = a;
}
document.write("<h3>제일 큰 값 : " + max + " </h3>");
document.write("<h3>제일 작은 값 : " + min + " </h3>");