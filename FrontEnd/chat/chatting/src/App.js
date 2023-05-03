import Chat from "./chat";
import Home from "./Home";
import {BrowserRouter as Router, Routes, Route} from "react-router-dom";

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<Home/>}/>
        <Route path="/Chat" element={<Chat/>}/>
      </Routes>
    </Router>
  );
}

export default App;
