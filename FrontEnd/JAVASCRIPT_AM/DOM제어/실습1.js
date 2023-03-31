function newRegister(){
    let newItem = document.createElement("li"); // ul 태그 아래에 추가할 요소노드 생성
    let subject = document.querySelector("#subject");
    // HTML 문서에 새로운 텍스트 노드를 만듭니다
    let newText = document.createTextNode(subject.value);
    // 텍스트 노드를 요소 노드의 자식 노드로 추가
    newItem.appendChild(newText);

    let itemList = document.querySelector("#itemList");
    // insertBefore() 메소드는 DOM 요소를 특정 요소의 이전에 삽입합니다
    // 자식 노드 중 첫번재 노드 앞에 추가
    itemList.insertBefore(newItem, itemList.childNodes[0]);

    subject.value = "";
    let items = document.querySelectorAll("li");

    for(let e of items){
        e.addEventListener("click", function(){ 
            if(this.parentNode){// 클릭 이벤트가 발생한 요소의 부모가 있으면..
                this.parentNode.removeChild(this);
            }
        });
    }
}