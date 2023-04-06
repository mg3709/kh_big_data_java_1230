// Promise를 통한 비동기 제어 방법 : 결과값은 내부 객체이기 때문에 then과 catch로만 접근이 가능
const successPromise = new Promise(function(resolve, reject){
    setTimeout(function(){
        resolve("Success");
    }, 3000);
});

successPromise.then(function(value){
    console.log(value);
});

successPromise.then((value) => console.log(value));