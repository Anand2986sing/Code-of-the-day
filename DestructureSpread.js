// Array Destructure and spread 

// destructure
let arr = [1,2,3,4,5,6,7];

//don't do like this
// let a = arr[0]
// let a1 = arr[1]
// let a2 = arr[2]
// let a3 = arr[3]


let[a, a1, a2, a3] = arr
console.log(a, a1, a2, a3)

let[a, a1, a2, a3, ...rest] = arr
console.log(a, a1, a2, a3, rest)


let[a, , , a3, ...rest] = arr
console.log(a, a3, rest)

let{a, b} = {a:5, b:10}
console.log(a,b, arr)




// spread 
let arr1 = [1,2,3];
let obj1 = {...arr1}; // creats same array in form of object key pair
console.log(obj1)  

function sumval(v1, v2, v3){
    return v1+v2+v3;
}
console.log(sumval(...arr1))


console.log(sumval(arr1)) // this will give error because it is array not arguments
console.log(sumval(...arr1)) // this will give error because it is array not arguments


// Etra points that will help while doing coding in react
let obj = {
    name1: "Rahul",
    company: "a2it",
    address : "zyz"
}

//this will print with overriding
console.log({...obj, name1 :"Anand", company:"cgc"});

// this will print vlaue without any changes, we made changes before copying value in obj
console.log({name1:'Anand', company:"cgc", ...obj});
