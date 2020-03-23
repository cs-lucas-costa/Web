function selectMateria() {

    var checkboxs = document.getElementsByName('ckMateria')
    var dvConteudo = document.getElementById('dvConteudo')

    for (let index = 0; index < checkboxs.length; index++) {
        const element = checkboxs[index];
        
        if (element.checked == true) {
            dvConteudo.innerHTML += element.id
        }
    }
}

