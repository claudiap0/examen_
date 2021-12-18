import react from 'react';
import './App.css';

import AddToyComponent from './component/AddToyComponent';
import ShowToyComponent from './component/ShowToyComponent';


function App() {
  return (
    <div className="App">
      <AddToyComponent />
      
      <ShowToyComponent />
      
    </div>
  );
}

export default App;
