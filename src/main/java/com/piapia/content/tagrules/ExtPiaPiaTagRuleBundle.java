package com.piapia.content.tagrules;

import org.sitemesh.SiteMeshContext;
import org.sitemesh.content.ContentProperty;
import org.sitemesh.content.tagrules.TagRuleBundle;
import org.sitemesh.content.tagrules.html.ExportTagToContentRule;
import org.sitemesh.tagprocessor.State;

/** 
 * @ClassName: ExtPiaPiaTagRuleBundle 
 * @Description: 
 * @author Administrator
 * @date 2014年5月16日 下午4:32:44 
 * @version V1.0   
 *  
 */
public class ExtPiaPiaTagRuleBundle implements TagRuleBundle {

	/* (non-Javadoc)
	 * @see org.sitemesh.content.tagrules.TagRuleBundle#install(org.sitemesh.tagprocessor.State, org.sitemesh.content.ContentProperty, org.sitemesh.SiteMeshContext)
	 */
	@Override
	public void install(State defaultState, ContentProperty contentProperty,
			SiteMeshContext siteMeshContext) {
		defaultState.addRule("queryarea", new ExportTagToContentRule(contentProperty.getChild("queryarea"), false));	}

	/* (non-Javadoc)
	 * @see org.sitemesh.content.tagrules.TagRuleBundle#cleanUp(org.sitemesh.tagprocessor.State, org.sitemesh.content.ContentProperty, org.sitemesh.SiteMeshContext)
	 */
	@Override
	public void cleanUp(State defaultState, ContentProperty contentProperty,
			SiteMeshContext siteMeshContext) {
	}

}
