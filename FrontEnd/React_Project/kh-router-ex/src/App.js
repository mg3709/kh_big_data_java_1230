import './App.css';
import Home from './pages/Home';
import About from './pages/About';
import Profile from './pages/Profile';
import Login from './pages/Login';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';

//<Route path = "주소 규칙" element={보여줄 컴포넌트 JSX}/>

function App() {
  return (
    <>
      <Router>
        <Routes>
          <Route path='/' element={<Home/>}/>
          <Route path='/About' element={<About/>}/>
          <Route path='/profiles/:username' element={<Profile/>}/>
          <Route path='/Login' element={<Login/>}/>
        </Routes>
      </Router>
    </>
  );
}

export default App;
