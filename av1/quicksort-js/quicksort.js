
function quicksort(arr) {
    if (arr.length <= 1) {
        return arr;
    }

    const pivot = arr[0];
    const left = [];
    const right = [];

    for (let i = 1; i < arr.length; i++) {
        if (arr[i] < pivot) {
            left.push(arr[i]);
        } else {
            right.push(arr[i]);
        }
    }

    return [...quicksort(left), pivot, ...quicksort(right)];
}

const arrayDesordenado = [6, 1, 8, 4, 9, 2, 5];
const arrayOrdenado = quicksort(arrayDesordenado);
console.log("Array ordenado:", arrayOrdenado);
