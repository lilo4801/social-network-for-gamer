<%-- 
    Document   : newjsp
    Created on : Jun 10, 2022, 5:24:18 PM
    Author     : LENNOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="../../library/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="../../library/bootstrap.min.js" type="text/javascript"></script>
        <script src="../../library/jquery.min.js" type="text/javascript"></script>
    </head>
    <body>
        <button data-bs-toggle="modal" data-bs-target="#exampleModal1">aaa</button>
        <div class="modal fade" id="exampleModal1" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Create Product</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="row">
                        
                        <div class="nameProduct" style="border: 1px">
                            <p>Acccccc BBBB CCCC</p>
                            <p>aaa</p>
                        </div>
                        <div class="description-product" style="margin-bottom: 15px">
                            <div style="border: 1px solid black; margin-bottom: 10px">
                                <p>aasadasfsafsafsafafas sadnsasd sadksjald asjdlasj</p>
                            </div>
                            <div style="text-align: center">
                                <a style="border: 1px solid red; padding: 5px 8px 5px 8px;">870$</a>
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                        <button type="submit" class="btn btn-primary">Create</button>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
