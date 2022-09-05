package org.hswebframework.example.crud.web;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.hswebframework.example.crud.entity.DeptEntity;
import org.hswebframework.example.crud.service.DeptService;
import org.hswebframework.web.crud.web.reactive.ReactiveServiceCrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@AllArgsConstructor
@RestController
@RequestMapping("/api/dept")
@Tag(name = "部门管理")
public class DeptController implements ReactiveServiceCrudController<DeptEntity, String> {

    @Getter
    private final DeptService service;

    @RequestMapping("/oneinfo")
    public Mono<String> getInfo(){
        return Mono.just("himan").map(a -> a + "111").map(b -> b + "222");
    }

    @RequestMapping("/multinfo")
    public Flux<String> getMultiInfo(){
        return Flux.just("张三","李四","王五");
    }


    @RequestMapping("/arrayinfo")
    public Flux<Integer> getArrayInfo(){
        Integer[] array = {1,2,3,4};  //数组
        return Flux.fromArray(array);
    }


    @RequestMapping("/listinfo")
    public Flux<Integer> getListInfo(){
        Integer[] array = {1,2,3,4};  //数组
        List<Integer> list = Arrays.asList(array);  //集合
        return Flux.fromIterable(list);
    }


    @RequestMapping("/streaminfo")
    public Flux<Integer> getStreamInfo(){
        Integer[] array = {1,2,3,4};  //数组
        List<Integer> list = Arrays.asList(array);  //集合
        Stream<Integer> stream = list.stream();  //流
        return Flux.fromStream(stream);
    }


}
