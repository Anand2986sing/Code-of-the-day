// Arrow function 
const sayHello = () =>{
    console.log("Hello");
}

const sayBye = () => console.log("byee");
sayHello(); // Hello
sayBye();

let sum = (a, b) => a + b;
console.log(sum(5, 7)); // 12

let obj = {
    greeting: "good morning",
    names: ["John", "Jane"],

    Speak(){
        this.names.forEach((student) => {
            console.log(this.greeting + " kukdooo kooo "+student)  // this. is also find greeting in out of speak scope, that is only availabe due to use of arrow function
        }) 
    }
}
obj.Speak(); // good morning kukdooo kooo John, good morning kukdooo kooo
