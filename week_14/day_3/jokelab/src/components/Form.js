import React from "react";

class Form extends React.Component {
  constructor(props){
    super(props);
    this.handleFirstNameChange = this.handleFirstNameChange.bind(this);
    this.handleLastNameChange = this.handleLastNameChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
    this.state = {
      firstName: "",
      lastName: ""
    }
  }

  handleFirstNameChange(event){
    this.setState({firstName: event.target.value})
  }

  handleLastNameChange(event){
    this.setState({lastName: event.target.value})
  }

  handleSubmit(event){
    event.preventDefault();
    var firstName = this.state.firstName.trim();
    var lastName = this.state.lastName.trim();
    if (!firstName || !lastName){
      return
    }
    this.props.onFormSubmit({firstName: firstName, lastName: lastName});
    this.setState({firstName: "", lastName: ""});
  }

  render(){
    return(
      <form className="commentForm"  onSubmit={this.handleSubmit}>
        <input
          type="text"
          placeholder="Your First Name"
          value={this.state.firstName}
          onChange={this.handleFirstNameChange}
        />
        <input
          type="text"
          placeholder="Your Last Name"
          value={this.state.lastName}
          onChange={this.handleLastNameChange}
        />
        <input type="submit" value="Change Name" />
      </form>
    )
  }
}

export default Form;
