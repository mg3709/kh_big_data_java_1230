// 함수 선언문 : function 키워드로 선언하며 함수 이름을 가짐. 호이스팅에 영향을 받음
// 호이스팅 : 함수나 변수가 해당 스코프의 최상단으로 끌어 올려진 것 같은 현상을 말한다..
// 호이스팅의 영향을 받는다는 건 함수가 선언된 위치에 상관없이 호출하여 실행 할 수 있음을 의미

function sum(p1, p2){
    return p1 + p2;
}

let sum1 = sum(21, 24);
let sum2 = sum(100, 200);

console.log(sum1, sum2);