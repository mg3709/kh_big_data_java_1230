let tmp = prompt("숫자를 입력하세요 : ", "");
let num = Number(tmp);
console.log(num);

if(num >= 0){
    document.write("<h2>" + num + "은 양수 입니다" + "</h2>");
}else{
    document.write("<h2>" + num + "은 음수 입니다" + "</h2>");
}