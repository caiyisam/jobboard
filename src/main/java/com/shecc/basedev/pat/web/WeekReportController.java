package com.shecc.basedev.pat.web;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shecc.basedev.core.web.BaseController;
import com.shecc.basedev.pat.entity.WeekReport;

/** 
 * @ClassName: WeekReportController 
 * @Description: 
 * @author Administrator
 * @date 2014年5月13日 下午1:47:09 
 * @version V1.0   
 *  
 */
@Scope("session")
@Controller
public class WeekReportController extends BaseController<WeekReport> {
	/**
	 * 
	 * @Title: queryCardTemplate 
	 * @Description: 
	 * @return
	 * @throws Exception
	 * @return ModelAndView
	 * @throws
	 */
	@RequestMapping(method=RequestMethod.GET, value="/bizcell/weekreport/{sid}")
	public ModelAndView queryWeekReportBySid(@PathVariable String sid) throws Exception{
		return new ModelAndView("weekreport","",null);
	}
	
}
