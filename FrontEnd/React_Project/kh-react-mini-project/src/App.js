import './App.css';
import Login from './pages/Login'; 
import Home from './pages/Home';
import SignUp from './pages/Signup';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import UserStore from './context/UserInfo';

function App() {
  return (
    <UserStore>
      <Router>
        <Routes>
          <Route path="/" element={<Login />} />
          <Route path="/Signup" element={<SignUp />} />
          <Route path='/Home' element={<Home />} />
        </Routes>
      </Router>
    </UserStore>
  );
}

export default App;
