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

// 2개 이상의 배열을 하나의 뱅렬로 결합 : concat()
let arr5 = ["사과", "딸기", "참외"];
let arr6 = ["포도", "수박", "바나나"];
let arr7 = ["키위", "망고", "오렌지"];
let arr8 = ["복숭아", "자두", "멜론"];
let toFruits = arr5.concat(arr6, arr7, arr8);
console.log(toFruits);

// slice() : 시작 인덱스 부터 종료 인덱스까지의 배열의 요소를 잘라냄
let fruits10 = ["Banana", "Orange", "Apple", "Mango", "Lemon"];
let slice1 = fruits10.slice(3); //3번째 요소부터 끝까지
let slice2 = fruits10.slice(1, 3); //1번 인덱스에서 3번 인덱스 미만 요소
console.log(slice1);
console.log(slice2);

// sort() : 오름차순 정렬
fruits10.sort();
console.log(fruits10);

// 내림차순 정렬
console.log(fruits10.reverse());

// filter() : 배열에서 특정 조건을 만족하는 배열의 요소만을 찾아서 새로운 배열생성
let persons = [
    {
    name: "유재석",
    point: 78,
    city: "서울",
    },
    {
        name: "김종국",
        point: 92,
        city: "서울",
    },
    {
        name: "양세찬",
        point: 76,
        city: "제주",
    },
    {
        name: "하하",
        point: 81,
        city: "서울",
    },
];

let pass = persons.filter(person => person.point > 80);
console.log(pass);
