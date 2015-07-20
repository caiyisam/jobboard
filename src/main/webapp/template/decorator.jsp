<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%String path = request.getContextPath();%>

<link rel="stylesheet" type="text/css" href="<%=path%>/style/css/hdquerybar.css" />
<script type="text/javascript"  src="<%=path%>/scripts/js/hdquerybar.js"></script>
<table>
	<tr>
		<td>
			<div id="querytools"></div>
			<script>
	        	querygroupbar = new hdQueryToolbar("querytools");
	        	querygroupbar.createQueryArea(1);
	        	hdAjaxRequest("<%=request.getContextPath()%>/template2/query/1020?e=" + new Date().getTime(), "get", "groupqueryhandle", "");

				function groupqueryhandle(xmlText) {
					querygroupbar.setCondition(xmlText);
				}

				querygroupbar.setQueryHandlerFun("querygroup");
			</script>
		</td>
	</tr>
	<tr>
		<td>显示区域</td>
	</tr>
</table>
<div id="test">
	<sitemesh:write property='queryarea' />
</div>
<script>
	var a = document.getElementById("test").innerHTML;
	alert(a);
</script>