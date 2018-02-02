package com.ganjiangps.generator.tool.generate;

import java.util.HashMap;
import java.util.Map;

import com.ganjiangps.generator.tool.system.DummyField;
import com.ganjiangps.generator.tool.system.FreemarkerUtils;
import com.ganjiangps.generator.tool.system.Generator;

/**
 * 编辑页
 * 
 * @author Joe
 */
public class Edit {

	private Map<String, Object> dataMap;

	public Edit(String tableComment, String model, boolean containEnable, java.util.List<DummyField> fieldList) {
		dataMap = new HashMap<String, Object>();
		/** 公司 **/
		dataMap.put("path", "${_path}");
		/** 项目 **/
		dataMap.put("systemName", "${_systemName}");
		/** 表描述 **/
		dataMap.put("tableComment", tableComment);
		/** 小写开头模型 **/
		dataMap.put("_model", Generator.getLowerStr(model));
		/** 是否包含启用 **/
		dataMap.put("containEnable", containEnable);
		/** 字段list **/
		dataMap.put("fieldList", fieldList);
	}
	
	public String getHtml(){
		return FreemarkerUtils.getText("edit.ftl", dataMap).replace("_&", "$");
	}
}
