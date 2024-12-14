
//Example of Asynchronous in javaScript
console.log("h1")
console.log("h2")

setTimeout(() =>{
    console.log("hello")
},4000)

console.log("h3")
console.log("h4")
//due to asynchronus pahle charo h print ho jayega then Hello, because hello jayada time laga raha hai


//Example of callback 
//when we use function in another function is call callback
let add=(a,b) => console.log(a+b);

function calculator (a,b,callback){
    callback(a,b);
}

calculator(5,6,add);



//what is callback hell?
//callback hell is a situation when we have multiple callback in a single function
//it is also called pyramid of doom
function getData(dataId, getNextdata) {
    setTimeout(() => { 
        console.log("data", dataId);

        if(getNextdata){
            getNextdata();
        }
    }, 2000)
}

getData(1, () => {
    console.log("fetchind data 2.....")
    getData(2, () => {
        console.log("fetchind data 3.....")
        getData(3, ()=>{
            console.log("fetchind data 4.....")
            getData(4);
        })
    })
})
// this above code is not a good practice, and not understandable in real life if we use this concept it is called callback hell
// and to solve this we use concept of PROMISES




//PROMISES

let promise = new Promise ((resolve, reject) => {
    //resolve and reject function is created by javascript
    console.log("I am a promise");
    // reject("Some error occure");
    resolve("I am a resolved");
})


function getData(dataId, getNextdata) {
    return new Promise((resolve, reject) => {
   
    setTimeout(() => { 
        console.log("data", dataId);
        resolve("Sucess...")
        if(getNextdata){
            getNextdata();
        }
    }, 9000)
    })
}
let promise = getData(1)
console.log(promise)



const getPromise=() => {
    return new Promise((resolve, reject) => { 
        console.log("I am a promise");
        resolve("Succesful");
        // reject("un-succesful")
    });
};

let promise = getPromise();
promise.then((res) => {  //this result come automatically
    console.log("Promise fulllfil", res);
});

promise.catch((err) => {  //this error comes automatically
    console.log("Promise rejected", err); 
})




function getData(dataId) {
    return new Promise((resolve, reject) => {
   
    setTimeout(() => { 
        console.log("data", dataId);
        resolve("Sucess...")
        
    }, 3000)
    })
}


// Promise chaining/chain

getData(1).then((res) => {
    console.log(res);
    getData(2).then(() => {
        console.log(res);
    })
})

// OR 

getData(1).then((res) => {
    return getData(2);
})
.then((res) => { 
    return getData(3);
})
.then((res)=>{
    console.log(res);
})




// Async and await 

// any sync fuction always return a promise in async function 
async function hello(){
    console.log("hello")
}
hello() 




// await is something who wait to execute current line then 
function Api(){
    return new Promise((resolve, reject) => { 
        setTimeout(() => { 
            console.log("weather data.. sucsessful")
            resolve("sucsessfuly resolve")
        },3000);
    });
};

async function getweatherData(){
    await Api(1);
    await Api(2);
    await Api(3);
}
getweatherData();
