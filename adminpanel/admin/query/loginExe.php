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

 string userName = ctx.getAuthenticatedUserName();
 string query = "SELECT * FROM items WHERE owner = '" + userName + "' AND itemname = '" + ItemName.Text + "'";
 sda = new SqlDataAdapter(query, conn);
 DataTable dt = new DataTable();
 sda.Fill(dt);
 ?>