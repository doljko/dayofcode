let myTodos = {
  day:'Monday',
  meetings:0,
  meetDone:0,

  addMeeting: function(num){
  //  console.log(this); // trying to referrrnr for all current object
  this.meetings = this.meetings  + num
},
  summary: function(){
    return`You have  ${this.meetings} meetings today`
  }
}
myTodos.addMeeting(4)
console.log(myTodos.summary());
