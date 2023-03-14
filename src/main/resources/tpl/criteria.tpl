package com.whty.${projectModel}.model;

import java.io.Serializable;
import tech.jhipster.service.Criteria;
import tech.jhipster.service.filter.*;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author jiangwentao
 * @version 1.0.0
 * @ClassName ${className}Criteria.java
 * @Description 基础查询对象
 * @createTime ${createTime}
 */
@Data
@Accessors(chain = true)
public class ${className}Criteria implements Serializable, Criteria {

    private static final long serialVersionUID = 1L;


      <#list fields as field>

       private  ${field.typeFilter} ${field.name};

      </#list>

     public ${className}Criteria(){
     }
   public ${className}Criteria(${className}Criteria other){
        <#list fields as field>
           this.${field.name} = other.${field.name} == null ? null : other.${field.name}.copy();
         </#list>
      }



    @Override
    public ${className}Criteria copy() {
        return new ${className}Criteria(this);
    }

}
