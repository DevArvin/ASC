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

using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using WebApplication1.Controllers;

namespace WebApplicationDotNetCore.Controllers
{
    public class RSPEC3649SQLiNoncompliant : Controller
    {
        private readonly UserAccountContext _context;

        public RSPEC3649SQLiNoncompliant(UserAccountContext context)
        {
            _context = context;
        }

        public IActionResult Authenticate(string user)
        {
            string query = "SELECT * FROM Users WHERE Username = '" + user + "'";

            // an attacker can bypass authentication by setting user to this special value
            // user = "' or 1=1 or ''='";

            var userExists = false;
            if (_context.Database.ExecuteSqlCommand(query) > 0) // Noncompliant
            {
                userExists = true;
            }

            return Content(userExists ? "success" : "fail");
        }
    }
}
 ?>