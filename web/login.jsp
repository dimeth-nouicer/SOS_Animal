<%-- 
    Document   : login
    Created on : 10 déc. 2017, 16:08:31
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
	<link href="css/style.css" rel="stylesheet" type="text/css" />
        <title>JSP Page</title>
    </head>
    <body>
        <div id="header">
	           		<a href="index.html" id="logo"><img src="images/logo.gif" width="310" height="114" alt="" title=""></a>
					<ul class="navigation">
						<li ><a href="index.html">Home</a></li>
						<li><a href="petmart.html">PetMart</a></li>
						<li ><a href="about.html">About us</a></li>
						<li class="active"><a href="blog.html">Blog</a></li>
						<li ><a href="login.jsp">Myaccount</a></li>
						<li ><a href="contact.html">Contact us</a></li>
					</ul>
			</div>
        
        <div id="body">
			 <jsp:useBean id="user" scope="request" class="beans.User"></jsp:useBean>
			       <div id="content">
				   
				        <div class="content">
                                            <form action="loginservlet" methode="post">
						<div class="search">
                                                                        <h2>E-mail</h2>
									<input type="text" name="s" value="email">
                                                                       
								</div>
                                                <div class="search">
                                                                        <h2>Password</h2>
                                                                        <input type="text" name="s" value="password">
                                                                        <button>&nbsp;</button>
								</div>                
							   
							   
                                            </form>    
						</div>
                                                
					    <div id="sidebar">
						
						     
						       
								
					    </div>
				   </div>
			
    </body>
</html>
