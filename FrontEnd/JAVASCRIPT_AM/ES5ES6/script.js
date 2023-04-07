//Array 메소드 : ES5에서 추가되었으며, 코드를 간결하고 효율적으로 만들어줌
//원본 데이터를 변형시키지 않음
// forEach() : 배열의 각 요소를 순회하며, 요소에 대해 지정된 함수를 실행하는 메소드
// map() : 배열의 모든 요소를 순회하면서 새로운 배열을 만듭니다
// filter() : 배열의 요소 중에서 조건을 만족하는 요소만 추출하여 새로운 배열을 만듬
// reduce() : 배열의 모든 요소를 순회하여, 순회 과정에서 누적값을 사용하여 하나의 결과 값을 만듬
let numbers = [1,2,3,4,5,6,7,8,9,10];
numbers.forEach(num => console.log(num));

let squares = numbers.map(num => num * num);
console.log(squares);

let evenNumbers = numbers.filter(num => num % 2 == 0);
console.log(evenNumbers);

let sum = numbers.reduce(function(tot, num){
    return tot + num;
}, 0);
console.log(sum);

//ES6 : 자바스크립트의 6번째 버전으로, 2015년에 발표
// 가변 변수의 불변 변수 : let, const
// 자바스크립트도 기본티입과 객체 타입으로 나누어 지며, 객체 타입의 경우 주소를 가짐
const arr = [1,2,3];
arr[0] = 100;
arr[1] = 200;
arr[3] = 300;
console.log(arr);

//화살표 함수 : 화살표 함수는 간단하고 간결한 코드를 작성하는 데 유용
const add = function(x, y){
    return x + y;
}
const add1 = (x, y) => x + y;

//화살표 함수 사용시 this 문제 해결
// 기존의 함수 정의 방식에서 함수 내부에서 this 키워드를 사용할 때,
//호출되는 위치에 따라서 참조하는 객체가 다르게 결정되는 문제가 있음

//error
// const obj = {
//     name:"곰돌이사육사",
//     func1(){
//         const func2 = function(){
//             console.log(this.name);
//         }
//         func2();
//     }
// };
// obj.func1();

//값이 안들어올 경우 화살표 함수로 바꾸면 값이 넘어갑니다
const obj = {
    name:"곰돌이사육사",
    func1(){
        const func2 = () => {
            console.log(this.name);
        }
        func2();
    }
}
obj.func1();

///////////////////////////////////////////////////
const btn = document.getElementById("myButton");
// btn.addEventListener("click", () => {
//     console.log(this);
// });

btn.addEventListener("click", function(){
    console.log(this);
})
//////////////////////////////////////////////////////////////
const pEls = document.querySelectorAll("p");
pEls.forEach(e => e.addEventListener("click", function(){
    console.log(this);
}))


//전개 연산자 : 배열이나 객체를 개별 요소로 분리
const arr10 = [1,2,3];
const arr20 = [4,5,6];
const arr30 = [...arr10, ...arr20];
console.log(arr30);

//전개 연산자를 이용한 가변 인수 함수 만들기
function sum2(...numbers){
    return numbers.reduce((tot, num) => tot + num, 0)
};

console.log(sum2(1,2,3,4,5,6,7,8,9,10));

const arr70 = [1,2,3,4,5,6,7,8,9,99999,100000];
const arr80 = [...arr70];
console.log(arr80);

