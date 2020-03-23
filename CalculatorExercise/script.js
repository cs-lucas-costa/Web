
//import { calculate } from ".Operation";
var numbers = [];
var operator = null;

var selectButton = document.getElementsByClassName("button numeric")

selectButton.onclick = function() {
    numbers.push(selectButton.id)
}

function result() {
    //calculate(numbers, operator);
}

