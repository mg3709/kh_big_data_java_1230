import { useState, useEffect, useContext } from "react";
import AxiosApi from "../api/AxiosAPI";
import { useNavigate } from "react-router-dom";
import { UserContext } from "../context/UserInfo";

const Home = () => {
    const navigate = useNavigate();
    const [memberInfo, setMemberInfo] = useState("");
     const isLogin = window.localStorage.getItem("isLogin");
    // const userId = window.localStorage.getItem("userId");
    // const pwd = window.localStorage.getItem("password");

    // Context에서 값 읽기
    const context = useContext(UserContext);
    const {userId, password} = context;

    console.log(isLogin);
    if(isLogin !== "TRUE") navigate("/");

    useEffect(() => {
        const memberInfo = async() => {
            const setId = window.localStorage.getItem("ALL");
            const rsp = await AxiosApi.memberGet(setId); // 전체 조회
            if(rsp.status === 200) setMemberInfo(rsp.data);
            console.log(rsp.data);
        };
        memberInfo();
    }, []);

    return(
        <>
            {memberInfo && memberInfo.map(member => (
                <div key={member.id}>
                    <p>{member.id}</p>
                    <p>{member.name}</p>
                    <p>{member.email}</p>
                    <p>{member.join}</p>
                </div>
            ))}
            <p>아이디 : {userId}</p>
            <p>패스워드 : {password}</p>
        </>
    );
};
export default Home;