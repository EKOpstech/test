 vul.php
 $myvar = 'somevalue'; 
 $x = $_GET['arg']; 
 eval('$myvar = ' . $x . ';');