package com.ganjiangps.generator.tool.generate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ganjiangps.generator.tool.system.DummyField;
import com.ganjiangps.generator.tool.system.FreemarkerUtils;
import com.ganjiangps.generator.tool.system.Generator;
import com.ganjiangps.generator.tool.system.StringUtils;

/**
 * Action
 * 
 * @author Joe
 */
public class Controller {

	private Map<String, Object> dataMap;

	public Controller(String company, String project, String module, String model, List<DummyField> fieldList,
			boolean containEnable, boolean containDate, String tableComment, String admin) {
		dataMap = new HashMap<String, Object>();
		/** 公司 **/
		dataMap.put("company", company);
		/** 项目 **/
		dataMap.put("project", project);
		/** 模块 **/
		if (StringUtils.isNotBlank(module))
			dataMap.put("module", module);
		/** 模型 **/
		dataMap.put("model", model);
		/** 小写开头模型 **/
		dataMap.put("_model", Generator.getLowerStr(model));
		/** 是否包含启用 **/
		dataMap.put("containEnable", containEnable);
		/** 是否包含Date **/
		dataMap.put("containDate", containDate);
		/** 字段list **/
		dataMap.put("fieldList", fieldList);
		/** 表描述 **/
		dataMap.put("tableComment", tableComment);
		/** 后台管理页 **/
		if (StringUtils.isNotBlank(admin))
			dataMap.put("admin", admin);
	}

	public String getHtml() {
		return FreemarkerUtils.getText("controller.ftl", dataMap);
	}
}
