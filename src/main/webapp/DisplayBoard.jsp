<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="style/css/dhtmlx/dhtmlxform_dhx_web.css"/>
<script src="scripts/dhtmlx/dhtmlxcommon.js"></script>
<script src="scripts/dhtmlx/dhtmlxform.js"></script>
</head>
<style type="text/css">
<!--
.input {
	color: #cccccc;
	width: 99%;
}

a:link,a:visited,a:hover,a:active {
	color: blue;
}

#bg {
	display: none;
	position: absolute;
	top: 0%;
	left: 0%;
	width: 100%;
	height: 100%;
	background-color: black;
	z-index: 1001;
	-moz-opacity: 0.7;
	opacity: .70;
	filter: alpha(opacity = 70);
}

#addgroup,#addcard {
	display: none;
	position: absolute;
	top: 25%;
	left: 22%;
	width: 53%;
	height: 49%;
	padding: 8px;
	border: 8px solid #E8E9F7;
	background-color: white;
	z-index: 1002;
	overflow: auto;
}
-->
</style>
<script type="text/javascript">
	function addgroup(){
        document.getElementById("bg").style.display ="block";
        document.getElementById("addgroup").style.display ="block";		
        
        showgroup();
	}
	
	function showgroup() {

		var bodyObj = document.getElementById('team_board').insertRow(
				document.getElementById('team_board').rows.length - 1);

		var cell0 = bodyObj.insertCell(0);
		var cell1 = bodyObj.insertCell(1);
		var cell2 = bodyObj.insertCell(2);
		var cell3 = bodyObj.insertCell(3);
		var cell4 = bodyObj.insertCell(4);
		var cell5 = bodyObj.insertCell(5);
		var cell6 = bodyObj.insertCell(6);

		for (var i = 0; i < document.getElementById('team_board').rows[0].cells.length; i++) {
			var cell = document.getElementById('team_board').rows[document
					.getElementById('team_board').rows.length - 2].cells[i];
			var listtable = document.createElement("table");

			var listtable_thead = document.createElement("thead");
			var listtable_thead_tr = document.createElement("tr");
			var listtable_thead_tr_th = document.createElement("th");
			listtable_thead_tr_th.innerText = "元数据管理";
			listtable_thead_tr.appendChild(listtable_thead_tr_th);
			listtable_thead.appendChild(listtable_thead_tr);
			listtable.appendChild(listtable_thead);

			var tempid = parseInt(100000 * Math.random());

			var listtable_tbody = document.createElement("tbody");
			var listtable_tbody_tr = document.createElement("tr");
			var listtable_tbody_tr_td = document.createElement("td");
			listtable_tbody_tr_td.innerHTML = '<a href="javascript:addcard(\'metadata_'
					+ (document.getElementById('team_board').rows.length - 2)
					+ '_' + tempid + '\');">Add a card...</a>';
			listtable_tbody_tr.appendChild(listtable_tbody_tr_td);
			listtable_tbody.appendChild(listtable_tbody_tr);
			listtable.appendChild(listtable_tbody);

			listtable.id = "metadata_"
					+ (document.getElementById('team_board').rows.length - 2)
					+ "_" + tempid;
			listtable.style.width = "100%";
			listtable.border = "1";
			listtable.style.align = "center";

			cell.appendChild(listtable);

		}
	}

	function addcard(cardid){
        document.getElementById("bg").style.display ="block";
        document.getElementById("addcard").style.display ="block";	
        
        showcard(cardid);
	}
	
	function showcard(cardid) {

		var cardbodyObj = document.getElementById(cardid).insertRow(
				document.getElementById(cardid).rows.length - 1);

		var cardcell = cardbodyObj.insertCell(0);
		var cardtable_div = document.createElement("div");
		cardtable_div.innerText = "菜单管理";
		cardcell.appendChild(cardtable_div);

	}

	function hidegroup() {
        document.getElementById("bg").style.display ='none';
        document.getElementById("addgroup").style.display ='none';
    }
	
	function hidecard() {
        document.getElementById("bg").style.display ='none';
        document.getElementById("addcard").style.display ='none';
    }

</script>
<body>
<table width="1200px" border="1">
<thead>
    <tr>
      <th rowspan="2" style="width:300px;">Backlog</th>
      <th rowspan="2" style="width:300px;">Selected</th>
      <th colspan="3">Development</th>
      <th rowspan="2" style="width:300px;">Deploy</th>
      <th rowspan="2" style="width:300px;">Live</th>
    </tr>
    <tr>
      <th style="width:300px;">Analysis</th>
      <th style="width:300px;">Develop</th>
      <th style="width:300px;">Test</th>
    </tr>
</thead>
<tbody id="team_board" valign="top">
  <tr>
    <td><a href="javascript:addgroup();">Add a group...</a></td>
    <td><a href="javascript:addgroup();">Add a group...</a></td>
    <td><a href="javascript:addgroup();">Add a group...</a></td>
    <td><a href="javascript:addgroup();">Add a group...</a></td>
    <td><a href="javascript:addgroup();">Add a group...</a></td>
    <td><a href="javascript:addgroup();">Add a group...</a></td>
    <td><a href="javascript:addgroup();">Add a group...</a></td>
  </tr>
  </tbody>
</table>
<div id="bg"></div>
<div id="addgroup">新增模块
   	<div id="addGropForm" style="height:200px;"></div>
   	<script type="text/javascript">
   		var groupform = [{
        type: "settings",
        position: "label-left",
        labelWidth: 130,
        inputWidth: 120
    }, {
        type: "fieldset",
        label: "Welcome",
        inputWidth: "auto",
        list: [{
            type: "radio",
            name: "type",
            label: "Already have account",
            labelWidth: "auto",
            position: "label-right",
            checked: true,
            list: [{
                type: "input",
                label: "Login",
                value: "p_rossi"
            }, {
                type: "password",
                label: "Password",
                value: "123"
            }, {
                type: "checkbox",
                label: "Remember me",
                checked: true
            }]
            }, {
            type: "radio",
            name: "type",
            label: "Not registered yet",
            labelWidth: "auto",
            position: "label-right",
            list: [{
                type: "input",
                label: "Full Name",
                value: "Patricia D. Rossi"
            }, {
                type: "input",
                label: "E-mail Address",
                value: "p_rossi@example.com"
            }, {
                type: "input",
                label: "Login",
                value: "p_rossi"
            }, {
                type: "password",
                label: "Password",
                value: "123"
            }, {
                type: "password",
                label: "Confirm Password",
                value: "123"
            }, {
                type: "checkbox",
                label: "Subscribe on news"
            }]
            }, {
            type: "radio",
            name: "type",
            label: "Guest login",
            labelWidth: "auto",
            position: "label-right",
            list: [{
                type: "select",
                label: "Account type",
                options: [{
                    text: "Admin",
                    value: "admin"
                }, {
                    text: "Organiser",
                    value: "org"
                }, {
                    text: "Power User",
                    value: "poweruser"
                }, {
                    text: "User",
                    value: "user"
                }]
                }, {
                type: "checkbox",
                label: "Show logs window"
            }]
            }, {
            type: "button",
            value: "Proceed"
        }]
        }];
   		var groupForm = new dhtmlXForm("addGropForm", groupform);
   		
   	</script>
	<input id="btnclose" type="button" value="Close" onclick="hidegroup();"/>
</div>
<div id="addcard">新增卡片
	<div id="addCardForm" style="height:200px;"></div>
	<input id="btnclose" type="button" value="Close" onclick="hidecard();"/>
</div>

</body>
</html>