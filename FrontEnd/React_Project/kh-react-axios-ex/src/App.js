import './App.css';
// import Axios from './Axios';
import {useState} from "react";
import NewsList from './components/NewsList';
import Categories from './components/Categories';

function App() {

  const [category, setCategoty] = useState("all");

  const onSelect = (category) => {
    setCategoty(category);
  }

  return (
    <>
      {/* <Axios/> */}

      <Categories category={category} onSelect={onSelect}/>
      <NewsList category={category}/>

    </>
  );
}

export default App;
