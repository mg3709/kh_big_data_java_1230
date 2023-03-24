let burger = [];
let drink = [];
let tmp;

tmp = prompt("불고기버거 가격 : ","");
burger[0] = Number(tmp);
tmp = prompt("새우버거 가격 : ","");
burger[1] = Number(tmp);
tmp = prompt("치킨버거 가격 : ","");
burger[2] = Number(tmp);
tmp = prompt("콜라 가격 : ","");
drink[0] = Number(tmp);
tmp = prompt("사이다 가격 : ","");
drink[1] = Number(tmp);

document.write(`<h1>불고기버거 : ${burger[0]} <br> 새우버거 : ${burger[1]} <br> 치킨버거 : ${burger[2]}</h1>`);
document.write(`<h1>콜라 : ${drink[0]} <br> 사이다 : ${drink[1]}</h1>`);

let a = burger[0];
let b = drink[0];
for(let i = 0; i < burger.length; i++){
    if(a > burger[i]) a = burger[i];
}
for(let i = 0; i < drink.length; i++){
    if(b > drink[i]) b = drink[i];
}

document.write(`<h2>제일 싼 세트 : ${a} , ${b}</h2>`);
document.write(`<h2>세트 가격 : ${a+b-50}</h2>`);