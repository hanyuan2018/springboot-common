package com.common.springboot.web.controller.system.resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.springboot.common.constants.ForwardConstants;

@Controller
@RequestMapping("/resource/")
public class SysResourceController {

	@RequestMapping("listUI")
	public String listUI(Model model) {
		
		return ForwardConstants.SYSTEM + ForwardConstants.RESOURCE + ForwardConstants.LIST;
	}
	
	@RequestMapping("addUI")
	public String addUI(Model model) {
		
		return ForwardConstants.SYSTEM + ForwardConstants.RESOURCE + ForwardConstants.ADD;
	}
	
	@RequestMapping("editUI")
	public String editUI(Model model) {
		
		return ForwardConstants.SYSTEM + ForwardConstants.RESOURCE + ForwardConstants.EDIT;
	}
}
