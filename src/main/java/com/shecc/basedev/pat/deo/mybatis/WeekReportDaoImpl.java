package com.shecc.basedev.pat.deo.mybatis;

import org.springframework.stereotype.Repository;

import com.shecc.basedev.core.dao.IBatisGenericDaoImpl;
import com.shecc.basedev.pat.dao.WeekReportDao;
import com.shecc.basedev.pat.entity.WeekReport;

/** 
 * @ClassName: WeekReportDaoImpl 
 * @Description: 
 * @author Administrator
 * @date 2014年5月13日 上午11:40:20 
 * @version V1.0   
 *  
 */
@Repository("weekReportDao")
public class WeekReportDaoImpl extends IBatisGenericDaoImpl<WeekReport> implements
		WeekReportDao {

}
