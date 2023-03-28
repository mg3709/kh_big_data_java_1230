// 5명의 성적을 입력 받고, 40점 이하는 보충 학습을 듣는 조건으로 항상 
// 5명의 성적에 대한 평균을 구하기

function averScore(){
    const scores = [];

    for(let i = 0; i < 5; i++){
        const scroe = parseInt(document.getElementById("score + i").value);
        score.push(scores);
    }
    for(let i = 0; i < scores.length; i++){
        if(scores[i] < 40) scores[i] = 40;
        total += scores[i];
    }
}