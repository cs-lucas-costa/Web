function validateForm() {

    let numberOne = document.forms["calculatorForm"]["firstNumber"].valueAsNumber;
    let numberTwo = document.forms["calculatorForm"]["secondNumber"].valueAsNumber;

    return !(isNaN(numberOne) || isNaN(numberTwo))
}