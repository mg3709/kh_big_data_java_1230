// 메소드로 노드를 선택하는 방법
// getElementById("id") : id 속성값과 일치하는 요소 노드 1개만 선택
const el = document.getElementById("title");
console.log(el);

// getElementByClassName("클래스") : class 속성값과 일치하는 요소 노드 모두 선택
//여러개의 요소 노드가 선택되며 배열과 유사한 형태로 관리됨
const classEl = document.getElementsByClassName("text");
console.log(classEl[1]);//1번 태그만 보임

//향상된 for문과 유사
for(let el of classEl){
    console.log(el);
}

// getElementByTagName("태그명") : 태그명과 일치하는 요소 노드를 모두 선택
const tagEl = document.getElementsByTagName("p");
for(let el of tagEl){
    console.log(el);
}


// CSS 선택자로 사용하기 : query메소드(querySelector, querySelectorAll)
const qEl = document.querySelector(".box-1");
console.log(qEl);

const qElS = document.querySelectorAll(".box-1 .text");
console.log(qElS);
console.log(qElS[0]);
console.log(qElS[1]);

