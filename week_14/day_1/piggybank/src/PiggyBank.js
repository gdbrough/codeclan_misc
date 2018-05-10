import React from "react";

class PiggyBank extends React.Component {

  constructor(props){
    super(props);
    this.deposit = this.deposit.bind(this);
    this.withdraw = this.withdraw.bind(this);
    this.depositAmount = this.depositAmount.bind(this);
    this.state = {
      total: 0
    }
  }

  deposit(){
    this.setState(prevState => {
      return {total: prevState.total + 1};
    })
  }

  withdraw(){
    this.setState(prevState => {
      // return {total: prevState.total - 1};
      let newTotal = prevState.total < 1 ? 0 : prevState.total -1;
      return {total: newTotal};
    })
  }

  depositAmount(){
    this.setState(prevState => {
      return {total: prevState.total + this.props.depositAmount};
    })
  }

  componentWillMount(){
    console.log("Component WILL mount!");
    const button = document.querySelector("button");
    console.log(button);
  }

  componentDidMount(){
    console.log("Component DID mount");
    const button = document.querySelector("button");
    console.log(button);
  }

  componentWillUpdate(nextProps,nextState){
    console.log("Component WILL update");
    console.log(nextProps);
    console.log(nextState);
  }

  componentDidUpdate(prevProps, prevState){
    console.log("Component DID Update");
    console.log(prevProps);
    console.log(prevState);
  }

  render() {
    return(
      <div className="bank-box">
        <h1>{this.props.title}</h1>
        <p>I contain £{this.state.total} held for {this.props.owner}</p>
        <button onClick={this.deposit}>Add</button>
        <button onClick={this.depositAmount}>Add £10</button>
        <button onClick={this.withdraw}>Remove</button>
      </div>
    );
  }
}

export default PiggyBank;
