// 폼 요소의 시작은 항상 form 태그입니다.
// 폼 요소는 input, select, button 태그 등이 있습니다.
// 폼 요소를 선택 할 때는 elements 속성이나 name 속성 사용


function inputCall(){
    let id = document.frm.id.value;
    console.log(id);
    let pwd = document.frm.pwd.value;
    console.log(pwd);
    let desc = document.frm.desc.value;
    console.log(desc);
}


// 체크박스 다루기 : 체크박스도 value 속성으로 값을 가져 올 수 있습니다.

const checkEl = document.querySelectorAll("[type='checkbox']");
for(let e of checkEl){
    if(e.value === "orange"){//오렌지만 체크
        e.checked = true;
    }
}

const radioEl = document.querySelectorAll("[type='radio'");
for(let e of radioEl){
    if(e.value !== "orange")e.checked = true;
}

//콤보 박스 다루기
const optionEl = document.querySelectorAll("option");
for(let e of optionEl){
    if(e.value === "banana"){
        e.selected = true;
    }
}

// 파일 업로드
const upload = function(){
    const filePath = document.frs.upload.files;
    console.log(filePath);
} 



