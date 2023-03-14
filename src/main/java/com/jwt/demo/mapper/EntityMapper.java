package com.jwt.demo.mapper;

import org.springframework.data.domain.Page;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description: 分页信息转换，D：dto，自定义数据bean，E：entity，数据库对象bean
 */
public interface EntityMapper<D, E> {

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");

    E toEntity(D dto);

    D toDto(E entity);

    List<E> toEntity(List<D> dtoList);

    List<D> toDto(List<E> entityList);

    E cloneEntity(E entity);

    default MyPaging<D> toDto(Page<E> page) {
        MyPaging<D> myPaging = new MyPaging<>();
        myPaging.setTotalElements(page.getTotalElements())
                .setTotalPages(page.getTotalPages())
                .setFirst(page.isFirst())
                .setLast(page.isLast())
                .setNumber(page.getNumber())
                .setSize(page.getSize())
                .setNumberOfElements(page.getNumberOfElements());
        List<D> dtos = page.getContent().stream().map(this::toDto).collect(Collectors.toList());
        return myPaging.setContent(dtos);
    }


/*    default MyPaging<E> toEntity(Page<D> page) {
        MyPaging<E> myPaging = new MyPaging<>();
        myPaging.setTotalElements(page.getTotalElements())
                .setTotalPages(page.getTotalPages())
                .setFirst(page.isFirst())
                .setLast(page.isLast())
                .setNumber(page.getNumber())
                .setSize(page.getSize())
                .setNumberOfElements(page.getNumberOfElements());
        List<E> entitys = page.getContent().stream().map(this::toEntity).collect(Collectors.toList());
        return myPaging.setContent(entitys);
    }

    default MyPaging<D> toDto(MyPaging<E> page) {
        MyPaging<D> myPaging = new MyPaging<>();
        myPaging.setTotalElements(page.getTotalElements())
                .setTotalPages(page.getTotalPages())
                .setFirst(page.isFirst())
                .setLast(page.isLast())
                .setNumber(page.getNumber())
                .setSize(page.getSize())
                .setNumberOfElements(page.getNumberOfElements());
        List<D> dtos = page.getContent().stream().map(this::toDto).collect(Collectors.toList());
        return myPaging.setContent(dtos);
    }*/

    default String map(Instant instant) {
        return LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).format(dtf);
    }

    default Instant map(String instant) {
        return LocalDateTime.parse(instant, dtf).atZone(ZoneId.of("CTT", ZoneId.SHORT_IDS)).toInstant();
    }

    default LocalDateTime instantToLocalDateTime(Instant instant) {
        return instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    default Instant localDateTimeToInstant(LocalDateTime localDateTime) {
        return localDateTime.atZone(ZoneId.systemDefault()).toInstant();
    }
}

