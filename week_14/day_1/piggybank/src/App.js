import React, { Component } from 'react';
import './App.css';
import PiggyBank from "./PiggyBank"

class App extends Component {
  render() {
    return (
      <PiggyBank title="Graeme's Savings Pig" owner="Graeme" depositAmount={10}/>
    );
  }
}

export default App;
