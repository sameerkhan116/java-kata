var binarySearch = function(nums, target) {

    
    var binSearch = function(nums, target) {
        // if(nums.length == 1) return 0;
        var mid = parseInt(nums.length / 2), low = 0, high = nums.length - 1;
        while(low <= high) {
            if(target < nums[mid]) {
                high = mid;
                return binSearch(nums.slice(low, high), target);
            }
            else if(target > nums[mid]) {
                low = mid + 1;
                return binSearch(nums.slice(low, high), target);
                
            }
            else return mid;
        }
        return -1;
    }

    var start = binSearch(nums, target);
    var end = binSearch(nums.slice(start+1), target) + start + 1;

    return [start, end];
}



console.log(binarySearch([5, 7, 7, 8, 8, 10], 9));