import React from 'react';
import './App.css';

const UserContext = React.createContext();

class App extends React.Component {
  constructor(props){
    super(props);
    this.state = {
      name: "John",
      age: 37
    };

    this.makeYounger = this.makeYounger.bind(this);
  }

  makeYounger(){
    this.setState({age: this.state.age - 1});
  }

  render() {
    return (
      <UserContext.Provider value={{state: this.state, clickHandler: this.makeYounger}}>
        <Content />
      </UserContext.Provider>
    );
  }
}

const Content = () => {
  return <SubContent />
}

const SubContent = () => {
  return (
    <UserContext.Consumer>
      {context => {
        return(
          <React.Fragment>
            <p>{context.state.name} is {context.state.age} years old</p>
            <button onClick={context.clickHandler}>Drink the Fountain of Youth</button>
          </React.Fragment>
        )
      }}
    </UserContext.Consumer>
  )
}

export default App;
