import React from "react";
import styled, {css} from "styled-components";

const Box = styled.div`
  background: ${props => props.color || "blue"};
  padding: 1rem;
  display: flex;
  width: 1024px;
  margin: 0 auto;
  
  /* 최대 너비가 1024px 일 때, 768px 로 변경 */
  @media(max-width: 1024px){
    width: 768px;
  }
  @media(max-width: 768px) {
    width: 100px;
  }
`;

const Button = styled.button`
    background: white;
    color: black;
    border-radius: 4px;
    padding: .5rem;
    align-items: center;
    justify-content: center;
    box-sizing: border-box;
    font-size: 1rem;
    font-weight: 600;
    &:hover{// & : 자기자신을 뜻합니다
        background-color: rgba(255,255,255,0.9);
    }
    ${props => props.inverted && 
        css`
            background: none;
            border: 2px solid white;
            color: white;
        &:hover{
            background: white;
            color: black;
        }
    `};
    & + button{
        margin-left: 1rem;
    }
`;

const StyledComponent = () => {
    return(
        <Box color="orangered">
            <Button>안녕하세요</Button>
            <Button inverted={true}>테두리만</Button>
        </Box>
    );
}

export default StyledComponent;