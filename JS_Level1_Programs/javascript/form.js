    // sample user data

let userName = " Niti Dwivedi";
let age = "34";
let isSubscribed = "true";

let number1 ="40";
let number2 = "30";

// for the validation

function validateForm(userName , age , isSubscribed)
{

let userNameType = typeof userName;
let ageType = typeof age;
let isSubscribedType = typeof isSubscribed;


console.log("UserName :" + userName + "Data Type "  , userNameType);
console.log("Age  :" + age+ "Data Type "  , ageType);
console.log("isSubsribed :" + isSubscribed + "Data Type "  , isSubscribedType);


//conversion
age = Number(age);
isSubscribed = isSubscribed === "true";


console.log("Age  :" + age+ "After conversion the Data Type is  "  , typeof age);
console.log("IsSubscribed :" +isSubscribed + "Data Type "  , typeof isSubscribed);

}
validateForm(userName , age , isSubscribed)

