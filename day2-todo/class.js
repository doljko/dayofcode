class User {
  constructor(firstname, lastname, credit) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.credit = this.credit;
  }

  getFullName(){
    let fullname= `${this.firstname} ${this.lastname} is my full  name`;
    return fullname;
    //do this in just 1 line
  }
  editName(newname){
    const myname = newname.split(" ");
    this.firstname = myname[0];
    this.lastname = myname[1];
  }
}
const  john = new User("John","Anderson", 34);
console.log(john.getFullName());
john.editName('Johnny Anderson');
console.log(john.getFullName());
// const sammy = new User();
// console.log(sammy);
