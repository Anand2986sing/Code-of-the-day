// video 2 topic is
// Loop/control structure 
// we can this concept when we have to execute same work again and again
// for
// if else  => if we have condition 
// while
// break    => to stop
// continue  => to skip
// switch   => if number of cases is huge
// do while 



// print 1 to 100 using for loop
var a;
for(a=1; a<=100; a++){   // a++ == a+=1 == a=a+1
    console.log(a);
}


//print 1 to 100 using for loop reverse order
var b;
for(b=100; b>=1; b--){   
    console.log(b);
}


// print 10 , 20, 30 ... till 100
var c;
for(c=10; c<=100; c+=10){
    console.log(c);
}




//==================IF-Else===================
//check either user is eligible for voting or not
// condition if age is less than 18 then user is not eligible for voting
var age = 17;
if(age>=18){
    console.log("user is eligible for voting");
}else{
    console.log("user is not eligible for voting");
}



// is number is even or odd
var nums=19;
if(nums%2 == 0){
    console.log("number is even");
}
else{
    console.log("number is odd");
}



//if n>0 postive, n==0 then zero, n<0 then negative
var n= -1;
if(n>0){ 
    console.log("number is positive");
}
else if(n==0){
    console.log("number is zero");
}
else{
    console.log("number is negative");
}



// ====================While loop=======================
var i = 1;
while(i<=10){
    console.log(i);
    i = i+1;
}


//print 1 to 10 but stop if we have 6
var j = 1;
while (j<=10) {
    if(j==6){
        break;
    }
    console.log(j);
    j++;
}



//print 1 to 10 but skip if we have 6
var j = 1;
while (j<=10) {
    if(j==6){
        continue;
    }
    console.log(j);
    j++;
}




// =================================SWITCH Statement=================

var color ;
color=1;
switch(color){
    case 1:
        console.log("Your fav color is red");
        break;
    case 2:
        console.log("Your fav color is blue");
        break;
    case 3:
        console.log("Your fav color is green");
        break;
    default:
        console.log("no color match");
}





// =============DO While=========================

//print 1 to 10 using do while loop 
var k=1;
do{
    console.log(k);
    k++;
}while(k<=10);