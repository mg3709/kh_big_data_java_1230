// 함수와 switch문 사용
function calculator(n1, n2, op){
    switch(op){
        case "+":
            return add(n1, n2);//add 함수의 결과 값이 반환됨
        case "-":
            return sub(n1, n2);
        case "*":
            return mul(n1, n2);
        case "/":
            return div(n1, n2);
    }
}

function add(a, b){
    return a + b;
}
function sub(a, b){
    return a - b;
}
function mul(a, b){
    return a * b;
}
function div(a, b){
    return a / b;
}

console.log("덧셈 : " + calculator(10, 20, "+"));
console.log("뺄셈 : " + calculator(10, 20, "-"));
console.log("곱셈 : " + calculator(10, 20, "*"));
console.log("나눗셈 : " + calculator(10, 20, "/"));