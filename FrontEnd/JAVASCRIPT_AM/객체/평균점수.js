// 5명의 성적을 입력 받고, 40점 이하는 보충 학습을 듣는 조건으로 항상 40점
// 5명의 성적에 대한 평균을 구하기

function cal(){
    const scores = [];
    let total = 0;

    for(let i = 0; i < 5; i++){
        const score = parseInt(document.getElementById("input" + (i + 1)).value);
        score.push(score);
    }
    for(let i = 0; i < scores.length; i++){
        if(scores[i] < 40) scores[i] = 40;
        total += scores[i];
    }
    document.getElementById("result").innerHTML = total;
}