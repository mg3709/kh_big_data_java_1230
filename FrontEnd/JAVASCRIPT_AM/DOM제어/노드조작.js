// 노드 조작하기
// textContent : 요소 노드의 모든 텍스트에 접근
// innerText : 요소 노드의 텍스트 중 웹 브라우저에 표시되는 텍스트 접근
// innerHTML : 요소 노드의 텍스트 중 HTML 태그를 포함한 텍스트 접근
let txtCont = document.getElementById("title").textContent;
let inText = document.getElementById("title").innerText;
let inHTML = document.getElementById("title").innerHTML;

console.log(txtCont);
console.log(inText);
console.log(inHTML);

document.getElementById("title").innerText = "TestTest";

document.getElementById("title").innerHTML = "<h1>TestTest</h1>";


//스타일 조작 하기 : 선택된 노드의 스타일(CSS) 지정하거나 변경

// text 클래스 하나만 스타일 적용
// const sEl = document.querySelector(".text");
// sEl.style.backgroundColor = "#ff0000";
// sEl.style.fontsize = "50px";
// sEl.style.color = "white";

//text 클래스 모두 적용
const sEl = document.querySelectorAll(".text");

for(let el of sEl){
    el.style.backgroundColor = "#ff0000";
    el.style.fontsize = "50px";
    el.style.color = "white";
}
