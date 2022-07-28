<?php 
 include("../../../conn.php");


extract($_POST);

$selExamineeFullname = $conn->query("SELECT * FROM examinee_tbl WHERE exmne_fullname='$fullname' ");
$selExamineeEmail = $conn->query("SELECT * FROM examinee_tbl WHERE exmne_email='$email' ");


if($gender == "0")
{
	$res = array("res" => "noGender");
}
else if($course == "0")
{
	$res = array("res" => "noCourse");
}
else if($year_level == "0")
{
	$res = array("res" => "noLevel");
}
else if($selExamineeFullname->rowCount() > 0)
{
	$res = array("res" => "fullnameExist", "msg" => $fullname);
}
else if($selExamineeEmail->rowCount() > 0)
{
	$res = array("res" => "emailExist", "msg" => $email);
}
else
{

	$insData = $conn->query("INSERT INTO examinee_tbl(exmne_fullname,exmne_course,exmne_gender,exmne_birthdate,exmne_year_level,exmne_email,exmne_password,exmne_studentID) VALUES('$fullname','$course','$gender','$bdate','$year_level','$email','$password','$StudentID_file')  ");
	if($insData)
	{
		$res = array("res" => "success", "msg" => $email);
	}
	else
	{
		$res = array("res" => "failed");
	}
}


echo json_encode($res);


// $file = rand(1000,100000)."-".$_FILES['uploadedFile']['name'];
// $file_loc = $_FILES['uploadedFile']['tmp_name'];
//  $folder="StudentID/";
 
 
//  $final_file=str_replace(' ','-',$file);
 
//  if(move_uploaded_file($file_loc,$folder.$final_file))
//  {
//     echo "File sucessfully upload";
//  }    

// 	$insData = $conn->query("INSERT INTO examinee_tbl(exmne_fullname,exmne_course,exmne_gender,exmne_birthdate,exmne_year_level,exmne_email,exmne_password,exmne_studentID) VALUES('$fullname','$course','$gender','$bdate','$year_level','$email','$password','$final_file')  ");
// 	if($insData)
// 	{
// 		$res = array("res" => "success", "msg" => $email);
// 	}
// 	else
// 	{
// 		$res = array("res" => "failed");
// 	}
 ?>

 