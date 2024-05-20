import java.util.Scanner;

Start
Take input array and Target
Initialise start = 0 and end = (array size -1)
Intialise mid variable
mid = (start+end)/2
if array[ mid ] == target then return mid
if array[ mid ] < target then start = mid+1
if array[ mid ] > target then end = mid-1
if start<=end then goto step 5
return -1 as Not element found
Exit