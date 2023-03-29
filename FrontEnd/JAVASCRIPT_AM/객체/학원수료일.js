const cal = function(){
    let start = new Date();
    let end = new Date("2023-07-25");

    let sday = start.getTime();
    let eday = end.getTime();

    let res = eday - sday;

    res = Math.round(res/(1000 * 60 * 60 * 24));

    document.querySelector("#result").innerHTML = res;
}

cal();