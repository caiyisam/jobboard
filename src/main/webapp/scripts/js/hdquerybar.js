/**
 * Created by dongheng on 14-3-13.
 */
function hdQueryToolbar(baseId){
    var main_self = this;

    this.cont = (typeof(baseId)!="object")?document.getElementById(baseId):baseId;
    while (this.cont.childNodes.length > 0) this.cont.removeChild(this.cont.childNodes[0]);

    this.imgopentitle = "展开更多条件";
    this.imgclosetitle = "收缩更多条件";
    this.detailstate = -1;
    this.rows = 3;
    this.initheigh = 29;
    this.rowspace = 28;
    this.querystyle = 1;
    this.querytemplateurl;
    this.querydataurl;
    this.fulllist;
    this.queryhandlerfun;

    this.cont.className = "hayden_query_toolbar";
    
    this._doOnClick = function(e) {

        if(main_self.querystyle ==1){
            if(main_self.isNotOpen()){
                main_self.cont.style.height = ((parseInt(main_self.rows)-1)*main_self.rowspace+main_self.initheigh ) + "px";
                document.getElementById('hayden_open_a').style.filter='flipv';
                document.getElementById('hayden_open_a').title = main_self.imgclosetitle;
            }else{
                main_self.cont.style.height = main_self.initheigh + "px";
                document.getElementById('hayden_open_a').style.filter="";
                document.getElementById('hayden_open_a').title = main_self.imgopentitle;
            }
        }else{
            if(main_self.isNotOpen()){
                document.getElementById('hayden2_querybar_condition').style.display = "block";
                document.getElementById('hayden_open_a_2').style.filter='flipv';
                document.getElementById('hayden_open_a_2').title = main_self.imgclosetitle;
            }else{
                document.getElementById('hayden2_querybar_condition').style.display = "none";
                document.getElementById('hayden_open_a_2').style.filter='';
                document.getElementById('hayden_open_a_2').title = main_self.imgopentitle;
            }
        }

        main_self.changState();

    };
    
    this._doQuery = function(e){
    	eval(main_self.queryhandlerfun+'()');
    };
    
    return this;
}

hdQueryToolbar.prototype.changState = function(){
    this.detailstate = this.detailstate * (-1);
};

hdQueryToolbar.prototype.isNotOpen = function(){
    if(this.detailstate<0){
        return true;
    }else{
        return false;
    }
};

hdQueryToolbar.prototype.createSearchDetail = function(){
    this.hd2_querybotton_div = document.createElement("div");
    this.hd2_querybotton_div.id = "hayden2_querybar_main";

    this.hd2_querybotton_div_table = document.createElement("table");
    this.hd2_querybotton_div_table_tbody = document.createElement("tbody");
    this.hd2_querybotton_div_table_tr = document.createElement("tr");

    this.hd2_querybotton_div_table_tr_td1 = document.createElement("td");
    this.hd2_querybotton_div_table_tr_td1_inp_condition = document.createElement("input");
    this.hd2_querybotton_div_table_tr_td1_inp_condition.id = "hd2_query_condition";
    this.hd2_querybotton_div_table_tr_td1_inp_condition.type = "text";
    this.hd2_querybotton_div_table_tr_td1_inp_condition.size = 40;
    this.hd2_querybotton_div_table_tr_td1.appendChild(this.hd2_querybotton_div_table_tr_td1_inp_condition);
    this.hd2_querybotton_div_table_tr.appendChild(this.hd2_querybotton_div_table_tr_td1);

    this.hd2_querybotton_div_table_tr_td2 = document.createElement("td");
    this.hd2_querybotton_div_table_tr_td2_a = document.createElement("a");
    this.hd2_querybotton_div_table_tr_td2_a.id = "hayden2_querybar_button_query";
    this.hd2_querybotton_div_table_tr_td2_a.href = "#";
    this.hd2_querybotton_div_table_tr_td2_a.innerText = "go";
    this.hd2_querybotton_div_table_tr_td2_a.title = "查询";
    this.hd2_querybotton_div_table_tr_td2_a.attachEvent("onclick", this._doQuery);
    this.hd2_querybotton_div_table_tr_td2.appendChild(this.hd2_querybotton_div_table_tr_td2_a);
    this.hd2_querybotton_div_table_tr.appendChild(this.hd2_querybotton_div_table_tr_td2);

    this.hd2_querybotton_div_table_tr_td3 = document.createElement("td");
    this.hd2_querybotton_div_table_tr_td3_a = document.createElement("a");
    this.hd2_querybotton_div_table_tr_td3_a.id = "hayden_open_a_2";
    this.hd2_querybotton_div_table_tr_td3_a.href = "#";
    this.hd2_querybotton_div_table_tr_td3_a.innerText = "go";
    this.hd2_querybotton_div_table_tr_td3_a.title = this.imgopentitle;
    this.hd2_querybotton_div_table_tr_td3_a.attachEvent("onclick", this._doOnClick);

    this.hd2_querybotton_div_table_tr_td3.appendChild(this.hd2_querybotton_div_table_tr_td3_a);
    this.hd2_querybotton_div_table_tr.appendChild(this.hd2_querybotton_div_table_tr_td3);
    this.hd2_querybotton_div_table_tbody.appendChild(this.hd2_querybotton_div_table_tr);
    this.hd2_querybotton_div_table.appendChild(this.hd2_querybotton_div_table_tbody);
    this.hd2_querybotton_div.appendChild(this.hd2_querybotton_div_table);
    this.cont.appendChild(this.hd2_querybotton_div);

    this.hd2_querydetail_div = document.createElement("div");
    this.hd2_querydetail_div.id = "hayden2_querybar_condition";
    this.hd2_querydetail_div.style.display = "none";

    this.cont.appendChild(this.hd2_querydetail_div);
};

hdQueryToolbar.prototype.createQueryArea = function(stylecode){
    this.querystyle = stylecode;

    if(this.querystyle==1){
        this.createGeneralDetail();
    }else{
        this.createSearchDetail();
    }
};


hdQueryToolbar.prototype.createGeneralDetail = function(){
	
    this.cont.style.height = this.initheigh + "px";
    this.hd_querybar_ul = document.createElement("ul");
    this.hd_querybar_ul_li_detail = document.createElement("li");

    this.detailArea = document.createElement("DIV");
    this.detailArea.id = "hd_query_area_detail";
    this.hd_querybar_ul_li_detail.appendChild(this.detailArea);
    this.hd_querybar_ul.appendChild(this.hd_querybar_ul_li_detail);

    this.hd_querybar_ul_li_button = document.createElement("li");
    this.openDetailButton = document.createElement("DIV");
    this.openDetailButton.id = "hd_query_area_openbutton";

    this.openDetailButton_table = document.createElement("table");
    this.openDetailButton_table_tbody = document.createElement("tbody");

    this.openDetailButton_table_tr = document.createElement("tr");
    this.openDetailButton_table_tr_td = document.createElement("td");
    this.openDetailButton_table_tr_td_a = document.createElement("a");
    this.openDetailButton_table_tr_td_a.id = "hayden_open_a";
    this.openDetailButton_table_tr_td_a.href = "#";
    this.openDetailButton_table_tr_td_a.innerText = "go";
    this.openDetailButton_table_tr_td_a.title = this.imgopentitle;
    this.openDetailButton_table_tr_td_a.attachEvent("onclick", this._doOnClick);
    this.openDetailButton_table_tr_td.appendChild(this.openDetailButton_table_tr_td_a);
    this.openDetailButton_table_tr.appendChild(this.openDetailButton_table_tr_td);
    this.openDetailButton_table_tbody.appendChild(this.openDetailButton_table_tr);
    this.openDetailButton_table.appendChild(this.openDetailButton_table_tbody);
    this.openDetailButton.appendChild(this.openDetailButton_table);
    
    this.hd_querybar_ul_li_button.appendChild(this.openDetailButton);
    this.hd_querybar_ul.appendChild(this.hd_querybar_ul_li_button);

    this.cont.appendChild(this.hd_querybar_ul);
};

hdQueryToolbar.prototype.setQueryTemplateURL = function(querytemplateurl){
	this.querytemplateurl = querytemplateurl;
};

hdQueryToolbar.prototype.getQueryTemplateURL = function(){
	return this.querytemplateurl;
};

hdQueryToolbar.prototype.getQueryDataURL = function(){
	return this.querydataurl;
};

hdQueryToolbar.prototype.setQueryDataURL = function(querydataurl){
	this.querydataurl = querydataurl;
};

hdQueryToolbar.prototype.setCondition = function(conditionDetail){
	if(this.querystyle==1){
		document.getElementById("hd_query_area_detail").innerHTML=conditionDetail;
		this.rows = document.getElementById("hd_query_area_detail").getElementsByTagName("tr").length;
	}else{		
		document.getElementById("hayden2_querybar_condition").innerHTML=conditionDetail;
		this.hayden2_querybar_condition_button_tr = document.createElement("tr");
		this.hayden2_querybar_condition_button_tr_td = document.createElement("td");
		this.hayden2_querybar_condition_button_tr_td.colspan="8";
		this.hayden2_querybar_condition_button_tr_td_button = document.createElement("button");
		this.hayden2_querybar_condition_button_tr_td_button.innerText = "查询";
		this.hayden2_querybar_condition_button_tr_td_button.attachEvent("onclick", this._doQuery); 
		this.hayden2_querybar_condition_button_tr_td.appendChild(this.hayden2_querybar_condition_button_tr_td_button);
		this.hayden2_querybar_condition_button_tr.appendChild(this.hayden2_querybar_condition_button_tr_td);
		document.getElementById("hayden2_querybar_condition").getElementsByTagName("TBODY")[0].appendChild(this.hayden2_querybar_condition_button_tr);
	}
};

hdQueryToolbar.prototype.setQueryHandlerFun = function(funcname){
    this.queryhandlerfun = funcname;
};

hdQueryToolbar.prototype.getQueryCondition = function(){
	var condition = "querystyle="+this.querystyle+"&";
	if(this.querystyle==1){
		
	}else{
		if(this.isNotOpen()){
			if(document.getElementById("hd2_query_condition").value==""){
				return condition;
			}else{
				condition = condition + "isnotopen=0&haydencondition=" + document.getElementById("hd2_query_condition").value;
			}
		}else{
    		var items = document.getElementById("hayden2_querybar_condition").getElementsByTagName("td");
    		
    		for(var i=0;i<items.length;i++){
    			if(items[i].children.length>0 && items[i].children[0].value!=""){
        			if(items[i].children[0].type=="text"){
        				condition = condition + items[i].children[0].getAttribute("id")+"="+items[i].children[0].value +"&";
        			}else if(items[i].children[0].type=="checkbox"){
        				condition = condition + items[i].children[0].getAttribute("id")+"="+items[i].children[0].value +"&";
        			}else if(items[i].children[0].type=="select-one"){
        				condition = condition + items[i].children[0].getAttribute("id")+"="+items[i].children[0].value +"&";
        			}
    			}    			
    		}
		}
	}
	return condition;
};