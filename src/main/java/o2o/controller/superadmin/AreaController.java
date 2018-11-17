package o2o.controller.superadmin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import o2o.entity.Area;
import o2o.service.AreaService;

@Controller
@RequestMapping("/superadmin")
public class AreaController {
	Logger logger = LoggerFactory.getLogger(AreaController.class);
	@Autowired
	private AreaService areaService;
	
	@RequestMapping(value="/listarea",method=RequestMethod.GET)
	@ResponseBody
	private Map<String,Object> listArea(){
		logger.info("========start============");
		long startTime = System.currentTimeMillis();
		Map<String,Object> modelMap = new HashMap<>();
		List<Area> areaList = new ArrayList<>();
		try {
			areaList = areaService.getAreaList();
			modelMap.put("rows",areaList);
			modelMap.put("total", areaList.size());
			
		}catch(Exception e) {
			e.printStackTrace();
			modelMap.put("success", "false");
			modelMap.put("errMsg", e.toString());
		}
		long endTime = System.currentTimeMillis();
		logger.error("test error");
		logger.debug("costTime[{}ms]",endTime-startTime);
		logger.info("============end==============");
		return modelMap;
	}
}
