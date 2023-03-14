package com.whty.${projectModel}.provider;

import com.whty.${projectModel}.commons.data.annotation.RestResultWrapper;
import com.whty.${projectModel}.common.Pagination;
import com.whty.${projectModel}.model.${className}Criteria;
import com.whty.${projectModel}.model.${className}DTO;
import com.whty.${projectModel}.model.wrapper.${className}Wrapper;
import com.whty.${projectModel}.service.${className}QueryService;
import com.whty.${projectModel}.service.${className}Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

 /**
      * @author jiangwentao
      * @version 1.0.0
      * @ClassName ${className}Provider.java
      * @Description 服务提供实现类
      * @createTime ${createTime}
      */
@RestController
@RequestMapping("/api/${littleClassName}")
@Slf4j
@RestResultWrapper
public class ${className}Provider {

    @Autowired
    private ${className}Service ${littleClassName}Service;
    @Autowired
    private ${className}QueryService ${littleClassName}QueryService;

    @PostMapping(value = "/save")
    public ${className}DTO save(@RequestBody ${className}DTO ${littleClassName}DTO) {
        return ${littleClassName}Service.save(${littleClassName}DTO);
    }

    @PostMapping(value = "/findOne/{id}")
    public ${className}DTO findOne(@PathVariable("id") Long id) {
        return ${littleClassName}Service.findOne(id).orElse(null);
    }


    @PostMapping(value = "/delete/{id}")
    public Boolean delete(@PathVariable("id") Long id) {
        ${littleClassName}Service.delete(id);
        return true;
    }

    @PostMapping(value = "/findByCriteria")
    public List<${className}DTO> findByCriteria(@RequestBody ${className}Criteria criteria) {
        return ${littleClassName}QueryService.findByCriteria(criteria);
    }

    @PostMapping(value = "/findByCriteriaAndPage")
    public Pagination<${className}DTO> findByCriteria(@RequestBody ${className}Wrapper ${littleClassName}Wrapper) {
        return ${littleClassName}QueryService.findByCriteria(${littleClassName}Wrapper.getCriteria(), Pagination.pageable(${littleClassName}Wrapper.getPage()));
    }



    @PostMapping(value = "/findOne")
    public ${className}DTO findOneByCriteria(@RequestBody ${className}Criteria criteria) {
        return ${littleClassName}QueryService.findOneByCriteria(criteria);
    }
}


