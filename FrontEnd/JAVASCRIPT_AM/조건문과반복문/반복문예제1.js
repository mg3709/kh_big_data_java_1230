// 고객이 구입 가능한 음료 리스트 구하기
let productList = [
    {
        name: "레쓰비",
        price: 700
    },
    {
        name: "티오피",
        price: 1000
    },
    {
        name: "비타500",
        price: 800
    },
    {
        name: "포카리스웨트",
        price: 1000
    },
    {
        name: "파워에이드",
        price: 1200
    }
];

let inputCoin = 800;
let outputList = [];
for(let i = 0; i < productList.length; i++){
    if(productList[i].price <= inputCoin){
        outputList.push(productList[i])//push : 배열의 끝에 새로운 요소를 추가
    }
}
console.log(outputList);