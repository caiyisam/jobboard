<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>PMO TOOLS</title>
<link href="style/css/layout.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="style/css/dhtmlx/dhtmlxmenu_dhx_skyblue.css" />
<link rel="STYLESHEET" type="text/css" href="style/css/dhtmlx/dhtmlxtabbar.css" />
<script src="scripts/dhtmlx/dhtmlxcommon.js"></script>
<script src="scripts/dhtmlx/dhtmlxmenu.js"></script>
<script src="scripts/dhtmlx/dhtmlxtabbar.js"></script>
</head>

<body>
<div id="container">
  <div id="header">This is the Header</div>
  <div id="menu"><div id="menuObj"></div></div>
  <script>
  	var menu = new dhtmlXMenuObject("menuObj");
    menu.setIconsPath("images/menu/");
    menu.loadXML("scripts/dhtmlx/dhxmenu.xml?etc=" + new Date().getTime(), function() {    		
    });
  </script>
  <div id="main">
	<div id="content_tabbar" style="width:100%; height:100%;"/>
	<script>
		tabbar = new dhtmlXTabBar("content_tabbar", "top");
		tabbar.setSkin('dhx_terrace');
		tabbar.setImagePath("images/tabbar/");
		tabbar.enableTabCloseButton(true);
		tabbar.addTab("tab1", "欢迎", "*");
		tabbar.addTab("tab2", "周报", "*");
		tabbar.setHrefMode("ajax-html");
		tabbar.cells("tab1").attachURL("welcome.jsp");
		tabbar.cells("tab2").attachURL("<%=request.getContextPath()%>/bizcell/weekreport/1");
		tabbar.setTabActive("tab2");		
	</script>
	</div>
  <div id="footer">上海华东电脑股份有限公司</div>
</div>
</body>
</html>
