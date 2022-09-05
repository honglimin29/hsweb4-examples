package org.hswebframework.example.crud.entity;

import com.sun.org.glassfish.gmbal.Description;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import org.hswebframework.web.api.crud.entity.GenericEntity;
import org.hswebframework.web.crud.annotation.EnableEntityEvent;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "t_dept")
@Setter
@Getter
@EnableEntityEvent
public class DeptEntity extends GenericEntity<String> {

    @Column(length = 50,nullable = false)
    @Schema(description = "部门名称")
    private String name;


}
