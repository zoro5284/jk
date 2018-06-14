<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="base.jsp" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<meta charset="utf-8">
<head>
<title>陕西杰信商务综合管理平台</title>
	<link rel="stylesheet" rev="stylesheet" type="text/css" href="${ctx}/skin/default/css/login.css" media="all" />
</head>
<script src="${ctx}/js/jquery/jquery-1.4.2.js"></script>
<script type="text/javascript">
    $(function(){

        $("#loginbutton").click(function () {
            // alert("hello");
            var phone = $("#phone").val();
            var password = $("#password").val();
            // $("#phone").val("");
            // $("#phone").val("123");
            //
            console.log(phone);
            console.log(password);
            // $("#erromsg").html("不存在该用户");
            var d = {
                "phone": phone,
                "password": password
            };



            $.ajax({
				type:'post',
                url:'${ctx}/fmain.action',
                data:JSON.stringify(d),
                dataType:'json',
                contentType:'application/json',
                success:function (data) {
					if(data.state==1){
					    window.location.href="${ctx}/loginTo.action";
					}else if(data.state==2){
					    $("#erromsg").html("不存在该用户");
					}else{
					    $("#erromsg").html("用户名或密码错误");
					}
                }

            });
        });


    })
</script>

<body>
<form id="login_main" method="post">
<div id="warpbox">
	<div class="main">
		 <div class="zck">
		  <div class="zc">
				<div class="zc_line">用户名：
				<input type="text" value="" name="phone" id="phone"
				 <%--onkeyup="showGs(event)"--%>
				 <%--onFocus="this.select();"--%>
				 autocomplete="off" title="请您输入用户名"/><div id="ts" style="z-index:1;"></div></div>
			    <div class="zc_line">密　码：
				<input type="password" value="" name="password" id="password"
		    	 title="请您输入密码"/></div>
		  </div>
			<div class="dl">
				<input id="loginbutton"  class="loginImgOut" value="" type="button"
				  onmouseover="this.className='loginImgOver'" 
				  onmouseout="this.className='loginImgOut'"
				/>
				<input class="resetImgOut" value="" type="button"   
				  onmouseover="this.className='resetImgOver'" 
				  onmouseout="this.className='resetImgOut'"
				/>
			</div>



		</div>

		<div class="bqxx" style="text-align:right;margin-top:0px;">
            <div class="erro" style="float:left;margin-left: 40px " id="erromsg">

            </div>
		<a href="#">系统帮助</a> | <a href="#" onclick="bookmarkit();">加入收藏</a>
	    </div>


</div>
</form>
<script type="text/JavaScript">
	document.getElementById('login_main').userName.focus();
</script>

</body>
</html>


