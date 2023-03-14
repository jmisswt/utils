package com.whty.${projectModel}.platform.client;

import com.whty.${projectModel}.common.Pagination;
import com.whty.${projectModel}.platform.client.bean.${className}Criteria;
import com.whty.${projectModel}.platform.client.bean.${className}DTO;
import com.whty.${projectModel}.platform.client.bean.wrapper.${className}Wrapper;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author jiangwentao
 * @version 1.0.0
 * @ClassName ${className}FeignClient.java
 * @Description feign服务
 * @createTime ${createTime}
 */
@FeignClient(name = "tec-opscloud", path = "/api/${littleClassName}", qualifier = "${littleClassName}FeignClient")
public interface ${className}FeignClient {


    @PostMapping(value = "/save")
    ${className}DTO save(@RequestBody ${className}DTO ${littleClassName}DTO);

    @PostMapping(value = "/findOne/{id}")
     ${className}DTO findOne(@PathVariable("id") Long id);


    @PostMapping(value = "/delete/{id}")
    Boolean delete(@PathVariable("id") Long id);

    @PostMapping(value = "/findByCriteria")
    List<${className}DTO> findByCriteria(@RequestBody ${className}Criteria criteria);

    @PostMapping(value = "/findByCriteriaAndPage")
    Pagination<${className}DTO> findByCriteria(@RequestBody ${className}Wrapper ${littleClassName}Wrapper);



    @PostMapping(value = "/findOne")
    ${className}DTO findOneByCriteria(@RequestBody ${className}Criteria criteria);
}


