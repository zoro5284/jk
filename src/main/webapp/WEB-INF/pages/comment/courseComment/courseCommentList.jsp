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
  课程评价列表
  </div> 
  </div>
  </div>
  
<div>

<div class="eXtremeTable" >
<table id="ec_table" class="tableRegion" width="98%" >
	<thead>
	<tr>
		<td class="tableHeader"><input type="checkbox" name="selid" onclick="checkAll('id',this)"></td>
		<td class="tableHeader">序号</td>
		<td class="tableHeader">班级编号</td>
		<td class="tableHeader">课程</td>
		<td class="tableHeader">教师工号</td>
		<td class="tableHeader">教师</td>
		<td class="tableHeader">开课时间</td>
		<td class="tableHeader">查看</td>
	</tr>
	</thead>
	<tbody class="tableBody" >
	
	<c:forEach items="${list}" var="o" varStatus="status">
	<tr class="odd" onmouseover="this.className='highlight'" onmouseout="this.className='odd'" >
		<td><input type="checkbox" name="id" value="${o.classId}"/></td><%--form表单从此处获取要修改的id--%>
		<td>${status.index+1}</td>
		<td>${o.classId}</td>
		<td>${o.courseName}</td>
		<td>${o.classs.teacherId}</td>
		<td>${o.classs.teacherName}</td>
		<td>${o.classs.classTime }</td>
		<td><a href="selectClassCommentList.action?classId=${o.classId}">查看</a></td>
	</tr>
	</c:forEach>
	
	</tbody>
</table>
</div>
 
</div>
 
 </div>
</form>
</body>
</html>

