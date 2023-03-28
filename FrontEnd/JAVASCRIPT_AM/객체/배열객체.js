// 배열을 다루는 Array 객체
// forEach() : 비파괴적인 메소드이며, 요소를 순회
const arr = [10, 20, 30, 40, 50];
arr.forEach(function(n){
    console.log(n);
});

// toString() : 배열안의 모든 문자를 쉼표(,)를 이용해 모두 결합해서 하나의 문자열로 반환
let fruits = ["Banana", "Orange", "Apple", "Mango"];
console.log(fruits.toString());

// join() : 배열안의 모든 문자를 파라미터로 지정한 문자를 이용해서 모두 결합
console.log(fruits.join(" * "));

// pop() : 스택 자료 구조이며 마지막에 추가된 값을 제거합니다
let fruits2 = ["Banana", "Orange", "Apple", "Mango"];

fruits2.push("Kiwi");
console.log(fruits2);
console.log(fruits2.pop());

// shift() : 첫번째 요소 제거하고 값을 반환 합니다.
console.log(fruits2.shift());
console.log(fruits2);//맨앞의 요소 제거됨

// unshift() : 배열의 맨앞의 요소를 추가하고 배열의 길이를 반환
console.log(fruits2.unshift("LEMON"));
console.log(fruits2);

// 배열 요소의 변경
let fruits3 = ["Banana", "Orange", "Apple", "Mango"];
fruits3[0] = "KIWI";
console.log(fruits3);
