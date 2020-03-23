//ENUM
const operators = {
	SUM: '+',
	SUBTRACT: '-',
	MULTIPLY: '*',
	DIVIDE: '/'
}

//Realizar o calculo da operacao escolhida.
function mathOperation(operator) {

	var result;
	const firstNumber = document.getElementById('firstNumber').valueAsNumber;
	const secondNumber = document.getElementById('secondNumber').valueAsNumber;
	var resultLabel = document.getElementById('result');

	if (isNaN(firstNumber) || isNaN(secondNumber)) { 
		alert("ERROR -> Algum número está vazio")
		resultLabel.innerHTML = 0;
	} else {
		switch(operator) {
		case operators.SUM:
			result = firstNumber + secondNumber
			break
		case operators.SUBTRACT:
			result = firstNumber - secondNumber
			break
		case operators.MULTIPLY:
			result = firstNumber * secondNumber
			break
		case operators.DIVIDE:
			result = firstNumber/secondNumber
			break
		}

		resultLabel.innerHTML = result;
	}
	
}