function algo(x, y) {

  let n = Math.min(('' + x).length, ('' + y).length);

  if(n == 1)
    return x * y;

  let e = Math.pow(10, parseInt(n / 2));
  let f = Math.pow(10, 2 * parseInt(n / 2));

  let a = parseInt(x / e);
  let b = x % e;
  let c = parseInt(y / e);
  let d = y % e;

  return f * algo(a, c)
    + e * (algo(a, d)
    + algo(b, c))
    + algo(b, d)
}

//you can use any 2 numbers here
t = 1234; 
q = 3423;

console.log(algo(t, q))
