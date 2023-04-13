import React from "react";

//비효율적인 방법 : 배열 그대로 작성하는 방법
const MapTest = () => {

        const users = [
            {
                id:100,
                userName:"천지훈",
                eMail:"1000won@gmail.com"
            },
            {
                id:200,
                userName:"백마리",
                eMail:"2000won@gmail.com"
            },
            {
                id:300,
                userName:"서민혁",
                eMail:"3000won@gmail.com"
            }
        ];
    
    return(
        <>
            <div>
                <b>{users[0].userName}</b>
                <span>{users[0].eMail}</span>
            </div>

            <div>
                <b>{users[1].userName}</b>
                <span>{users[1].eMail}</span>
            </div>

            <div>
                <b>{users[2].userName}</b>
                <span>{users[2].eMail}</span>
            </div>
        </>
    );
}

export default MapTest;