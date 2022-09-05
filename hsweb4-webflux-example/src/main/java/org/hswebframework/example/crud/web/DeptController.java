package org.hswebframework.example.crud.web;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.hswebframework.example.crud.entity.DeptEntity;
import org.hswebframework.example.crud.service.DeptService;
import org.hswebframework.web.crud.web.reactive.ReactiveServiceCrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/dept")
@Tag(name = "部门管理")
public class DeptController implements ReactiveServiceCrudController<DeptEntity, String> {

    @Getter
    private final DeptService service;


}
