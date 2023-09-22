function somatorio(arr) {
    let soma = 0;

    for (let i = 0; i < arr.length; i++) {
        soma += arr[i];
    }

    return soma;
}

const conjuntoDeNumeros = [1, 2, 3, 4, 5];
const resultadoSoma = somatorio(conjuntoDeNumeros);
console.log(`O somatório do conjunto é: ${resultadoSoma}`);
  