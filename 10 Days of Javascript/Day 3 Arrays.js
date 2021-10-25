/**
*   Return the second largest number in the array.
*   @param {Number[]} nums - An array of numbers.
*   @return {Number} The second largest number in the array.
**/
function getSecondLargest(nums) {
    let first = -1 , second = -1;

    for(let i = 0; i <= nums.length-1; i++){
        if(nums[i] > first){
            second = first;
            first = nums[i];
        }
        else if( nums[i] > second && nums[i] != first){
            second = nums[i];
        }
    }
    return second;
}


