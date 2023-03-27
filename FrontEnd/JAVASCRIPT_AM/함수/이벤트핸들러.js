// let btn = document.querySelector('#myButton');
// btn.addEventListener('click', callBtn);


// function callBtn(){
//     console.log("Button이 눌려졌습니다");
// }

// 클로저 : 자바스크립트 클로저는 함수가 해당 스코프 외부에 있는 변수에 접근할 수 있는 메커니즘입니다
// count 변수는 makeCounter() 함수 내에서 정의 되어있지만, 함수 외부에서 접근 
function makeCounter(){
    let count = 0;
    return function(){
        count++;
        console.log(count);
    };
}
const counter = makeCounter();
counter();
counter();
counter();