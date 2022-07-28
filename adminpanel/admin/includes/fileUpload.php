 <div class="row" style="margin-left: 550px;margin-top: 50px;">
                            
                            <div class="col-md-12 col-lg-12">
                                <div class="mb-3 card">
                                    <div class="card-header-tab card-header">
                                        <div class="card-header-title fsize-4" >
                                            <i class="header-icon lnr-rocket icon-gradient bg-tempting-azure"> </i>
                                            Exam Practice Uploads
                                        </div>

                                    </div>
                                    <div class="tab-content">
                                        <div class="tab-pane fade active show" id="tab-eg-55">
    
                                            <div class="pt-2 card-body">
                                                <div class="row">
                                                    <div class="col-md-6 col-lg-12">
                                                        <div class="widget-content">
                                                            <div class="widget-content-outer">
                                                                <div class="widget-content-wrapper">
                                                                    <div class="widget-content-left">
                                                                        <div class="widget-numbers fsize-3 text-muted" style="margin-right: 50px;">Upload a File:</div>
                                                                    </div>
                                                                    <div class="widget-content-right">
                                                                    <div class="form-group">
                                                                    <form  method="post" enctype="multipart/form-data">
                                                                        <input type="file" class=" fsize-2" name="the_file" id="the_file">
                                                                        </div>
                                                                        </div>
                                                                        
                                                                        <button type="submit" name="submit" class="btn btn-primary fsize-2">Start Upload</button>
                                                                    </form>
                                                                    </div>
                                                                </div>
                            
                                                            </div>
                                                        </div>
                                                    </div>

                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

<?php
 
 try{
   if (isset($_FILES['the_file'])) {
 
     $fileName = $_FILES['the_file']['name'];
     $fileTmpName  = $_FILES['the_file']['tmp_name'];
     $parent = dirname(__DIR__);
     $uploadPath = $parent."\\includes\\uploads\\".$fileName;
 
       if (empty($errors)) {
         $didUpload = move_uploaded_file($fileTmpName, $uploadPath);
 
         if ($didUpload) {
           echo "<script>alert('File succesfully uploaded');</script>";
           
         } else {
           echo "<script>alert('An error occurred. Please contact the administrator.');</script>";
         }
       }
 
     }
 
   }//catch exception
 catch(Exception $e) {
   echo 'Message: ' .$e->getMessage();
 }
 ?>