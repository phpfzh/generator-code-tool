package com.${company!''}.${project!''}.<#if module??>${module}.</#if>service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.${company!''}.${project!''}.<#if module??>${module}.</#if>model.${model};
import com.${company!''}.${project!''}.<#if module??>${module}.</#if>service.${model}Service;
import com.${company!''}.${project!''}.<#if module??>${module}.</#if>mapper.${model}Mapper;


@Service
public class ${model}ServiceImpl extends ServiceImpl<${model}Mapper,${model}> implements ${model}Service {

}
