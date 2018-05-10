import React from "react";

const Heading = (props) => {
  let firstName;
  let lastName;
  if (!props.firstName || !props.lastName){
    firstName = "Chuck";
    lastName = "Norris";
  } else {
    firstName = props.firstName;
    lastName = props.lastName;
  }
  return <h1>{firstName} {lastName} Jokes</h1>
};

export default Heading;
