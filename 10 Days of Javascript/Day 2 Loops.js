/*
 * Complete the vowelsAndConsonants function.
 * Print your output using 'console.log()'.
 */
function vowelsAndConsonants(s) {
    const vowels = s.match(/[aeiou]/gi); 
    const consonants = s.match(/[^aeiou]/gi);   
    
    vowels.forEach(k => { console.log(k); } );
    consonants.forEach(k => { console.log(k); } );
}

