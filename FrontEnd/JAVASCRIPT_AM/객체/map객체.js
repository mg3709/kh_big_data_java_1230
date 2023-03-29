// Map 객체 : 자바스크립트에서 제공하는 데이터 구조 중 하나로 key-value 쌍으로 데이터를 저장 관리합니다
// Map은 객체와 유사하지만 객체와는 다르게 키에 다양한 자료형을 사용 할 수 있습니다.
let map = new Map(); 
map.set("name", "유나");
map.set("email", "yuna@gmail.com");
map.set("addr", "경기도 수원시");

console.log(map.size);
console.log(map.get("name"));
console.log(map.get("email"));

map.forEach((item) => {
    console.log(item);
})//모두 출력


