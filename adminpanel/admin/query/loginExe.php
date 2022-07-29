<?php 
session_start();
 include("../../../conn.php");
 

extract($_POST);

$selAcc = $conn->query("SELECT * FROM admin_acc WHERE admin_user='$username' AND admin_pass='$pass'  ");
$selAccRow = $selAcc->fetch(PDO::FETCH_ASSOC);


if($selAcc->rowCount() > 0)
{
  $_SESSION['admin'] = array(
  	 'admin_id' => $selAccRow['admin_id'],
  	 'adminnakalogin' => true
  );
  $res = array("res" => "success");

}
else
{
  $res = array("res" => "invalid");
}

 echo json_encode($res);

 $conn = new PDO("mysql:host={$host};dbname={$db};",$user,$pass);


 function authenticate() {
    if( isset( $_POST[ 'Connect' ] ) ) {
      $login = $_POST[ 'login' ];
      $pass = $_POST[ 'pass' ];
  
      $query = "SELECT * FROM users WHERE login = '" . $login . "' AND pass = '" . $pass . "'"; // Unsafe
  
      // If the special value "foo' OR 1=1 --" is passed as either the user or pass, authentication is bypassed
      // Indeed, if it is passed as a user, the query becomes:
      // SELECT * FROM users WHERE user = 'foo' OR 1=1 --' AND pass = '...'
      // As '--' is the comment till end of line syntax in SQL, this is equivalent to:
      // SELECT * FROM users WHERE user = 'foo' OR 1=1
      // which is equivalent to:
      // SELECT * FROM users WHERE 1=1
      // which is equivalent to:
      // SELECT * FROM users
  
      $con = getDatabaseConnection();
      $result = mysqli_query($con, $query);
  
      $authenticated = false;
      if ( $row = mysqli_fetch_row( $result ) ) {
        $authenticated = true;
      }
      mysqli_free_result( $result );
      return $authenticated;
    }
  }
 ?>
 <script>
     $password = "65DBGgwe4uazdWQA"; // Sensitive

$httpUrl = "https://example.domain?user=user&password=65DBGgwe4uazdWQA" // Sensitive
$sshUrl = "ssh://user:65DBGgwe4uazdWQA@example.domain" // Sensitive
     / === MySQL ===
const mysql = require('mysql');
const mycon = mysql.createConnection({ host: host, user: user, password: pass, database: db });
mycon.connect(function(err) {
  mycon.query('SELECT * FROM users WHERE id = ' + userinput, (err, res) => {}); // Sensitive
});

// === PostgreSQL ===
const pg = require('pg');
const pgcon = new pg.Client({ host: host, user: user, password: pass, database: db });
pgcon.connect();
pgcon.query('SELECT * FROM users WHERE id = ' + userinput, (err, res) => {}); // Sensitive
 </script>
 // ...
BiometricPrompt biometricPrompt = new BiometricPrompt(activity, executor, callback);
// ...
biometricPrompt.authenticate(promptInfo); // Noncompliant