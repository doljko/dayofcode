
function addItem(){
  var input = document.getElementById('input');
  var item = input.value;
  ul = document.getElementById('list');
  var textnode = document.createTextNode(item)

  if(item ===''){
    return false;
    //Add p tag assign a value
  } else {
    //create li
    li = document.createElement('li');

    //create checkbox
    var checkbox  = document.createElement('input')
    checkbox.type = 'checkbox';
    checkbox.setAttribute('id','check')

    //create label
    var label = document.createElement('label');
    label.setAttribute('for','item')//optional

    ul.appendChild(label);
    li.appendChild(checkbox);
    label.appendChild(textnode);
    li.appendChild(label);
    ul.appendChild(li, ul.childNodes[0]);
    li.className ='visual';
  }
}
