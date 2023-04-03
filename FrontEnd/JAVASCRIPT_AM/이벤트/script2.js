const btnEl = document.querySelector("button");
btnEl.addEventListener("click", function(e){
    console.log("버튼이 눌려졌습니다." + e);
    console.log("x좌표 : " + e.clientX);
    console.log("y좌표 : " + e.clientY);
    console.log("마우스가 클릭된 x좌표 : " + e.pageX);
    console.log("마우스가 클릭된 y좌표 : " + e.pageY);
    console.log("모니터의 왼쪽 모서리를 기준으로 마우스가 클릭된 x좌표 : " + screenX);
    console.log("모니터의 왼쪽 모서리를 기준으로 마우스가 클릭된 y좌표 : " + screenY);
});

const inputEl = document.querySelector("input");
inputEl.addEventListener("keydown", function(event){//이벤트 객체
    console.log(`keyCode : ${event.keyCode}`);
    console.log(`ctrlKey : ${event.ctrlKey}`);
    console.log(`altKey : ${event.altKey}`);
    console.log(`shiftKey : ${event.shiftKey}`);

    if(event.keyCode === 83){
        console.log("asdasdasd");
    }
});

// 이벤트 취소하기 : HTML 태그 중 일부는 기본으로 이벤트가 적용되어 있습니다.
// 대표적으로 a태그와 form 태그가 해당됩니다.
// target 속성은 이벤트가 발생한 요소를 나타냅니다 (리액트에서 확인 할 예정)
const aEls = document.querySelectorAll("a");
for(let e of aEls){
    e.addEventListener("click", function(event){
        // 기본 이벤트 취소
        event.preventDefault();
    });
}

const form = document.getElementById("myForm");
form.addEventListener("submit", function(event){
    // 기본 이벤트 취소
    event.preventDefault();// 폼 제출 기본 동작 막기
});