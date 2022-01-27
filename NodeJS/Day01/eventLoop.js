let x = 20;
let y = 30;
let z = x + y;
console.log(`z= ${z}`);

setTimeout(() => {
    console.log('This is inside callback method');
}, 1000);

console.log('last line !');