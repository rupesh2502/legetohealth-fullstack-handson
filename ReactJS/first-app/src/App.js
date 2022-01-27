import logo from './logo.svg';
import './App.css';
import EmployeeItems from './components/EmployeeCurd';

import EmployeeStore from './components/EmployeeStoreDB';

function App() {
  return (
    <div className="App">
      <EmployeeItems/>
      <hr/>
      <EmployeeStore/>
    </div>
  );
}

export default App;
