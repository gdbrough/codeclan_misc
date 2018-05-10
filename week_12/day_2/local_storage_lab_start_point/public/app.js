var init = function () {
  var button = document.querySelector('button');
  button.addEventListener('click', handleButtonClick);

  var todosArray = JSON.parse(localStorage.getItem('todoList')) || [];
  populate(todosArray);
}

var populate = function (todos) {
  // this function needs to:
  // - loop through the array of todos, invoking addItem() for each todo item
  for (todo of todos){
    addItem(todo);
  }
}

var addItem = function (item) {
  var ul = document.querySelector('#todo-list');
  // this function needs to:
  // - create an li element containing the string 'item'
  let li = document.createElement("li");
  li.innerText = item;
  // - append the li to the "todo-list" ul
  ul.appendChild(li);
}

var handleButtonClick = function () {
  // this function needs to:
  // - get hold of the input box's value
  var toDoItem = document.querySelector('#new-item');
  // - append it to the "todo-list" ul by invoking addItem()
  addItem(toDoItem.value);
  // - add it to local storage by invoking save()
  save(toDoItem.value);
}

var save = function (newItem) {
  // this function needs to:
  // - get the data back from local storage and parse to an array
  var todosArray = JSON.parse(localStorage.getItem('todoList')) || [];
  // - add the newItem to the array
  todosArray.push(newItem);
  // - stringify the updated array
  var jsonString = JSON.stringify(todosArray);
  // - save it back to localstorage
  localStorage.setItem("todoList", jsonString);
}

window.addEventListener('load', init);
