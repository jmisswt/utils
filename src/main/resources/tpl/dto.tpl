package com.whty.${projectModel}.service.dto;

import lombok.Data;
import lombok.experimental.Accessors;
import java.time.Instant;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author jiangwentao
 * @version 1.0.0
 * @ClassName ${className}DTO.java
 * @Description 基础对象:${DtoDesc}
 * @createTime ${createTime}
 */
@Data
@Accessors(chain = true)
public class ${className}DTO implements Serializable {


      <#list fields as field>

       private  ${field.type} ${field.name};

      </#list>

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ${className}DTO dto = (${className}DTO) o;
        if (dto.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), dto.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

}
