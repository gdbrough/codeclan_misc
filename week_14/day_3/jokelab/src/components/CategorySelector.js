import React from 'react';

const CategorySelector = (props) => {
  if(!props.categories.length) return null;
  const options = props.categories.map((category, index) => {
   return <option value={index} key={index}>{category}</option>

  });
  const handleChange = (event) => {
    let index = event.target.value;
    props.onChange(index)
  }

  return (
    <select
      onChange={handleChange}
      id="category-selector"
      defaultValue="all">
      <option key="all" value="all">All</option>
      {options}
    </select>
  )
}

export default CategorySelector;
