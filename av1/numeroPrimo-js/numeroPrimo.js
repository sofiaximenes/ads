function isPrime(number) {
    if (number <= 1) {
        return false;
    }

    if (number === 2) {
        return true;
    }

    if (number % 2 === 0) {
        return false;
    }

    for (let i = 3; i <= Math.sqrt(number); i += 2) {
        if (number % i === 0) {
            return false;
        }
    }

    return true;
}

const numero = 48;
if (isPrime(numero)) {
    console.log(`${numero} é primo.`);
} else {
    console.log(`${numero} não é primo.`);
}
