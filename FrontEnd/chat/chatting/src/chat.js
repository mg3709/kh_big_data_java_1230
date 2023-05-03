import React, {useState, useEffect} from 'react';
import io from 'socket.io-client';
import styled, {createGlobalStyle} from 'styled-components';
import { useNavigate } from 'react-router-dom';

const port = 4000;

const socket =  io.connect(`http://localhost:${port}`)

const GlobalStyle = createGlobalStyle`
  body{
    background-color: #f2f2f2;
  }
`;

const Card = styled.div`
  display: flex;
  justify-content: center;
  margin: 50px;
  input{
    height: 50px;
    width: 300px;
    border-radius: 10px;
  }
  button{
    height: 50px;
    margin-left: 10px;
    border-radius: 10px;
    background-color: #4caf50;
    color: white;
    border: none;
    cursor: pointer;
    &:hover{
      background-color: #3e8e41;
    }
  }
  @media (max-width: 768px){
    flex-direction: column;
    align-items: center;
    margin: 20px;
    input, button{
      width: 80px;
    }
  }
`;

const ChatLog = styled.div`
  width: 97%;
  height: 400px;
  margin: 20px;
  max-height: 400px;
  overflow-y: auto;
  border: 1px solid black;
  border-radius: 10px;
  font-size: 18px;
  font-weight: bold;
  background-color: white;
  h3{
    margin: 5px 0px;
    font-size: 14px;
  }
  @media (max-width: 768px){
    width: 90%;
  }
`;

const Chat = () => {
  const [state, setState] = useState({message:'', name:''});
  const [chat,setChat] = useState([]);

  const nav = useNavigate();

  useEffect(()=>{
    socket.on('message',({name,message})=>{
      setChat([...chat,{name,message}]);
    });
  },[chat]);

  const onTextChange = e => {
    setState({...state,[e.target.name] : e.target.value});
  };

  const onMessageSubmit = e => {
    e.preventDefault();
    const {name, message} =state;
    socket.emit('message',{name, message});
    setState({message : '',name});
  };


  const renderChat = () => {
    console.log(chat);
    return chat.map(({name, message},index)=>(
      <div key={index}>
        <div>{name}:<span>{message}</span></div>
      </div>
    ))
  };

  return (
    <>
    <GlobalStyle/>
      <div className="render-chat">
        <h1>Chat log</h1>
        <ChatLog>{renderChat()}</ChatLog>
      </div>
    <Card>
      <form onSubmit={onMessageSubmit}>
          <input 
          name ="name" 
          onChange={e=> onTextChange(e)} 
          value={state.name}
          label="Name"
          placeholder='이름을 입력하세요'/>
        
          <input
          className='message'
          name ="message" 
          onChange={e=> onTextChange(e)} 
          value={state.message}
          label="Message"
          placeholder='메시지를 입력하세요'/>
        
        <button>Send Message</button>
      </form>
    </Card>
    <button onClick={() => {
      socket.emit('disconnection', {name: state.name});
      nav(-1);
    }}>퇴장하기</button>
    </>
  );
}

export default Chat;