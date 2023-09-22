
function contarNumerosInteiros(arr) {
    let contador = 0;

    for (let i = 0; i < arr.length; i++) {
        if (Number.isInteger(arr[i])) {
            contador++;
        }
    }

    return contador;
}

const array = [1, 2, 3, 4, 5, 1.5, "texto", true, -3];
const numerosInteiros = contarNumerosInteiros(array);
console.log(`O array contém ${numerosInteiros} números inteiros.`);