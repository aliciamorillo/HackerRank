/*
 * Implement a Polygon class with the following properties:
 * 1. A constructor that takes an array of integer side lengths.
 * 2. A 'perimeter' method that returns the sum of the Polygon's side lengths.
 */

class Polygon {
    constructor(heights){
        var polygonPerimeter = 0;
        for(var index in heights){
            polygonPerimeter += heights[index];
        }
        
        this.myPerimeter = polygonPerimeter;
    }
    
    perimeter(){
        return this.myPerimeter;
    }
}