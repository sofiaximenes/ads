function fibonacci(n) {
    if (n <= 1) {
        return n;
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

const numeroDeTermos = 10;
for (let i = 0; i < numeroDeTermos; i++) {
    console.log(fibonacci(i));
}
  