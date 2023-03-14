package com.whty.${projectModel}.repository;

import com.whty.${projectModel}.domain.${className};
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;


 /**
   * @author jiangwentao
   * @version 1.0.0
   * @ClassName ${className}QueryService.java
   * @Description Spring Data  repository for the ${className} entity.
   * @createTime ${createTime}
   */
@SuppressWarnings("unused")
@Repository
public interface ${className}Repository extends JpaRepository<${className}, Long>, JpaSpecificationExecutor<${className}> {

}
