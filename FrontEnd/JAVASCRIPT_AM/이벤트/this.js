const pEls = document.querySelectorAll("p");

//for(let el of pEls)
pEls.forEach((el) => {
    el.addEventListener("click", function(){
        if(this.style.color == "red"){
            this.style.color = "black";
        }else{
            this.style.color = "red";
            this.style.fontWeight = "bold";
        }
    });
});