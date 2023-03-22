// 복수의 데이터를 정의 할 수 있는 자료형
// 배열은 자바와 다르게 모든 자료형을 저장할 수 있습니다(또 다른 배열을 포함할 수 있습니다)
let array = ["아이브", "안유진", 20, true, [100, 99, 88], 1010, "1010"];
console.log(array[4]);
console.log(array[4][1]);
console.log(array[0][2]);

console.log(array[5][0]);//unfined
console.log(array[6][0]);


// let 은 변수를 만드는 키워드 (자바 스크립트는 변수를 만들 때 자료형을 저장하지 않으며 값이 대입 될 때 데이터의 형이 결정 됨)

let score = [80, 99, 77, 65];
console.log(score);
console.log(score[2]);//배열은 인덱스로 요소를 접근함(인덱스는 항상 0부터 시작)

// 빈 배열 생성 후 동적으로 값을 대입할 수 있음
let arr = [];
arr[0] = 100;
console.log(arr);

// 객체 리터럴 : 중괄호{}를 사용해서 정의하고, 키와 값이 한쌍으로 이루어집니다.
let score1 = [80, 99, 77, 65];
let score2 = {
    kor : 80,
    eng : 99,
    mat : 77, 
    scn : 87
};
console.log(score1);
console.log(score2);

// .(도트)를 사용해서 접근하는 방법
console.log(score2.kor);
// []에 키명을 넣어서 접근하는 방법
console.log(score2['mat']);

const person = {
    name : "곰돌이사육사",
    age : 18,
    city : "seoul",
    // 객체 리터럴에서 함수 사용
    getInfo : function(){
        return `${this.name} is ${this.age} years old and lives in ${this.city}.`;
    }
}
console.log(person.getInfo());

// typeof : 데이터형을 확인하는 예약어
let name = "곰돌이사육사";
console.log(typeof(name));

// toString() : 배열 안의 모든 문자를 쉼표를 이용해 모두 결합해서 하나의 문자열로 반환
let fruits = ["Banana", "Orange", "Apple", "Mango"];
console.log(fruits.toString());
console.log(fruits);