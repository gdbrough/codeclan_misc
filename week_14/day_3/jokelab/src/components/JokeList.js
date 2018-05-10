import React from "react";
import Joke from "./Joke";

class JokeList extends React.Component{
  render(){
    if(!this.props.jokes.length) return null;
    const jokeList = this.props.jokes.map((joke, index) => {
      return(
        <Joke key={index} joke={joke.joke}></Joke>
      )
    })
    return <React.Fragment>
      {jokeList}
    </React.Fragment>
  }
}

export default JokeList;
