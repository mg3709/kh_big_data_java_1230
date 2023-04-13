import React from "react";

//컴포넌트를 만들고 props로 전달하기

// const User = (props) => {
//     return(
//         <>
//             <b>{props.user.userName}</b><span>{props.user.eMail}</span>
//         </>
//     );
// }
const MapTest2 = () => {
    
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
        },
        {
            id:400,
            userName:"곰돌이사육사",
            eMail:"10000won@gmail.com"
        }
    ];

    //map() : 기존의 배열에서 새로운 배열을 만듬
    // const numbers = [1,2,3,4,5];
    // const listItems = numbers.map(e => <li>{e}</li>)

    return(
        <>
            {/* <div><User user={users[0]}/></div>
            <div><User user={users[1]}/></div>
            <div><User user={users[2]}/></div> */}


            {/* <ul>{listItems}</ul> */}

            {/* <ul>{numbers && numbers.map(e => <li><b>{e}</b></li>)}</ul> */}

            {users && users.map((user) => <div key={user.id}><b>{user.userName}</b><span>{user.eMail}</span></div>)}
        </>
    );
}

export default MapTest2;