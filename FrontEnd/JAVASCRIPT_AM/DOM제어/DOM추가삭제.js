// 노드 추가/삭제 하기 : DOM 트리에 새로운 노드를 생성하고, 기존 DOM 트리에 연결

// createElement() : 요소 노드를 생성합니다
const aEl = document.createElement("div");

// <기준노드>.appendChild(추가할 자식 노드);
document.body.appendChild(aEl);
aEl.innerText = "Test";

// div 태그를 생성하고 하위에 메뉴 리스트 추가하기 (ul 과 li 태그를 사용)
// 메뉴 리스트
// - 돈까스
// - 오무라이스
// - 짜장면

const uEl = document.createElement("ul");

const lEl = document.createElement("li");
const lEl2 = document.createElement("li");
const lEl3 = document.createElement("li");

lEl.innerText = "돈까스";
lEl2.innerText = "오무라이스";
lEl3.innerText = "짜장면";

uEl.appendChild(lEl);
uEl.appendChild(lEl2);
uEl.appendChild(lEl3);

let menu = document.querySelector("#menu");
menu.appendChild(uEl);

const list = document.querySelectorAll("li");

for(let el of list){
    el.style.color = "royalblue";
    el.style.listStyle = "none";
    el.style.margin = "10px"; 
}

function deleteMenu(){
    // <기준노드>.removeChild(삭제할 자식 노드)
    uEl.removeChild(lEl);
    uEl.removeChild(lEl2);
    uEl.removeChild(lEl3);
}

console.log(uEl);
console.log(lEl);
console.log(lEl2);
console.log(lEl3);