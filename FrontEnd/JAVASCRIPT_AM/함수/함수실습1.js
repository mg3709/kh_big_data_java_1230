function calcurator(){
    const num1 = Number(document.getElementById("num1").value);
    const op = document.getElementById("operator").value;
    const num2 = Number(document.getElementById("num2").value);
    switch(op){
        case "+":
            result = add(num1, num2);//add 함수의 결과 값이 반환됨
            break;
        case "-":
            result = add(num1, num2);
            break;
        case "*":
            result = add(num1, num2);
            break;
        case "/":
            result = add(num1, num2);
            break;
    }
    document.getElementById("result").innerHTML = `Result : ${result}`;
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

document.write()