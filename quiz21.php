<?php 

/*    Note:
        Quiz No: 21
        Deadline: May 30th, 14:00
*/

    function Algo($l, $r, $var, $ar) 
    { 
    	if ($r >= $l) 
    	{ 
    		$x = (int)($l + ($r - $l) / 3); 
    		$y = (int)($r - ($r - $l) / 3); 
            if ($ar[$x] == $var) return $x; 
            if ($ar[$y] == $var) return $y; 
            if ($var < $ar[$x])  
                return Algo($l, $x - 1, $var, $ar); 
    		else if ($var > $ar[$y]) 
    		    return Algo($y + 1, $r, $var, $ar); 
    		else 
    		    return Algo($x + 1, $y - 1, $var, $ar); 
    	} 
        return -1; 
    } 

// Driver code 
    $ar = array( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ); 
    $l = 0; 
    $r = 9; 
    $var = 5; 
    $ans = Algo($l, $r, $var, $ar); 
    echo "Answer of ", $var," is ", (int)$ans, "\n"; 
     
?> 
