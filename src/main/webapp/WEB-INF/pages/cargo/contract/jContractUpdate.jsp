<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../base.jsp"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title></title>
</head>
<body>
<form method="post">
<input type="hidden" name="id" value="${obj.id}"/>

<div id="menubar">
<div id="middleMenubar">
<div id="innerMenubar">
    <div id="navMenubar">
<ul>
<li id="save"><a href="#" onclick="formSubmit('update.action','_self');">确定</a></li>
<li id="back"><a href="list.action">返回</a></li>
</ul>
    </div>
</div>
</div>
</div>
     
<div class="textbox" id="centerTextbox">
    
    <div class="textbox-header">
    <div class="textbox-inner-header">
    <div class="textbox-title">
			修改购销合同
    </div> 
    </div>
    </div>
<div>

    <div>
		<table class="commonTable" cellspacing="1">
			<tr>
				<td class="columnTitle_mustbe">客户姓名：</td>
				<td class="tableContent"><input type="text" name="customName" value="${obj.customName}"/></td>
				<td class="columnTitle_mustbe">合同号：</td>
				<td class="tableContent"><input type="text" name="contactNo" value="${obj.customName}"/></td>
			</tr>
			<tr>
				<td class="columnTitle_mustbe">制单人：</td>
				<td class="tableContent"><input type="text" name="inputBy" value="${obj.customName}"/></td>
				<td class="columnTitle_mustbe">审单人：</td>
				<td class="tableContent"><input type="text" name="checkBy" value="${obj.checkBy}"/></td>
			</tr>
			<tr>
				<td class="columnTitle_mustbe">验货员：</td>
				<td class="tableContent"><input type="text" name="inspector" value="${obj.inspector}"/></td>
				<td class="columnTitle_mustbe">签单日期：</td>
				<td class="tableContent"><input type="text" name="singingDate" value="${obj.singingDate}"/></td>
			</tr>
			<tr>
				<td class="columnTitle_mustbe">交货日期：</td>
				<td class="tableContent"><input type="text" name="deliveryPeriod" value="${obj.deliveryPeriod}"/></td>
				<td class="columnTitle_mustbe">船期：</td>
				<td class="tableContent"><input type="text" name="shipTime" value="${obj.shipTime}"/></td>
				<td class="columnTitle_mustbe">总金额：</td>
				<td class="tableContent"><input type="text" name="totalAmount" value="${obj.totalAmount}">
			</tr>
		</table>
	</div>
</div>
 
 
</form>
</body>
</html>

