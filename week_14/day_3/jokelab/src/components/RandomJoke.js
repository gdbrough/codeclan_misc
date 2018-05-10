import React from "react";

class RandomJoke extends React.Component{

  render(){
    if(!this.props.randomJoke) return null;
    return(
      <p>{this.props.randomJoke.joke}</p>
    )
  }
}

export default RandomJoke;
