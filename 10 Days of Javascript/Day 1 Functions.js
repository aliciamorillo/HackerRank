
function factorial(n){
    var total = 1; 
    
    for (var i=1; i<=n; i++) {
        total = total * i; 
    }
    
    return total; 
}