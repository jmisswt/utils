package com.whty.${projectModel}.service.mapper;

import com.whty.${projectModel}.domain.${className};
import com.whty.${projectModel}.service.dto.${className}DTO;
import org.mapstruct.*;

 /**
  * @author jiangwentao
  * @version 1.0.0
  * @ClassName ${className}Mapper.java
  * @Description Mapper for the entity {${className}} and its DTO { ${className}DTO}.
  * @createTime ${createTime}
  */
@Mapper(componentModel = "spring", uses = {})
public interface ${className}Mapper extends EntityMapper<${className}DTO, ${className}> {



    default ${className} fromId(Long id) {
        if (id == null) {
            return null;
        }
        ${className}  ${littleClassName} = new ${className}();
        ${littleClassName}.setId(id);
        return ${littleClassName};
    }
}
