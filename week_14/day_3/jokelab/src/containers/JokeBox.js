import React from "react";
import Form from "../components/Form"
import Header from "../components/Header"
import JokeList from "../components/JokeList"
import RandomJoke from "../components/RandomJoke"
import CategorySelector from "../components/CategorySelector"

class JokeBox extends React.Component {
  constructor(props){
    super(props);
    this.state = {
      jokes: [],
      randomJoke: [],
      categories: []
    };
    this.loadJokes = this.loadJokes.bind(this);
    this.handleCategorySelected = this.handleCategorySelected.bind(this);
    this.handleFormSubmit = this.handleFormSubmit.bind(this);
  }

  componentDidMount(){
    fetch("http://api.icndb.com/categories")
    .then(response => response.json())
    .then(json => this.setState({categories:json.value}))
    .then(this.loadRandomJoke(null, null))
    this.loadJokes("all")
  }

  loadRandomJoke(newFirstName, newLastName){
    let url;
    if(!newFirstName || !newLastName){
      url = "http://api.icndb.com/jokes/random/"
    } else {
      url = "http://api.icndb.com/jokes/random/?firstName=" + newFirstName + "&lastName=" + newLastName;
    }
    fetch(url)
    .then(response => response.json())
    .then(json => this.setState({randomJoke: json.value}))
  }

  loadJokes(category, newFirstName, newLastName){
    let url;
    if(!newFirstName || !newLastName){
      switch(category){
        case "all":
        url = "http://api.icndb.com/jokes";
        break;
        default:
        url = "http://api.icndb.com/jokes?limitTo=[" + category + "]";
      }
    } else {
      switch(category){
        case "all":
        url = "http://api.icndb.com/jokes?firstName=" + newFirstName + "&lastName=" + newLastName;
        break;
        default:
        url = "http://api.icndb.com/jokes?limitTo=[" + category + "]&firstName=" + newFirstName + "&lastName=" + newLastName;
      }
    }
    fetch(url)
    .then(response => response.json())
    .then(json => this.setState({jokes: json.value}));
  }

  handleCategorySelected(index){
    // let selectedCategory;
    index === "all" ?
      this.state.selectedCategory = "all" :
      this.state.selectedCategory = this.state.categories[index];
    // index === "all" ?
    //   this.setState({selectedCategory: "all"}) :
    //   this.setState({selectedCategory: this.state.categories[index]});
    this.loadJokes(this.state.selectedCategory, this.state.firstName, this.state.lastName);
  }

  handleFormSubmit(name){
    this.setState({firstName: name.firstName, lastName: name.lastName})
    this.loadJokes(this.state.selectedCategory, name.firstName, name.lastName);
    this.loadRandomJoke(name.firstName, name.lastName);
  }

  render(){
    return(
      <React.Fragment>
        <Header firstName={this.state.firstName} lastName={this.state.lastName}/>
        <h2>Change the Name</h2>
        <Form onFormSubmit={this.handleFormSubmit} />
        <h2>Random Joke</h2>
        <RandomJoke randomJoke={this.state.randomJoke} />
        <h2>All Jokes</h2>
        <CategorySelector
          categories={this.state.categories}
          onChange={this.handleCategorySelected}
        />
        <JokeList jokes={this.state.jokes} />
      </React.Fragment>
    )
  }

}

export default JokeBox;
