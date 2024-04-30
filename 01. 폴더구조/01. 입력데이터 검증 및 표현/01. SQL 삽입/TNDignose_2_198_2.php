1: $MessageFile = "cwe-94/messages.out";
2: if ($_GET["action"] == "NewMessage") {
3: $name = $_GET["name"]; 
4: $message = $_GET["message"]; 
5: $handle = fopen($MessageFile, "a+"); 
6: fwrite($handle, "<b>$name</b> says '$message'<hr>\n");
7: fclose($handle);
8: echo "Message Saved!<p>\n";
9: } else if ($_GET["action"] == "ViewMessages") {
10: include($MessageFile);
11:}