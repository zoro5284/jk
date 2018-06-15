<%@ page language="java" pageEncoding="UTF-8"%>


<%@ include file="../../baselist.jsp"%>                                                                                                   
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title></title>
</head>

<body>
<form name="icform" method="post">

<div id="menubar">
<div id="middleMenubar">
<div id="innerMenubar">
  <div id="navMenubar">
<ul>
	<%--<li id="view"><a href="#" onclick="formSubmit('toview.action','_self');this.blur();">查看</a></li>--%>
	<%--<li id="new"><a href="#" onclick="formSubmit('tocreate.action','_self');this.blur();">新增</a></li>--%>
	<%--<li id="update"><a href="#" onclick="formSubmit('toupdate.action','_self');this.blur();">修改</a></li>--%>
	<%--<li id="delete"><a href="#" onclick="formSubmit('delete.action','_self');this.blur();">删除</a></li>--%>
    <%--<li id="new"><a href="#" onclick="formSubmit('start.action','_self');this.blur();">启用</a></li>--%>
 	<%--<li id="new"><a href="#" onclick="formSubmit('stop.action','_self');this.blur();">停用</a></li>--%>
 
</ul>
  </div>
</div>
</div>
</div>
   
<!-- 页面主体部分（列表等） -->  
<div class="textbox" id="centerTextbox">
  <div class="textbox-header">
  <div class="textbox-inner-header">
  <div class="textbox-title">
  评价详情
  </div> 
  </div>
  </div>
  
<div>

<div class="eXtremeTable" >
${commentDetail}

</div>
 
</div>
 
 </div>
</form>
</body>
</html>

