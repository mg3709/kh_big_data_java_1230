const regexId = /^w{8,20}$/;
const regexPwd = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,20}$/;
const regexMail = /^([a-z]+\d*)+(\.?\w+)+@\w+(\.\w{2,3})+$/;
const regexPhone = /\d{2,3}-\d{3,4}-\d{4}/;

//input
let id = document.getElementById("id");
let pwd = document.getElementById("pwd");
let email = document.getElementById("email");
let tel = document.getElementById("phone");

//버튼
const idCheck = document.getElementById("id_check");
const pwdCheck = document.getElementById("pwd_check");
const mailCheck = document.getElementById("email_check");
const telCheck = document.getElementById("phone_check");

// p태그
let p = document.querySelector(".id_check_text");
let p2 = document.querySelector(".pwd_check_text");
let p3 = document.querySelector(".email_check_text");
let p4 = document.querySelector(".phone_check_text");

function match(val, res){
    switch(val){
        case "id":
            
        case "pwd":

        case "email":

        case "phone":

    }
}

idCheck.addEventListener("click", function(e){
    let res = id.value;
    if(res.match(regexId)){
        alert("가능합니다");
    }else{
        p.innerText = "입력 오류 문구 표시";
        p.classList.add("red-color");
    }
    id.value = "";
});

pwdCheck.addEventListener("click", function(){
    let res = pwd.value;
    if(res.match(regexPwd)){
        alert("가능합니다");
    }else{
        p2.innerText = "입력 오류 문구 표시";
        p2.classList.add("red-color");
    }
    pwd.value = "";
});

mailCheck.addEventListener("click", function(){
    let res = email.value;
    if(res.match(regexMail)){
        alert("가능합니다");
    }else{
        p3.innerText = "입력 오류 문구 표시";
        p3.classList.add("red-color");
    }
    mail.value = "";
})

telCheck.addEventListener("click", function(){
    let res = tel.value;
    if(res.match(regexPhone)){
        alert("가능합니다");
    }else{
        p4.innerText = "입력 오류 문구 표시";
        p4.classList.add("red-color");
    }
    tel.value = "";
});