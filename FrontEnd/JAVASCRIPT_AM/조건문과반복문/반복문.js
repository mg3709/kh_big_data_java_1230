let brands = ["애플", "구글", "페이스북", "아마존", "삼성전자"];

// 기본 for문
for(let i = 0; i < brands.length; i++){
    console.log(brands[i]);
}

// for of : 배열이나 객체를 순회, 자바의 향상된 for문과 유사
for(let brand of brands){
    console.log(brand);
}

// for in : 객체의 프로퍼티를 열거 할 때 사용하는 반복문(리터럴은 중괄호 배열은 대괄호)
let person = {
    fname: "John",
    lname: "Doe",
    age: 25
};

for(let key in person){
    console.log(person[key]);
}