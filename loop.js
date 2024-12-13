//Loop in js

// 1>  for loop
//print number from 1 to 10 using for loop
for(let i=1; i<=10; i++){
    console.log(i)
}


// 2> while loop, print 1 to 10 using while loop
let i=1;
while(i<11){
    console.log(i);
    i++;
}


// 3> Do while loop 
let j=1;
do{
    console.log(j);
    j++;
}while(j<11);

//4> for in loop 
let obj = {
    name : "Anand",
    role : "programmer",
    company: " cgc "
}

for(const key in obj){
    console.log(key, obj[key]);
}


// 5> for off loop
for(const c of "Anand"){
    console.log(c);
}
