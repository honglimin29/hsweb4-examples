package org.hswebframework.example.crud.service;

import lombok.AllArgsConstructor;
import org.hswebframework.example.crud.entity.DeptEntity;
import org.hswebframework.web.crud.service.GenericReactiveCrudService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DeptService extends GenericReactiveCrudService<DeptEntity, String> {

}
