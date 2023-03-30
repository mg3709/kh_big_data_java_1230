let doc = document.firstChild;//<!DOCTYPE html>반환
console.log(doc);

let html = document.firstElementChild; // 첫번째 자식 노드 반환
console.log(html);

let prac = 123;

document.getElementById("block").innerHTML = prac;