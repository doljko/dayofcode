// var h = document.createElement('h1')
// var myValue = document.createTextNode('Hello Word!')
//
// h.appendChild(myValue)
// document.querySelector('h1').appendChild(h);

//  var val= 5;
// while (val>0) {
//     console.log(val);
//     val--;
// }
var ul = document.getElementById('list')
var li;

var addButton = document.getElementById('add');
addButton.addEventListener('click', addItem);

var removeButton = document.getElementById('remove');
removeButton.addEventListener('click',removeItem)


function addItem() {
  var input = document.getElementById('input');
  var item = input.value;
  ul = document.getElementById('list');
  var textnode = document.createTextNode(item)

    if(item==''){
      return false;
      //Add a p tag and assign value enter to do
    }else {
      //create li
      li = document.createElement('li');

      //create checkbox
      var checkbox = document.createElement('input');
      checkbox.type='checkbox';
      checkbox.setAttribute('id','check');


      //create label
      var label = document.createElement('lebel');
      label.setAttribute('for','item') //optional

          //add getElementById
          ul.appendChild(label);
          li.appendChild(checkbox);
          label.appendChild(textnode);
          li.appendChild(label);
          ul.insertBefore(li, ul.childNodes[0]);
        setTimeout(() => {
          li.className ='visual';
        }, 2);
           input.value = '';

    }
}


function removeItem() {
 li= ul.children
 for(let index= 0; index <li.length; index++)
  while (li[index] && li[index].children[0].checked) {
    ul.removeChild(li[index])
  }

}
