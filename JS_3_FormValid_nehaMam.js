// form validations -> project 
// 1> please fill ur name
// 2> please fill ur password
// 3> password mismatch 

 function abc()
 {
   var a= document.myform.n1.value;
   var b= document.myform.n2.value;
   var c= document.myform.n3.value;


 if(a==null)
   {
    alert("please fill ur name");
    return false;
   }
 
 if(b==null)
    {
       alert("please fill ur Password");
       return false;
    }

 if(c==null)
    {
       alert("please fill conform pass");
       return false;
    }

if(b!=c){
    alert("password mismatch");
    return false;
}

}



// =============HTML CODE=================
/*

<form name="myform">
        Name<input type="text" size="10" name="n1">
        <br>
        Password<input type="password" size="10" name="n2">
        <br>
        Name<input type="password" size="10" name="n3">
        <br>
        <input type="submit" onclick="return abc()">
    </form>


*/