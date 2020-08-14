package com.slp.forme.controller;

import com.slp.forme.entity.auto.FormeDefinition;
import com.slp.forme.service.IFormeDefinitionService;
import oracle.sql.BLOB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName FormeDefinitionController
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/14 14:34
 * @Version 1.0
 **/
@RestController
@RequestMapping("/forme-definition")
public class FormeDefinitionController {
    @Autowired
    private IFormeDefinitionService formeDefinitionService;

    @GetMapping("/selectData")
    public Object selectDate(Model model){
        FormeDefinition formeDefinition = new FormeDefinition();
        formeDefinition.setId(System.currentTimeMillis()+"");
        formeDefinition.setColoumRef("1");
        formeDefinition.setInterfaceName("test");

        formeDefinitionService.save(formeDefinition);
       return "1";

    }
}
